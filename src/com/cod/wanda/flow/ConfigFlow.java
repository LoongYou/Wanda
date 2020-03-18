package com.cod.wanda.flow;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import com.cod.exception.CODException;
import com.cod.util.FileUtil;
import com.cod.util.Log;
import com.cod.util.PropertiesUtil;
import com.cod.wanda.util.StringMap;

public class ConfigFlow implements Log{
	
	static String defProgramHome = "\\COD\\Wanda";
	
	static String propertiesFileName = "Wanda.properties";
	
	/**当前jar执行时所在的目录*/
	public static final String userDir = System.getProperty("user.dir");
	
	public static final String pageModulePath = "\\page\\SingleSvgPageModule.html";
	
	private static String defOutPutDir;
	
	/**
	 * 读取本地配置
	 * @return
	 * @throws CODException 
	 */
	public static StringMap getLocalConfig() throws CODException {
		StringMap config = new StringMap();
		Properties properties;
		try {
			
			properties = PropertiesUtil.getProperties(userDir+"\\"+propertiesFileName);
			PropertiesUtil.propertiesCopyToMap(properties, config, true);
			//throw new IOException("shit");
		} catch (IOException e) {
			Log.errorEx("获取本地配置失败，将使用默认配置",e);
		}
		return config;
	}
	
	/**
	 * 检查本地文件,是否缺少依赖的文件，并返回缺少的文件列表
	 * @param dependenetFileList
	 * @return
	 */
	public static List<String> checkLocalFile(List<String> dependenetFileList) {
		Log.info("userDir=",userDir);
		List<File> fileList = FileUtil.searchFile(userDir,"");
		List<String> list = dependenetFileList.stream().filter(
				name->{
					Log.info("search userDir fileList......");
					for(File file:fileList) {
						Log.info(file.getName());
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
	 * 初始化本地文件
	 * @param list
	 * @return 
	 * @return
	 * @throws CODException 
	 */
	public static int initLocalFile(List<String> list) throws CODException {
		Log.info("初始化本地文件:"+list);
		for(String name:list) {
			try {
				FileUtil.createFile(userDir+"\\"+name);
			} catch (IOException e) {
				Log.errorEx("初始化本地配置文件失败："+name,e);
			}
		}
		Log.info("初始化本地文件 finish");
		return Sucess;
	}
	
	/**
	 * 初始化依赖文件列表
	 * @return
	 */
	public static List<String> initDependenetFiles() {
		List<String> dependenetFiles = new ArrayList<>();
		dependenetFiles.add(propertiesFileName);
		return dependenetFiles;
	}
	
	/**
	 * 设置默认输出文件夹
	 * @param path
	 * @return
	 */
	public static String setDefOutPutDir(String path) {
		return setDir(defOutPutDir,path);
	}
	
	public static String setDir(String dir,String path) {
		File file = new File(path);
		if(file.exists()) {
			if(file.isDirectory()) {				
				dir = path;
				return "该目录已存在，里面的文件会被覆盖";
				
			}else {
				return "请选择文件夹";
			}
		}else {
			dir = path;
			return "该目录将会被创建";
		}
	}
	
}
