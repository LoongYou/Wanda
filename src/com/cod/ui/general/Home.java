package com.cod.ui.general;

import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * 主界面
 * @author Yulong
 *
 */
public class Home extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Home() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 500);
		//设置在屏幕居中
		setLocationRelativeTo(null);
		
		/*
		 * 设置窗口在屏幕居中备选兼容方案
		 * int DIALOG_WHITE = 400; int DIALOG_HEIGHT = 400; Point point =
		 * GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		 * this.setBounds(point.x - DIALOG_WHITE / 2, point.y - DIALOG_HEIGHT / 2,
		 * DIALOG_WHITE, DIALOG_HEIGHT);
		 */
		setLayout(new BorderLayout());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Home();
	}
	
}
