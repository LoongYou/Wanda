package com.cod.wanda.flow;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cod.exception.CODException;
import com.cod.functions.Text;
import com.cod.util.FileUtil;
import com.cod.util.Log;
import com.cod.wanda.commons.constants.FieldCollocations.Doc;
import com.cod.wanda.commons.constants.FieldCollocations.HtmlPage;
import com.cod.wanda.commons.constants.FieldCollocations.Shape;
import com.cod.wanda.commons.constants.OptionCollocations.UserOptions;
import com.cod.wanda.util.StringMap;

import visiotool.ClassFactory;
import visiotool.IVApplication;
import visiotool.IVDocument;
import visiotool.IVDocuments;
import visiotool.IVHyperlink;
import visiotool.IVHyperlinks;
import visiotool.IVPage;
import visiotool.IVPages;
import visiotool.IVShape;
import visiotool.IVShapes;

public class ExecuteFlow {
	
	private static IVDocument lastDoc; 
	private static String lastPath;
	private static List<IVPage> lastPages;
	public static final String Swimlane_vertical= "Swimlane (vertical)";
	public static final String Separator_vertical= "Separator (vertical)";
	public static final String JavascriptVarsAnchor = "//javascriptVarsAnchor";
	public static final String SvgContentAnchor = "<!-- svgContentAnchor -->";
	
	/**正在执行的信号量 0：空闲  1：正在执行，此时某些流程或交互务必阻塞或降级*/
	private volatile static int executeFlag;
	public static final int Standy = 0;
	public static final int Executing = 1;
	
	/**
	 * 获取visio文档对象
	 * @param config
	 * @return
	 * @throws CODException 
	 */
	public static IVDocument getDoc(StringMap config) throws CODException {
		if(executeFlag==1) {
			throw new CODException("程序 正忙");
		}
		StringMap docConfig = new StringMap();
		String path = config.get(UserOptions.sourceFilePath);
		if(lastPath==null) {
			lastPath = path;
		}else if(lastPath.equals(path)) {
			if(lastDoc!=null) {
				return lastDoc;
			}
		}

		// 创建Visio对象
		IVApplication app = ClassFactory.createApplication();
		// Visio对象设置为可见
		app.visible(true);
		// 打开一个Visio文件
		IVDocuments docs = app.documents();
		IVDocument doc = docs.open(path);
		docConfig.put(Doc.path, doc.path());
		docConfig.put(Doc.name, doc.name());
		docConfig.put(Doc.creator, doc.creator());
		docConfig.put(Doc.alternateNames, doc.alternateNames());
		Log.info("document has opened");
		
		lastDoc = doc;
		config.merge(docConfig, false);
		return doc;
	}
	
	/**
	 * 获取页面列表
	 * @param config
	 * @return
	 */
	public static List<IVPage> getPages(StringMap config){
		if(lastDoc==null) {
			return null;
		}
		IVPages pages = lastDoc.pages();
		int pageCount = pages.count();
		if (pages != null) {
			config.put(Doc.pageCount, String.valueOf(pageCount));
		}
		
		List<IVPage> pageList = new ArrayList<>();
		for(int i = 1;i<=pageCount;i++) {
			pageList.add(pages.itemU(i));
		}
		lastPages = pageList;
		return pageList;
	}
	
	/**
	 * 将页面列表转换为有序map
	 * @param config
	 * @return
	 */
	public static Map<String,Integer> getPageMap(List<IVPage> pages){
		
		Map<String,Integer> pageMap = new TreeMap<>();
		for(IVPage page:pages) {			
			pageMap.put(page.name(), pages.indexOf(page));
		}
		return pageMap;
	}
	
	/**
	 * 获取页面中泳道id列表
	 * @param page
	 * @return
	 */
	public static List<Integer> getVisioSwimlanShapMIDList(IVPage page) {
		//获取page下的所有shape
		IVShapes shapes = page.shapes();
		int shapeCount = shapes.count();
		Log.info("shapeCount="+shapeCount);
		List<Integer> swimlane_verticals = new ArrayList<>();
		// 遍历该Page对象中所有的Shape对象
		for (int i = 1; i <= shapeCount; i++) {
			IVShape shape = shapes.itemU(i);
			StringMap shapeInfo = getVisioShapeInfo(shape);
			String nameU = shapeInfo.get(Shape.nameU);
			if(nameU.startsWith(Swimlane_vertical) && 
					(shapeInfo.get(Shape.id).equals("1") || nameU.length()>Swimlane_vertical.length())) {
				Log.info("get swimlane_verticals="+shapeInfo.get(Shape.id));
				swimlane_verticals.add(Integer.parseInt(shapeInfo.get(Shape.id)));
			}
		}
		return swimlane_verticals;
	}
	
