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
		setViewportView(textArea);
		setAutoscrolls(true);
		setVisible(true);
	}
	
	public void append(String text) {
		textArea.append(text);
		textArea.append("\n");
	}
	
	/**
	 * 打印错误和异常并抛出异常
	 * @return
	 * @throws CODException 
	 */
	public void appendEx(String text,Throwable e) throws CODException {
		append(text+":"+ e);
		ErrorEx(text,e);
	}
	
	/**
	 * 打印错误和异常
	 * @param text
	 */
	public void appendEr(String text) {
		append(text);
		Error(text);
	}
	
}
