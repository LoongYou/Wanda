package com.cod.wanda;

import java.awt.BorderLayout;
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
import com.cod.wanda.commons.constants.Collocations.Doc;
import com.cod.wanda.commons.constants.Options;
import com.cod.wanda.commons.functions.STR;
import com.cod.wanda.util.ParamMap;

import visiotool.ClassFactory;
import visiotool.IVApplication;
import visiotool.IVDocument;
import visiotool.IVPage;
import visiotool.IVPages;

public class Main implements Log,Options{
	
	static String defProgramHome = "\\Wanda";
	
	static String propertiesFileName = "Wanda.properties";
	
	static String userDir = System.getProperty("user.dir");
	
	/**程序配置*/
	private ParamMap<String> proConfig;
	
	
	private Home home;
	private ScrollTextArea textArea;
	
	public static void main(String[] args) throws CODException {
	
		Main main = new Main();
		main.startFlow();
		main.docFlow(null);
	}
	
	/**
	 * 启动工作流
	 * @return
	 * @throws CODException
	 */
	public void startFlow() throws CODException {
		try {
			initUi();
			textArea.append("启动工作流 start...");
			List<String> dependenetFiles = initDependenetFiles();
			List<String> localFiles = checkLocalFile(dependenetFiles);
			initLocalFile(localFiles);
			proConfig = getLocalConfig();
			textArea.append("启动工作流 finish...");
		}catch(Exception e) {
			textArea.appendEx("启动工作流异常", e);
		}
	}
	

	/**
	 * 初始化UI
	 * @return
	 */
	public int initUi() {
		Info("初始化UI start...");
		home = new Home();
		textArea = new ScrollTextArea();
		home.add(textArea,BorderLayout.NORTH);
		textArea.append("初始化UI finish");
		return Sucess;
	}

	/**
	 * 文档工作流
	 * @param config
	 * @return
	 */
	public ParamMap<String> docFlow(ParamMap<String> config) {
		try {
			//创建文档配置
			ParamMap<String> docConfig = new ParamMap<>();
			IVDocument doc = getDocument(proConfig.get(O_SourceFilePath));
			IVPages pages = doc.pages();
			short pageCount = pages.count();
			docConfig.put(Doc.PageCount, String.valueOf(pageCount));
			
			if(docConfig.match(O_ApplyPage, S_ApplyAllPage)) {
				
			}else {
				String itmeIndex = proConfig.getString(O_ApplyPage);
				Info(STR.Verify.Digit.apply(itmeIndex));
				if(STR.Verify.Digit.apply(itmeIndex)) {
					int pageIndex = Integer.parseInt(itmeIndex);
					if(pageIndex<pageCount) {
						page2svg(pages.item(pageCount));
					}
				}
			}
		}catch(Exception e) {
			Error("文档工作流执行异常：",e);
			
		}
		return proConfig;
		
		
	}
	
	
	
	/**
	 * 读取本地配置
	 * @return
	 */
	public ParamMap<String> getLocalConfig() {
		ParamMap<String> config = new ParamMap<>();
		Properties properties;
		try {
			properties = PropertiesUtil.getProperties(userDir+"\\"+propertiesFileName);
			PropertiesUtil.propertiesCopyToMap(properties, config, true);
		} catch (IOException e) {
			Error("获取本地配置失败，将使用默认配置",e);
		}
		return config;
	}
	
	/**
	 * 检查本地文件,是否缺少依赖的文件，并返回缺少的文件列表
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
		if(list.size()>0) {
			textArea.appendEr("依赖文件不存在:"+list);
		}
		return list;
	}
	
	
	/**
	 * 初始化本地文件
	 * @param list
	 * @return 
	 * @return
	 */
	public int initLocalFile(List<String> list) {
		Info("初始化本地文件:"+list);
		list.forEach(name->{
			try {
				FileUtil.createFile(userDir+"\\"+name);
			} catch (IOException e) {
				Error("初始化本地配置文件失败："+name,e);
			}
		});
		Info("初始化本地文件 finish");
		return Sucess;
	}
	
	/**
	 * 初始化依赖文件列表
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

	public int page2svg(IVPage page) {
		
		return Sucess;
	}
	
	
	
}