	/**
	 * 获取页面阶段id列表
	 * @param page
	 * @return
	 */
	public static List<Integer> getVisioPhaseShapMIDlist(IVPage page) {
		//获取page下的所有shape
		IVShapes shapes = page.shapes();
		int shapeCount = shapes.count();
		Log.info("shapeCount="+shapeCount);
		List<Integer> separator_verticals = new ArrayList<>();
		// 遍历该Page对象中所有的Shape对象
		for (int i = 1; i <= shapeCount; i++) {
			IVShape shape = shapes.itemU(i);
			StringMap shapeInfo = getVisioShapeInfo(shape);
			String nameU = shapeInfo.get(Shape.nameU);
			if(nameU.startsWith(Separator_vertical) && 
					(shapeInfo.get(Shape.id).equals("1") || nameU.length()>Separator_vertical.length())) {
				Log.info("get separator_verticals="+shapeInfo.get(Shape.id));
				separator_verticals.add(Integer.parseInt(shapeInfo.get(Shape.id)));
			}
		}
		return separator_verticals;
	}
	
	
	public static StringMap getVisioShapeInfo(IVShape shape) {

		/*获取shap必要的信息,这些信息用于支持展示流程图的时候html页面执行的操作，如超链接、上一个节点、下一个节点、甚至是修改节点文本、超链接等等
		* 这些信息包括：
		* 模型坐标
		* 模型大小
		* 模型ID
		* 模型文本
		* 模型超链接
		* 模型引入对象
		* 模型引出对象
		*/
		
		StringMap shapeInfo = new StringMap();
		
		shapeInfo.put(Shape.text, shape.text());
		shapeInfo.put(Shape.id, String.valueOf(shape.id()));
		shapeInfo.put(Shape.id16, String.valueOf(shape.iD16()));
		shapeInfo.put(Shape.name, shape.name());
		shapeInfo.put(Shape.nameId, shape.nameID());
		shapeInfo.put(Shape.nameU, shape.nameU());
		shapeInfo.put(Shape.PinX, String.valueOf(shape.cells("PinX").resultIU() * 96));
		shapeInfo.put(Shape.PinY, String.valueOf(shape.cells("PinY").resultIU() * 96));
		shapeInfo.put(Shape.Width, String.valueOf(shape.cells("Width").resultIU() * 96));
		shapeInfo.put(Shape.Height, String.valueOf(shape.cells("Height").resultIU() * 96));
		shapeInfo.put(Shape.index, String.valueOf(shape.index()));
		shapeInfo.put(Shape.index16, String.valueOf(shape.index16()));
		IVHyperlinks hypers = shape.hyperlinks();
		short hcount = hypers.count();
		if(hcount>0) {
			IVHyperlink item = hypers.item(0);
			shapeInfo.put(Shape.hyerLinkAddress, item.address());
			shapeInfo.put(Shape.hyerLinkDescription, item.address());
			shapeInfo.put(Shape.hyerLinkSubAddress, item.subAddress());
		}
		return shapeInfo;
	}
	
	
	/**
	 * 工序：将参数或标签文本插入到html文本指定位置中
	 * @param config
	 * @param html
	 * @return
	 */
	public static String htmlPageStage(StringMap config,String html){
		StringMap htmlPageConfig = new StringMap();
		htmlPageConfig.put(JavascriptVarsAnchor, config.get(HtmlPage.javascriptVars));
		htmlPageConfig.put(SvgContentAnchor, config.get(HtmlPage.visioSvgContent));
		Text.Insert.StringMap.apply(html, htmlPageConfig);
		return Text.Insert.StringMap.apply(html, htmlPageConfig);
	}
	
