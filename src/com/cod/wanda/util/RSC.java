package com.cod.wanda.util;

import javax.swing.JOptionPane;

/**
 * response select collection 返回选项接口，包括函数返回值常量和返回UI常用方法
 * @author Yulong
 *
 */
public interface RSC {
	/*统一方法返回码*/
	int Default = 0;
	int Sucess = 1;
	int Failed = 2;
	int NotSupport = 3;
	int Error = 4;
	int Unknow = 5;
	
	
	/*用户选择项*/
	int Confirm = 10;
	int Deny = 11;
	int Cancel = 12;
	
	/*显示控件类型*/
	int UI_MessageDialog = 100;
	int UI_ConfirmDialog = 101;
	int LogAndUI = 12;
	int Exception = 13;
	
	
	default int Show(int UI,String message) {
		if(UI==UI_MessageDialog) {
			JOptionPane.showMessageDialog(null, message);
			return Sucess;
		}
		if(UI==UI_ConfirmDialog) {
			int result = JOptionPane.showConfirmDialog(null, message);
			if(result==0)return Confirm;
			if(result==1)return Deny;
			if(result==2)return Cancel;
		}
		return Failed;
	}
	
	static int show(int UI,String message) {
		if(UI==UI_MessageDialog) {
			JOptionPane.showMessageDialog(null, message);
			return Sucess;
		}
		if(UI==UI_ConfirmDialog) {
			int result = JOptionPane.showConfirmDialog(null, message);
			if(result==0)return Confirm;
			if(result==1)return Deny;
			if(result==2)return Cancel;
		}
		return Failed;
	}
	
}
