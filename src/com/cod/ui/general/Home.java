package com.cod.ui.general;

import javax.swing.JFrame;

public class Home extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Home() {
		super();
		setSize(800, 500);
		setLocationRelativeTo(null);
		
		/*
		 * int DIALOG_WHITE = 400; int DIALOG_HEIGHT = 400; Point point =
		 * GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		 * this.setBounds(point.x - DIALOG_WHITE / 2, point.y - DIALOG_HEIGHT / 2,
		 * DIALOG_WHITE, DIALOG_HEIGHT);
		 */
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Home();
	}
	
}
