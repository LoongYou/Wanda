package com.cod.ui.general;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.cod.util.Log;

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
	
	public int append(String text) {
		textArea.append(text);
		textArea.append("\n");
		return Sucess;
	}
	
}
