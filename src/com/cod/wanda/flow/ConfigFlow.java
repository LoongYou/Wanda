package com.cod.wanda.flow;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.cod.exception.CODException;
import com.cod.util.FileUtil;
import com.cod.util.Log;
import com.cod.util.PropertiesUtil;
import com.cod.wanda.util.StringMap;

public class ConfigFlow implements Log{
	
	static String propertiesFileName = "Wanda.properties";
	
	/**当前jar执行时所在的目录*/
	public static final String userDir = System.getProperty("user.dir");
	
	public static final String userHome = System.getProperty("user.home");
	
	public static final String defaultDriver = "D:";
	
	private static String defOutPutDir = "\\WandaOutput";

	public static final String pageModulePath = "\\page\\SingleSvgPageModule.html";
	
	
	
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
	
	public static String initDefOutPutDir() {
		File file = new File(defaultDriver);
		if(file.exists()) {
			file = new File(defaultDriver+defOutPutDir);
			defOutPutDir=file.getPath();
			if(!file.exists()) {
				file.mkdir();
			}
			return defOutPutDir;
		}
		file = new File(userHome);
		if(file.exists()) {
			file = new File(userHome+defOutPutDir);
			defOutPutDir=file.getPath();
			if(!file.exists()) {
				file.mkdir();
			}
		}
		return defOutPutDir;
	}
	
	
	/**
	 * 设置默认输出文件夹
	 * @param path
	 * @return
	 */
	public static String setDefOutPutDir(String path) {
		return setDir(path,(天若有情天亦老)->defOutPutDir=path);
	}
	
	public static String getDefOutPutDir() {
		return defOutPutDir;
	}

	/**
	 * 确定指定的路径是否可作为保存目录，如果可行，则将此路径给到指定的路径变量中；PS：这种File判定操作与util类中的逻辑有重叠似乎无法避免，
	 * 当然，程序中少许冗余代码是可以被接受的
	 * @param dirFunc 如果目录可行，则设置或其他操作
	 * @param path 需要判断的路径,该方法不会修改path
	 * @return 设置结果文案
	 */
	public static String setDir(final String path,Consumer<Void> dirFunc) {
		File file = new File(path);
		if(file.exists()) {
			if(file.isDirectory()) {
				if(dirFunc!=null) {
					dirFunc.accept(null);
				}
				return "该目录已存在，同名文件会被覆盖";
			}else {
				return "请选择文件夹";
			}
		}else {
			if(dirFunc!=null) {
				dirFunc.accept(null);
			}
			return "该目录将会被创建";
		}
	}
	
}
