package com.cod.wanda;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import com.cod.exception.CODException;
import com.cod.ui.general.Home;
import com.cod.ui.general.ScrollTextArea;
import com.cod.util.FileUtil;
import com.cod.util.Log;
import com.cod.util.PropertiesUtil;
import com.cod.wanda.commons.constants.Collocations;
import com.cod.wanda.commons.constants.Options;
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
	
	static String defProgramHome = "\\Wanda";
	
	static String propertiesFileName = "Wanda.properties";
	
	static String userDir = System.getProperty("user.dir");
	
	private Home home;
	private ScrollTextArea textArea;
	
	public static void main(String[] args) {
		
		new Main().workFlow();
		
	}
	
	/**
	 * 初始化UI
	 * @return
	 */
	public int initUi() {
		Info("initUi......");
		home = new Home();
		textArea = new ScrollTextArea();
		home.add(textArea);
		textArea.append("initUi finish!");
		return Sucess;
	}
	
	
	public int workFlow() {
		initUi();
		List<String> dependenetFiles = initDependenetFiles();
		List<String> localFiles = checkLocalFile(dependenetFiles);
		if(localFiles.size()>0) {
			textArea.append("Dependent File not exist,files="+localFiles);
			Log.error("Dependent File not exist,files=",localFiles);
		}
		initLocalFile(localFiles);
		
		
		ParamMap<String> config = getLocalConfig();
		IVDocument doc = getDocument(filePath);
		IVPages pages = doc.pages();
		short pageCount = pages.count();
		config.put(F_PageCount, String.valueOf(pageCount));
		
		if(config.match(O_ApplyPage, S_ApplyAllPage)) {
			
		}else {
			String itmeIndex = config.getString(O_ApplyPage);
			Log.info(STR.Verify.Digit.apply(itmeIndex));
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
		Properties properties = PropertiesUtil.getProperties(userDir+"\\"+propertiesFileName);
		PropertiesUtil.propertiesToMap(properties, config, true);
		return config;
	}
	
	/**
	 * 检查本地文件
	 * @param dependenetFileList
	 * @return
	 */
	public List<String> checkLocalFile(List<String> dependenetFileList) {
		Info("userDir=",userDir);
		List<File> fileList = FileUtil.searchFile(userDir,"");
		List<String> list = dependenetFileList.stream().filter(
				name->{
					Info("search userDir fileList......");
					for(File file:fileList) {
						Info(file.getName());
						if(file.getName().equals(name)) {
							return false;
						}
					}
					return true;
				})
				.collect(Collectors.toList());
		return list;
	}
	
	
	/**
	 * 初始化本地文化
	 * @param list
	 * @return 
	 * @return
	 */
	public int initLocalFile(List<String> list) {
		list.forEach(name->{
			try {
				FileUtil.createFile(filePath);
			} catch (IOException e) {
				Error("create file error",e);
				return;
			}
		});
		return Sucess;
	}
	
	/**
	 * 初始化依赖文件
	 * @return
	 */
	public List<String> initDependenetFiles() {
		List<String> dependenetFiles = new ArrayList<>();
		dependenetFiles.add(propertiesFileName);
		return dependenetFiles;
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
