package com.cod.wanda;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import com.cod.exception.CODException;
import com.cod.ui.general.ScrollTextArea;
import com.cod.util.FileUtil;
import com.cod.util.Log;
import com.cod.util.PropertiesUtil;
import com.cod.wanda.stages.HtmlStages;
import com.cod.wanda.stages.VisioStages;
import com.cod.wanda.ui.MainWindow;
import com.cod.wanda.util.StringMap;

import visiotool.ClassFactory;
import visiotool.IVApplication;
import visiotool.IVDocument;

public class Main implements Log,VisioStages,HtmlStages{
	
	static String defProgramHome = "\\COD\\Wanda";
	
	static String propertiesFileName = "Wanda.properties";
	
	static String userDir = System.getProperty("user.dir");
	
	/**程序配置*/
	private StringMap proConfig;
	private static MainWindow mainWindow;
	private static ScrollTextArea textArea;
	
	public static void main(String[] args) throws CODException {
	
		Main main = new Main();
		main.startFlow();
		//main.docStages(main.proConfig,main.getDocument(main.proConfig.get(UserOptions.sourceFilePath)));
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
		mainWindow = new MainWindow();
		textArea = MainWindow.logTextArea;
		return Sucess;
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
	
	
}
