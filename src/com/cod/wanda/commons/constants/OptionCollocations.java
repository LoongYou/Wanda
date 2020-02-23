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
		String outPutFileType = CreateKey("outPutFileType");
		String outPutFileType_Svg = CreateKey("outPutFileType_Svg");
		
		/**源文件路径*/
		String sourceFilePath = CreateKey("sourceFilePath");
		/**输出路径*/
		String outPutDir = CreateKey("outPutDir");
		
		/**处理的页面*/
		String applyPage = CreateKey("applyPage");
		String applyPage_all = CreateKey("applyPage_all");
		
	}
	
	
}
