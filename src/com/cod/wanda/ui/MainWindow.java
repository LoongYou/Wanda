package com.cod.wanda.ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainWindow {
	
	/**默认风格*/
	public static final String LookAndFeel00 = "javax.swing.plaf.metal.MetalLookAndFeel";
	public static final String LookAndFeel01 = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	public static final String LookAndFeel02 = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
	public static final String LookAndFeel03 = "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
	public static final String LookAndFeel04 = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
	public static final String LookAndFeel05 = "com.sun.java.swing.plaf.mac.MacLookAndFeel";//Mac风格（需要在相关的操作系统上方可实现）
	public static final String LookAndFeel06 = "com.sun.java.swing.plaf.GTKLookAndFeel";//GTK风格（需要在相关的操作系统上方可实现）
	public static final String LookAndFeel07 = UIManager.getCrossPlatformLookAndFeelClassName();//可跨平台的默认风格
	public static final String LookAndFeel08 = UIManager.getSystemLookAndFeelClassName();//当前系统的风格
	
	static final String[] Themes = {
			LookAndFeel00,
			LookAndFeel01,
			LookAndFeel02,
			LookAndFeel03,
			LookAndFeel04,
			LookAndFeel05,
			LookAndFeel06,
			LookAndFeel07,
			LookAndFeel08,
	};
	
	static final String Font_Uniform = "宋体";
	static final int FontStyle_Uniform = Font.PLAIN;
	static final int FontSize_Uniform = 12;
	
	/*菜单名常量*/
	public static final String Profile = "Profile(配置)";
	public static final String Vsds = "Vsds(文件)";
	public static final String Batch = "Batch(批量)";
	public static final String Output = "Output(输出)";
	public static final String Excute = "Excute(执行)";
	public static final String Log = "Log(日志)";
	public static final String About = "About(关于)";
	public static final String Theme = "Theme(主题)";
	
	static JFrame frame;
	static JTextArea logTextArea;
	static JTextArea bottomTextArea;
	static List<JButton> menuList;
	
	public static void main(String[] args) {
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(800, 300, 750, 300);
		frame.setLayout(new BorderLayout());
		
		//基础底板
		JPanel basePanel = new JPanel(new BorderLayout());
		frame.add(basePanel);
		
		//左侧菜单栏
		JPanel leftMenuPanel = new JPanel();
		
		//左侧菜单滚动面板
		JScrollPane leftScrollPane = new JScrollPane();
		basePanel.add(leftScrollPane,BorderLayout.WEST);
		leftScrollPane.setViewportView(leftMenuPanel);
		
		//右侧选项卡面板
		JPanel rigthPanel = new JPanel();
		basePanel.add(rigthPanel,BorderLayout.CENTER);
		
		//底部走马灯栏
		JPanel bottomPanel = new JPanel();
		basePanel.add(bottomPanel,BorderLayout.SOUTH);
		
		//需要创建的菜单项名称
		List<String> menuNameList = new ArrayList<>();
		menuNameList.add(Profile);
		menuNameList.add(Vsds);
		menuNameList.add(Batch);
		menuNameList.add(Output);
		menuNameList.add(Excute);
		menuNameList.add(Log);
		menuNameList.add(About);
		menuNameList.add(Theme);
		
		leftMenuRightCardLayout().create(menuNameList, leftMenuPanel, rigthPanel);
		Component[] menus = leftMenuPanel.getComponents();
		Component[] cards = rigthPanel.getComponents();
		menuList = getComponentListOfType(JButton.class, menus);
		Map<String,JPanel> cardMap = getComponentMapOfType(JPanel.class, cards);
		
		initLeftScrollPane(leftScrollPane);
		initMenuButtom(menuList);
		initRightPanel(rigthPanel);
		initButtomPanel(bottomPanel);
		initVsdsCard(cardMap.get(Vsds));
		initBatchCard(cardMap.get(Batch));
		initLogCard(cardMap.get(Log));
		initThemeCard(cardMap.get(Theme));
		
		frame.repaint();
		frame.setVisible(true);
		logTextArea.append("\nUI初始化完成");
		bottomTextArea.append("UI初始化完成");

	}
	
	/**
	 * 初始化左边滚动面板
	 * @param leftScrollPane
	 */
	public static void initLeftScrollPane(JScrollPane leftScrollPane) {
		//左侧菜单滚动面板横向固定
		leftScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		leftScrollPane.setAutoscrolls(true);
		//设置左侧菜单最佳大小
		leftScrollPane.setPreferredSize(new Dimension(140,300));
	}
	
	/**
	 * 初始化菜单按钮
	 */
	public static void initMenuButtom(List<JButton> menus) {
		for(JButton menu:menus) {
			menu.setPreferredSize(new Dimension(120,25));
			setUniformFont(menu);
		}
	}
	
	/**
	 * 初始化右边面板
	 * @param rightPanel
	 */
	public static void initRightPanel(JPanel rightPanel) {
		rightPanel.setPreferredSize(new Dimension(500,300));
	}
	
	/**
	 * 初始化底部按钮
	 * @param bottomPanel
	 */
	public static void initButtomPanel(JPanel bottomPanel) {
		bottomPanel.setLayout(new BorderLayout());
		bottomPanel.setPreferredSize(new Dimension(580,25));
		bottomTextArea = new JTextArea();
		bottomPanel.add(bottomTextArea,BorderLayout.NORTH);
		bottomTextArea.setRows(1);
	}
	
	/**
	 * 初始化VsdsCard
	 * @param vsdsCard
	 */
	public static void initVsdsCard(JPanel vsdsCard) {
		JButton selectFile = createCardButton("选择文件", "请选择需要转化的visio绘图文件(vsd)或XML绘图文件(vdx)", "文件路径:");
		JButton selectPage = createCardButton("选择页面", "请选择文件中的流程图页面进行转化", "已选择页面(默认所有)");
		vsdsCard.add(selectFile);
		vsdsCard.add(selectPage);
	}
	
	
	/**
	 * 初始化BatchCard
	 * @param vsdsCard
	 */
	public static void initBatchCard(JPanel batchCard) {
		JButton selectDir = createCardButton("选择目录", "请选择需要转化的visio绘图文件(vsd)或XML绘图文件(vdx)", "文件路径:");
		JButton selectFile = createCardButton("选择文件", "请选择文件中的流程图页面进行转化", "已选择页面(默认所有)");
		batchCard.add(selectDir);
		batchCard.add(selectFile);
	}
	
	/**
	 * 初始化LogCard
	 * @param logCard
	 */
	public static void initLogCard(JPanel logCard) {
		JScrollPane textAreaScrollPanel = new JScrollPane();
		textAreaScrollPanel.setPreferredSize(new Dimension(450,230));
		setUniformFont(textAreaScrollPanel);
		logCard.add(textAreaScrollPanel);
		logTextArea = new JTextArea();
		logTextArea.setRows(8);
		logTextArea.setAutoscrolls(true);
		textAreaScrollPanel.setViewportView(logTextArea);
		textAreaScrollPanel.setAutoscrolls(true);
	}
	
	
	public static void initThemeCard(JPanel themeCard) {
		for(String theme:Themes) {
			JButton button = new JButton();
			button.setPreferredSize(new Dimension(250,25));
			button.setName(theme);
			button.setText(theme);
			themeCard.add(button);
			addButtomListener(button, b->{
				changeTheme(button.getName(),frame);
			});
		}
	}
	
	/**
	 * 改变主题
	 * @param theme
	 * @param frame
	 */
	public static void changeTheme(String theme,JFrame frame) {
		logTextArea.append("\n切换主题:"+theme);
		bottomTextArea.setText("切换主题:"+theme);
		try {
			UIManager.setLookAndFeel(theme);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logTextArea.append("\n当前操作系统不支持该主题");
			bottomTextArea.setText("当前操作系统不支持该主题");
			return;
		}
		SwingUtilities.updateComponentTreeUI(frame);
	}
	
	/**
	 * 创建卡片面板中的通用按钮
	 * @param title
	 * @param desc
	 * @param optionName
	 * @return
	 */
	public static JButton createCardButton(String title,String desc,String optionName) {
		JButton selectFile = new JButton();
		selectFile.setLayout(new GridLayout(3,1,0,0));
		selectFile.setPreferredSize(new Dimension(580,100));
		JLabel titleLabel = new JLabel(title);
		titleLabel.setFont(new Font(Font_Uniform,FontStyle_Uniform,18));
		JLabel descLabel = new JLabel(desc);
		JLabel pathLabel = new JLabel(optionName);
		setUniformFont(descLabel,pathLabel);
		
		selectFile.add(titleLabel);
		selectFile.add(descLabel);
		selectFile.add(pathLabel);
		selectFile.setBackground(Color.WHITE);
		return selectFile;
	}
	
	
	/**
	 * 从组件数组列表中获取某一类型的组件转为list
	 * @param c
	 * @param coms
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <C> List<C> getComponentListOfType(Class<C> c,Component[] coms){
		List<C> list = new ArrayList<>();
		for(Component com:coms) {
			if(com.getClass().equals(c)) {
				list.add((C) com);
			}
		}
		return list;
	}
	
	/**
	 * 从组件数组列表中获取某一类型的组件转为map
	 * @param c
	 * @param coms
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <C> Map<String,C> getComponentMapOfType(Class<C> c,Component[] coms){
		Map<String,C> map = new HashMap<>();
		for(Component com:coms) {
			if(com.getClass().equals(c)) {
				map.put(com.getName(), (C) com);
			}
		}
		return map;
	}
	
	
	/**
	 * 创建菜单和对应的卡片
	 * @param menuNameList
	 * @param menuPanel
	 * @param cardPanel
	 * @param bfunc 对button的附加操作
	 * @param pfunc 对card的附加操作
	 */
	static void createMenuAndCard(
			String menuName,
			JPanel menuPanel,
			JPanel cardPanel,
			Consumer<JButton> bfunc,
			Consumer<JPanel> pfunc) {
		
		//创建左侧菜单按钮
		JButton menu = new JButton();
		menu.setText(menuName);
		menu.setName(menuName);
		if(menuPanel.getLayout() instanceof GridBagLayout) {
			menuPanel.add(menu);
		}else {
			menuPanel.add(menuName,menu);
		}
		
		//创建右侧选项卡
		JPanel card = new JPanel();
		card.setName(menuName);
		if(cardPanel.getLayout() instanceof GridBagLayout) {
			cardPanel.add(card);
		}else {
			//通过该方法添加组件将创建一个映射关系，GridBagLayout不兼容使用该方式
			cardPanel.add(menuName,card);
		}
		
		bfunc.accept(menu);
		pfunc.accept(card);
		
	}
	
	
	public static CreateMenuAndCard leftMenuRightCardLayout() {
		
		return (List<String> menuNameList,JPanel menuPanel,JPanel cardPanel)->{
			//创建grid填充器
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			//组件在显示区域内上下填充
			gridBagConstraints.fill = GridBagConstraints.BOTH;
			//组件占用对于的空间参数，如果大于0则会自动填充，自适应容器大小，将无法触发滚动条事件
			gridBagConstraints.weightx = 0.0;
			gridBagConstraints.weighty = 0.0;
			//组件在显示区域内的定位
			gridBagConstraints.anchor = GridBagConstraints.CENTER;
			//组件的显示区域外边距
			gridBagConstraints.insets = new Insets(0, 0, 0, 0);
			//组件显示区域内边距
			gridBagConstraints.ipadx = 0;
			gridBagConstraints.ipady = 0;
			//组件显示区域占的行数，0为另起一行
			gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
			//组件显示区域占的列数
			gridBagConstraints.gridheight = 1;
			//组件显示位置：相对定位
			gridBagConstraints.gridx = GridBagConstraints.RELATIVE;
			gridBagConstraints.gridy = GridBagConstraints.RELATIVE;
			
			GridBagLayout gridBagLayout = new GridBagLayout();
			//左侧菜单栏（竖向网格布局）
			menuPanel.setLayout(gridBagLayout);
			//右侧选项卡面板（客片布局）
			CardLayout cardLayout = new CardLayout();
			cardPanel.setLayout(cardLayout);
			
			for(String menuName:menuNameList) {
				createMenuAndCard(menuName, menuPanel, cardPanel, menu->{
					gridBagLayout.setConstraints(menu, gridBagConstraints);
					addButtomListener(menu, m->{
						cardLayout.show(cardPanel, m.getName());
						m.setBackground(Color.WHITE);
						togoMenuChangeStyle(m.getName(), otherMenu->{
							otherMenu.setBackground(new Color(212, 212, 212, 212));
						});
					});
				}, card->{
					//预留卡片附加操作
				});
			}
			
		};

	}

	/**
	 * 添加按钮鼠标侦听器
	 * @param menu
	 * @param operation 鼠标点击的操作，侦听线程中不能绑定耗时操作
	 */
	public static void addButtomListener(JButton menu,Consumer<JComponent> operation) {
		menu.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(menu.equals(e.getSource())) {
					operation.accept(menu);
				}
				
			}
		});
	}
	
	
	/**
	 * 设置组件的字体为统一样式
	 * @param coms
	 */
	public static void setUniformFont(JComponent ...coms) {
		for(JComponent c:coms) {
			c.setFont(new Font(Font_Uniform,FontStyle_Uniform,FontSize_Uniform));
		}
	}
	
	/**
	 * 当点击菜单列表里某个菜单，对其余菜单的操作，通常用用于翻转取反
	 * @param menuName
	 * @param bfunc
	 */
	public static void togoMenuChangeStyle(String menuName,Consumer<JButton> bfunc) {
		if(menuList==null || menuName==null) {
			return;
		}
		for(JButton menu:menuList) {
			if(!menuName.equals(menu.getName())) {
				bfunc.accept(menu);
			}
		}
	}
	
}
