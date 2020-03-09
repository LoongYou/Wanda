package com.cod.wanda.flow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cod.util.Log;
import com.cod.wanda.commons.constants.FieldCollocations.Doc;
import com.cod.wanda.commons.constants.OptionCollocations.UserOptions;
import com.cod.wanda.util.StringMap;

import visiotool.ClassFactory;
import visiotool.IVApplication;
import visiotool.IVDocument;
import visiotool.IVDocuments;
import visiotool.IVPage;
import visiotool.IVPages;

public class ExecuteFlow {
	
	private static IVDocument lastDoc; 
	private static String lastPath;
	private static List<IVPage> lastPages;
	
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
	
}
