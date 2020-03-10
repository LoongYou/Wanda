package com.cod.wanda.flow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cod.exception.CODException;
import com.cod.util.Log;
import com.cod.util.RSC;
import com.cod.wanda.commons.constants.FieldCollocations.Doc;
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
	
	/**
	 * 获取visio文档对象
	 * @param config
	 * @return
	 */
	public static IVDocument getDoc(StringMap config) {
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
		List<Integer> Swimlane_verticals = new ArrayList<>();
		// 遍历该Page对象中所有的Shape对象
		for (int shapeCount = 1; shapeCount <= shapes.count(); shapeCount++) {
			IVShape shape = shapes.itemU(shapeCount);
			StringMap shapeInfo = getVisioShapeInfo(shape);
			if(Swimlane_vertical.equals(shapeInfo.get(Shape.nameU))) {
				Swimlane_verticals.add(Integer.parseInt(shapeInfo.get(Shape.id)));
			}
		}
		return Swimlane_verticals;
	}
	
	/**
	 * 获取页面阶段id列表
	 * @param page
	 * @return
	 */
	public static List<Integer> getVisioPhaseShapMIDlist(IVPage page) {
		//获取page下的所有shape
		IVShapes shapes = page.shapes();
		List<Integer> separator_verticals = new ArrayList<>();
		// 遍历该Page对象中所有的Shape对象
		for (int shapeCount = 1; shapeCount <= shapes.count(); shapeCount++) {
			IVShape shape = shapes.itemU(shapeCount);
			StringMap shapeInfo = getVisioShapeInfo(shape);
			if(Separator_vertical.equals(shapeInfo.get(Shape.nameU))) {
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
	
	
	public static int executeVsds() throws CODException {		
		if (lastPages == null || lastPages.size() == 0) {
			throw new CODException("lastPages is empty");
		}
		for (IVPage page : lastPages) {
			List<Integer> list1 = getVisioSwimlanShapMIDList(page);
			Log.info(list1);
			List<Integer> list2 = getVisioPhaseShapMIDlist(page);
			Log.info(list2);
		}
		return RSC.Sucess;
	}
	
}
