package com.cod.wanda.ui;

import java.util.List;

import javax.swing.JPanel;

@FunctionalInterface
public interface CreateMenuAndCard {

	/**
	 * 创建菜单和对应的卡片
	 * PS：可以用内置bifunction代替，只是为了换个执行方法名^_^
	 * @param menuNameList
	 * @param menuPanel
	 * @param cardPanel
	 */
	void create(List<String> menuNameList,JPanel menuPanel,JPanel cardPanel);
}
