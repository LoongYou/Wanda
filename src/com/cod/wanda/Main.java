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
import com.cod.wanda.ui.MainWindow;
import com.cod.wanda.util.Produce;
import com.cod.wanda.util.StringMap;

import visiotool.IVPage;

public class Main implements Log{
	
	/**程序配置*/
	private static StringMap proConfig;
	private static MainWindow mainWindow;
	private static ScrollTextArea textArea;
	
	public static final String msg = "msg";
	
	
	public static void main(String[] args) throws CODException {
	
		Main main = new Main();
		main.startup();
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
		}catch(Exception | CODException e) {
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
				Log.errorEx("请选择.vsd或.vsdx文件");
			}
			File file = new File(path);
			if(!file.exists() || file.isDirectory()) {
				Log.errorEx("选择的文件不存在或者不是一个文件");
			}
			textArea.append("打开文件："+path);
			proConfig.put(UserOptions.sourceFilePath, path);
			ExecuteFlow.getDoc(proConfig);
		}catch(Exception | CODException e) {
			config.put(msg, e.toString());
			Log.error(config);
			textArea.appendEr("打开文件异常", e);
			return Produce.out(config, null,Failed);
		}
		return Produce.out(null,Sucess);
	}
	
	/**
	 * 获取页面信息
	 * @return
	 */
	public static Produce<Map<String, Integer>> getPagesInfo() {
		StringMap config = new StringMap();
		Map<String, Integer> map =null;
		try {
			List<IVPage> pages = ExecuteFlow.getPages(config);
			map = ExecuteFlow.getPageMap(pages);
		}catch(Exception | CODException e) {
			config.put(msg, e.toString());
			Log.error(config);
			textArea.appendEr("获取页面异常", e);
			return Produce.out(config,null,Failed);
		}
		return Produce.out(config, map,Sucess);
	}
	
	/**
	 * 设置默认输出文件夹
	 * @param path
	 * @return
	 */
	public static Produce<Void> setdefaultOutPutDir(String path) {
		StringMap config = new StringMap();
		config.put(msg, ConfigFlow.setDefOutPutDir(path));
		return Produce.out(config,null,Sucess);
	}
	
	/**
	 * 设置输出文件夹
	 * @param path
	 * @return
	 */
	public static Produce<Void> setOutPutDir(String path) {
		StringMap config = new StringMap();
		config.put(msg, ConfigFlow.setDir(null,path));
		proConfig.put(UserOptions.outPutDir,path);
		return Produce.out(config,null,Sucess);
	}
	
	/**
	 * 设置已选择的页面
	 * @param pageList
	 * @return
	 */
	public static Produce<Void> setSelectedPages(List<String> pageList){
		StringMap config = new StringMap();
		try {			
			ExecuteFlow.setSelectedPageList(pageList);
		}catch(Exception e) {
			config.put(msg, e.toString());
			Log.error(config);
			textArea.appendEr("设置已选择的页面异常", e);
			return Produce.out(config,null,Failed);
		}
		return Produce.out(config,null,Sucess);
	}
	
	
	/**
	 * 执行单个vsd文件转化
	 * @return
	 */
	public static Produce<Void> executeVsds(){
		StringMap config = new StringMap();
		try {
			ExecuteFlow.saveVisioToSvg(proConfig.get(UserOptions.outPutDir));
			config.put(msg, "");
		}catch(Exception | CODException e) {
			config.put(msg, e.toString());
			Log.error(config);
			textArea.appendEr("执行转换异常", e);
			return Produce.out(config,null,Failed);
		}
		return Produce.out(config, null,Sucess);
		
	}
	
	
}
