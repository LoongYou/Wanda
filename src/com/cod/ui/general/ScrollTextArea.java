package com.cod.ui.general;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.cod.exception.CODException;
import com.cod.util.Log;

/**
 * 滚动显示文本域
 * @author Yulong
 *
 */
public class ScrollTextArea extends JScrollPane implements Log{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4218738308554645874L;

	private JTextArea textArea;
	
	public ScrollTextArea() {
		textArea = new JTextArea();
		textArea.setAutoscrolls(true);
		//设置自动换行
		textArea.setLineWrap(true);
		//设置换行不断字
		textArea.setWrapStyleWord(true);
		setViewportView(textArea);
		setAutoscrolls(true);
		setVisible(true);
	}
	
	/**
	 * 设置行数
	 * @param rows
	 */
	public void setRows(int rows) {
		textArea.setRows(rows);
	}
	
	/**
	 * 输出文本
	 * @param text
	 */
	public void append(String text) {
		textArea.append(text);
		textArea.append("\n");
	}
	
	/**
	 * 输出和打印日志：错误和异常，并抛出异常
	 * @return
	 * @throws CODException 
	 */
	public void appendEx(String text,Throwable e) throws CODException {
		append(text+":"+ e);
		ErrorEx(text,e);
	}
	
	/**
	 * 输出和打印日志：错误和异常
	 * @param text
	 */
	public void appendEr(String text,Throwable e) {
		append(text+":"+e);
		Error(text,e);
	}
	
}
