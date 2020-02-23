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
import com.cod.wanda.commons.constants.FieldCollocations.Doc;
import com.cod.wanda.commons.constants.OptionCollocations.UserOptions;
import com.cod.wanda.commons.functions.STR;
import com.cod.wanda.util.Produce;
import com.cod.wanda.util.StringMap;

import visiotool.ClassFactory;
import visiotool.IVApplication;
import visiotool.IVDocument;
import visiotool.IVPage;
import visiotool.IVPages;

public class Main implements Log{
	
	static String defProgramHome = "\\Wanda";
	
	static String propertiesFileName = "Wanda.properties";
	
	static String userDir = System.getProperty("user.dir");
	
	/**程序配置*/
	private StringMap proConfig;
	
	
	private Home home;
	private ScrollTextArea textArea;
	
	public static void main(String[] args) throws CODException {
	
		Main main = new Main();
		main.startFlow();
		main.docFlow(main.proConfig,main.getDocument(main.proConfig.get(UserOptions.sourceFilePath)));
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
	public Produce<IVDocument> docFlow(StringMap config,IVDocument doc) {
		StringMap docConfig = new StringMap();
		try {
			if(config==null) {
				return Produce.out(doc, Failed);
			}
			if(doc==null) {				
				String sourceFilePath = config.get(UserOptions.sourceFilePath);
				doc = getDocument(sourceFilePath);
			}
			IVPages pages = doc.pages();
			short pageCount = pages.count();
			docConfig.put(Doc.name,doc.name());
			docConfig.put(Doc.pageCount, String.valueOf(pageCount));
			docConfig.put(Doc.alternateNames,doc.alternateNames());
			docConfig.put(Doc.creator,doc.creator());
			docConfig.put(Doc.path, doc.path());
			if(docConfig.match(UserOptions.applyPage,UserOptions.applyPage_all)) {
				
			}else {
				String itmeIndex = proConfig.getString(UserOptions.applyPage);
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
		return Produce.out(docConfig, doc);
	}
	
	/**
	 * 页面工作流
	 * @return
	 */
	public StringMap pageFlow(StringMap config) {
		
		
		
		
		return config;
		
	}
	
	
	
	/**
	 * 读取本地配置
	 * @return
	 */
	public StringMap getLocalConfig() {
		StringMap config = new StringMap();
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
	
	
}
