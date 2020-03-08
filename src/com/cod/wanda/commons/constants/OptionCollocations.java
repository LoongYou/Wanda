package com.cod.wanda.commons.constants;

/**
 * 选项组合类
 * @author YL
 *
 */
public class OptionCollocations extends Collocations{
	
	public OptionCollocations() throws IllegalArgumentException, IllegalAccessException {
		super();
	}
	
	public interface UserOptions{
		
		/**输出文件类型*/
		String outPutFileType = createKey("outPutFileType");
		String outPutFileType_Svg = createKey("outPutFileType_Svg");
		
		/**源文件路径*/
		String sourceFilePath = createKey("sourceFilePath");
		/**输出路径*/
		String outPutDir = createKey("outPutDir");
		
		/**处理的页面*/
		String applyPage = createKey("applyPage");
		String applyPage_all = createKey("applyPage_all");
		
	}
	
	
}
