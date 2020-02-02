package com.cod.wanda;

import java.util.Properties;

import com.cod.util.FileUtil;
import com.cod.util.Log;
import com.cod.util.PropertiesUtil;
import com.cod.wanda.commons.constants.Collocations;
import com.cod.wanda.commons.constants.Options;
import com.cod.wanda.commons.constants.Switch;
import com.cod.wanda.commons.functions.STR;
import com.cod.wanda.util.ParamMap;

import visiotool.ClassFactory;
import visiotool.IVApplication;
import visiotool.IVDocument;
import visiotool.IVPage;
import visiotool.IVPages;

public class Main implements Log,Collocations,Options{
	//vsd vsdx文件路径
	static String filePath = "D:\\javaTest\\demo.vsdx";
	//输出文件夹
	static String outputDir = "D:\\javaTest\\output";
	
	static String programHome = "\\Wanda";
	
	static String propertiesName = "Wanda.properties";
	
	static String userDir = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		
		new Main().getDocument(filePath);
		
	}
	
	
	public int workFlow() {
		ParamMap<String> config = getLocalConfig();
		IVDocument doc = getDocument(filePath);
		IVPages pages = doc.pages();
		short pageCount = pages.count();
		config.put(Collocations.K_pageCount, String.valueOf(pageCount));
		
		if(config.match(K_applyPage, Switch.applyAllPage)) {
			
		}else {
			String itmeIndex = config.getString(Options.K_applyPage);
			if(STR.Verify.Digit.apply(itmeIndex)) {
				int pageIndex = Integer.parseInt(itmeIndex);
				if(pageIndex<pageCount) {
					page2svg(pages.item(pageCount));
				}
			}
		}
		
		return Sucess;
	}
	
	
	public int page2svg(IVPage page) {
		
		
		
		
		return Sucess;
	}
	
	public ParamMap<String> getLocalConfig() {
		ParamMap<String> config = new ParamMap<>();
		Properties properties = PropertiesUtil.getProperties(userDir+programHome);
		PropertiesUtil.propertiesToMap(properties, config, true);
		return config;
	}
	
	public int init() {
		FileUtil.searchFile(userDir+programHome, endsWith);
	}
	
	
	
	public IVDocument getDocument(String filePath) {
		Info("filePath=",filePath);
		// 创建Visio对象
		IVApplication app = ClassFactory.createApplication();
		// Visio对象设置为可见
		app.visible(true);			
		// 打开一个Visio文件
		IVDocument doc = app.documents().open(filePath);
		Info("document has opened");
		return doc;
	}
	
	
	
}
