package com.cod.wanda;

import java.io.File;
import java.util.List;
import java.util.Map;

import com.cod.exception.CODException;
import com.cod.ui.general.ScrollTextArea;
import com.cod.util.Log;
import com.cod.wanda.commons.constants.OptionCollocations.UserOptions;
import com.cod.wanda.flow.ConfigFlow;
import com.cod.wanda.flow.ExecuteFlow;
import com.cod.wanda.stages.HtmlStages;
import com.cod.wanda.stages.VisioStages;
import com.cod.wanda.ui.MainWindow;
import com.cod.wanda.util.Produce;
import com.cod.wanda.util.StringMap;

import visiotool.IVPage;

public class Main implements Log,VisioStages,HtmlStages{
	
	/**程序配置*/
	private static StringMap proConfig;
	private static MainWindow mainWindow;
	private static ScrollTextArea textArea;
	
	public static final String msg = "msg";
	
	
	public static void main(String[] args) throws CODException {
	
		Main main = new Main();
		main.startup();
		//main.docStages(main.proConfig,main.getDocument(main.proConfig.get(UserOptions.sourceFilePath)));
	}
	
	/**
	 * 启动工作流
	 * @return
	 * @throws CODException
	 */
	public void startup() throws CODException {
		try {
			initUi();
			textArea.append("启动工作流 start...");
			List<String> dependenetFiles = ConfigFlow.initDependenetFiles();
			List<String> localFiles = ConfigFlow.checkLocalFile(dependenetFiles);
			if(localFiles.size()>0) {
				textArea.append("依赖文件不存在:"+localFiles);
			}
			ConfigFlow.initLocalFile(localFiles);
			proConfig = ConfigFlow.getLocalConfig();
			textArea.append("启动工作流 finish...");
		}catch(CODException e) {
			textArea.appendEx("启动工作流异常", e);
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
	 * 打开文件
	 * @param path
	 * @throws CODException
	 */
	public static Produce<Void> openFile(String path) {
		StringMap config = new StringMap();
		try {
			if(!path.endsWith(".vsd") && !path.endsWith(".vsdx")) {
				throw new CODException("请选择.vsd或.vsdx文件");
			}
			File file = new File(path);
			if(!file.exists() || file.isDirectory()) {
				throw new CODException("选择的文件不是存在或者不是一个文件");
			}
			textArea.append("打开文件："+path);
			proConfig.put(UserOptions.sourceFilePath, path);
			ExecuteFlow.getDoc(proConfig);
			return Produce.out(null,Sucess);
		}catch(CODException e) {
			config.put(msg, e.toString());
			textArea.appendEr("打开文件异常", e);
		}catch(Exception e) {
			config.put(msg, e.toString());
			textArea.appendEr("打开文件异常", e);
		}
		return Produce.out(config, null,Failed);
	}
	
	/**
	 * 获取页面信息
	 * @return
	 */
	public static Produce<Map<String, Integer>> getPagesInfo() {
		StringMap config = new StringMap();
		try {
			List<IVPage> pages = ExecuteFlow.getPages(config);
			Map<String, Integer> map = ExecuteFlow.getPageMap(pages);
			return Produce.out(config, map,Sucess);
		}catch(Exception e) {
			Log.info(config);
			config.put(msg, e.toString());
			textArea.appendEr("获取页面异常", e);
		}
		return Produce.out(config, null,Failed);
	}
	
}