	/**
	 * 计算一个页面中的泳道标题id
	 * 
	 * @param page
	 * @return
	 */
	public static List<Integer> computeSwimlanTitleIndex(IVPage page) {
		List<Integer> list = getVisioSwimlanShapMIDList(page);
		Log.info(list);
		List<Integer> comlist = new ArrayList<>();
		list.forEach(id -> {
			comlist.add(Integer.sum(id.intValue(), 2));
		});
		return comlist;
	}

	/**
	 * 计算一个页面中的阶段标题id
	 * 
	 * @param page
	 * @return
	 */
	public static List<Integer> computePhaseTitleIndex(IVPage page) {
		List<Integer> list = getVisioPhaseShapMIDlist(page);
		Log.info(list);
		List<Integer> comlist = new ArrayList<>();
		list.forEach(id -> {
			comlist.add(Integer.sum(id.intValue(), 2));
		});
		return comlist;
	}

	/**
	 * 构建一个html页面中JavaScript脚本使用的变量定义字符串
	 * @param page
	 * @return
	 */
	public static String buildJavaScriptVar(IVPage page) {
		List<Integer> list1 = computeSwimlanTitleIndex(page);
		List<Integer> list2 = computePhaseTitleIndex(page);	
		String var1 = "var visioSwimlanShapMIDList = "+list1.toString();
		String var2 = "var visioPhaseShapMIDlist = "+list2.toString();
		Log.info(var1);
		Log.info(var2);
		StringBuilder sb = new StringBuilder();
		sb.append(var1).append(";\n").append(var2).append(";\n");
		return sb.toString();
	}
	
	/**
	 * 将当前选择的页面导出为svg，并内联到html文件后另存
	 * @param dir 输出文件夹路径
	 * @return
	 * @throws CODException
	 * @throws IOException
	 */
	public static void saveVisioToSvg(String dir) throws CODException, IOException {
		try {
			if (executeFlag == Executing) {
				throw new CODException("程序 正忙");
			}
			if (lastPages == null || lastPages.size() == 0) {
				throw new CODException("lastPages is empty");
			}
			if (lastDoc == null) {
				throw new CODException("doc is null");
			}
			String docName = lastDoc.name();
			String dirName = null;
			if (docName.endsWith(".vsd")) {
				dirName = docName.substring(0, docName.indexOf(".vsd"));
			}
			if (docName.endsWith(".vsdx")) {
				dirName = docName.substring(0, docName.indexOf(".vsdx"));
			}
			// 在输出目录中创建源vsd文件对应的文件夹
			String svgDir = dir + "\\" + dirName + "\\svg\\";
			String htmlDir = dir + "\\" + dirName + "\\html\\";
			Log.info("svgDir=" + svgDir);
			// 创建svg文件夹
			FileUtil.createDir(svgDir);
			// 创建html文件夹
			FileUtil.createDir(htmlDir);
			executeFlag = Executing;
			// 耗时操作，综合考虑还是暂定hold线程，因为桌面程序多线程会大大增加交互控制复杂度
			for (IVPage page : lastPages) {
				String svgFilePath = svgDir + "\\" + page.name() + ".svg";
				String htmlFilePath = htmlDir + "\\" + page.name() + ".html";
				Log.info(svgFilePath);
				// 将当前page保存为svg到对应的目录下
				page.export(svgFilePath);
				// 生成参数
				String javaScriptVar = buildJavaScriptVar(page);
				Log.info(javaScriptVar);
				// 读取已导出的svg文件
				String svgContent = FileUtil.readBufferByLine(new File(svgFilePath));
				Log.debug(svgContent);
				// 读取html模板
				String htmlContent = FileUtil.readBufferByLine(new File(ConfigFlow.userDir + ConfigFlow.pageModulePath));
				//Log.debug(htmlContent);
				// 插入参数和元素
				StringMap config = new StringMap();
				config.put(HtmlPage.javascriptVars, javaScriptVar);
				config.put(HtmlPage.visioSvgContent, svgContent);
				String html = htmlPageStage(config, htmlContent);
				//Log.debug(html);
				FileUtil.createFile(htmlFilePath);
				//写入html
				FileUtil.write(new File(htmlFilePath), html);
			}
		} finally {
			executeFlag = Standy;
		}
	}
	
	
}
