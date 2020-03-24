package com.cod.wanda.ui;

import static java.util.stream.Collectors.toList;

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
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.cod.ui.general.ScrollTextArea;
import com.cod.util.Log;
import com.cod.wanda.Main;
import com.cod.wanda.constants.OptionCollocations.UserOptions;
import com.cod.wanda.util.Produce;

/**
 * 主窗体程序
 * @author Yulong
 *
 */
public class MainWindow implements Log{
	
	public static final String neverBug = "<html>"
			+ "*******************************************************************<br>"
			+ "**........................_ooOoo_................................**<br>"
			+ "**.......................o8888888o ...............................**<br>"
			+ "**.......................88\" .  \"88..............................**<br>"
			+ "**.......................(| ^_^  |).................................**<br>"
			+ "**........................O\\  =  /O...............................**<br>"
			+ "**....................____/`---'\\____.............................**<br>"
			+ "**...................'  \\\\|     |//  `............................**<br>"
			+ "**................./  \\\\|||  :  |||//  \\.........................**<br>"
			+ "**................../  _||||| -:- |||||-  \\......................**<br>"
			+ "**...............|   | \\\\\\  -  /// |   |........................**<br>"
			+ "**................| \\_|  ''\\---/''  |   |........................**<br>"
			+ "**................\\  .-\\__  `-`  ___/-. /........................**<br>"
			+ "**................___`. .'  /--.--\\  `. . ___.....................**<br>"
			+ "**...........\"\" '<  `.___\\_<|>_/___.'  >'\"\"...................**<br>"
			+ "**..........| | :  `- \\`.;`\\ _ /`;.`/ - ` : | |...................**<br>"
			+ "**..........\\  \\ `-.   \\_ __\\ /__ _/   .-` /  /.................**<br>"
			+ "**.....========`-.____`-.___\\_____/___.-`____.-'========...........**<br>"
			+ "**..........................`=---='.................................**<br>"
			+ "**......^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^..........**<br>"
			+ "**...............佛祖保佑                      永无BUG     永不修改                   **<br>"
			+ "************************************************************************"
			+ "</html>";
	
	
	/**操作系统名称*/
	private static final String OS_Name = System.getProperty("os.name").toLowerCase();
	private static final String OS_Windows = "windows";
	
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
	
	/**
	 * 主题列表
	 */
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
	
	/**统一字体*/
	static final String Font_Uniform = "宋体";
	/**统一字体样式*/
	static final int FontStyle_Uniform = Font.PLAIN;
	/**统一字体大小*/
	static final int FontSize_Uniform = 12;
	
	
	/*菜单名常量*/
	public static final String Profile = "Profile(配置)";
	public static final String Vsds = "Vsds(文件)";
	public static final String Batch = "Batch(批量)";
	public static final String Output = "Output(输出)";
	public static final String Execute = "Execute(执行)";
	public static final String Logging= "Logging(日志)";
	public static final String About = "About(关于)";
	public static final String Theme = "Theme(主题)";
	/**选中的页面按钮标识*/
	public static final String SelectedPage = "selectedPage";
	/**未选中的页面按钮标识*/
	public static final String UnSelectedPage = "unSelectedPage";
	
	/**主窗体*/
	static JFrame frame;
	/**日志文本域，如果以后有需求可让后台已debug模式输出，一般由后台输出*/
	public static ScrollTextArea logTextArea;
	/**底部文本域，提供简约信息，增加灵活性，由主界面控制*/
	public static JTextArea bottomTextArea;
	/**菜单按钮列表*/
	static List<JButton> menuList;
	/**提示弹框文案*/
	static JLabel tipLabel;
	/**提示弹框*/
	static JDialog tipDialog;
	/**vsd中的页面对应的选择按钮列表*/
	static List<JButton> pageButtonList = new ArrayList<>();;
	
	public static void main(String[] args) {
		new MainWindow();
	}
	
	public MainWindow() {
		initTopTip();
		showTopTip("Now starting Wanda");
		frame = new JFrame();
		frame.setTitle("Wanda V1.1");
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int value=JOptionPane.showConfirmDialog(frame, "确定退出？");
				if (value==JOptionPane.OK_OPTION) {
					Main.exit();
					super.windowClosed(e);
					System.exit(0);
				}
			}	
		});
		
		//设置在屏幕居中(不一定能居中)
		frame.setLocationRelativeTo(null);	
				/*
				 * 设置窗口在屏幕居中兼容方案
				 * int DIALOG_WHITE = 400; int DIALOG_HEIGHT = 400; Point point =
				 * GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
				 * this.setBounds(point.x - DIALOG_WHITE / 2, point.y - DIALOG_HEIGHT / 2,
				 * DIALOG_WHITE, DIALOG_HEIGHT);
				 */
		frame.setSize(750, 500);
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
		menuNameList.add(Execute);
		menuNameList.add(Logging);
		menuNameList.add(About);
		menuNameList.add(Theme);
		
		leftMenuRightCardLayout().create(menuNameList, leftMenuPanel, rigthPanel);
		Component[] menus = leftMenuPanel.getComponents();
		Component[] cards = rigthPanel.getComponents();
		menuList = getComponentListOfType(JButton.class, menus);
		Map<String,JPanel> cardMap = getComponentMapOfType(JPanel.class, cards);
		
		//务必按顺序初始化面板
		initLogCard(cardMap.get(Logging));
		initButtomPanel(bottomPanel);
		initLeftScrollPane(leftScrollPane);
		initMenuButtom(menuList);
		initRightPanel(rigthPanel);
		initProfileCard(cardMap.get(Profile));
		initVsdsCard(cardMap.get(Vsds));
		initBatchCard(cardMap.get(Batch));
		initOutputCard(cardMap.get(Output));
		initExecuteCard(cardMap.get(Execute));
		initAboutCard(cardMap.get(About));
		initThemeCard(cardMap.get(Theme));
		
		changeTheme(LookAndFeel00, frame);
		frame.setVisible(true);
		
		hideTopTip();
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
			menu.setPreferredSize(new Dimension(120,50));
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
	 * 初始化profileCard
	 * @param profileCard
	 */
	public static void initProfileCard(JPanel profileCard) {
		JLabel optionLabel1 = new JLabel("[vsd文件阅览工具]这个程序很小，不需要什么配置\n");
		JLabel optionLabel2 = new JLabel(neverBug);
		profileCard.add(optionLabel1);
		profileCard.add(optionLabel2);
		setUniformFont(optionLabel1);
		setUniformFont(optionLabel2);
	}
	
	
	/**
	 * 初始化VsdsCard
	 * @param vsdsCard
	 */
	public static void initVsdsCard(JPanel vsdsCard) {
		JLabel optionLabel1 = new JLabel("文件路径:");
		JButton selectFile = createCardButton("选择文件", "<html>点击这里选择需要转化的visio绘图文件vsd...<br>选择文件后会为您自动通过visio打开vsd文件，"
				+ "如果您之前已打开此vsd文件，请先关闭，因为一个visio document只允许一个实例</html>", optionLabel1);
		JLabel optionLabel2 = new JLabel("点击下方选择要处理的页面");
		JButton selectPage = createCardButton("选择页面", "<html>点击下方的流程图页面进行转化...<br>此时您可以在visio修改vsd，对于转化会立刻生效</html>", optionLabel2);
		JButton openFileButton = createNormalButton("直接/重新打开文件(如果已关闭文件，可以再次打开)");
		JButton selectBotton = createPageAllButton();
		selectPage.add(selectBotton);
		vsdsCard.add(selectFile);
		vsdsCard.add(selectPage);
		
		// 打开文件操作函数
		Consumer<String> openFile = path->{
			Produce<Void> produce1 = Main.openFile(path);
			if(showMessageDialogAtFailed(vsdsCard,produce1,
					"提示：请先关闭打开的vsd文件，因为只能打开一个document实例。"))return;
			
			Produce<Map<String, Integer>> produce2 = Main.getPagesInfo();
			if(showMessageDialogAtFailed(vsdsCard,produce2,
					"提示：在转换完成前请不要关闭visio。"))return;
			
			//每次触发文件选择需要清空上次添加的页面按钮
			for(int i = 0;i<pageButtonList.size();i++) {
				vsdsCard.remove(pageButtonList.get(i));
			}
			pageButtonList.clear();
			
			//获取页面名称并添加对应的选择按钮，此时index已经后台排好序
			Map<String, Integer> pageMap = produce2.product;
			//由于页面按钮添加会在Flow布局容器末尾，需要先计算index再添加，防止按钮丢失（藏起来了）
			vsdsCard.updateUI();
			pageMap.forEach((pageName,谨以此歌代泣)->{
				JButton pageButton = createSelectPageButton(pageName);
				pageButtonList.add(pageButton);
				vsdsCard.add(pageButton);
			});
		};
		
		// 每次激活卡片，刷新文件路径
		addHierarchyListener(vsdsCard, 你是言而必行->{
			String path = Main.getConfig(UserOptions.sourceFilePath);
			optionLabel1.setText("上次文件路径:"+path==null?"":path);
			// 如果文件路径存在，则添加打开文件按钮到顺序为2的位置
			if(path!=null) {
				vsdsCard.add(openFileButton,1);
			}
		});
		
		// 点击直接打开文件按钮，则打开文件
		addButtomListener(openFileButton, 还是逆来顺受->{
			setupOnTop();		
			openFile.accept(Main.getConfig(UserOptions.sourceFilePath));
			cancelOnTop();
		});
		
		// 选择文件后自动打开
		addButtomListener(selectFile, 难道选择平凡才是解脱->{
			try {
				JFileChooser fileChooser = createFileChooser();
				String chooserPath = Main.getConfig(UserOptions.sourceFilePath);
				if(chooserPath!=null) {
					fileChooser.setCurrentDirectory(new File(chooserPath));
				}
				
			    int flat = fileChooser.showDialog(selectFile, "选择");
			    if(flat!=JFileChooser.APPROVE_OPTION) {
			    	return;
			    }
				File file = fileChooser.getSelectedFile();
				if(file==null) return;
				String path = file.getPath();
				//此时必须等侦听线程执行完成后，GUI的修改才会生效
				optionLabel1.setText("文件路径:"+path);
				setupOnTop();
				openFile.accept(path);
				cancelOnTop();
			}catch(Exception e) {
				Log.error(e);
			}
		});
		
		// 点击全选或取消全选
		addButtomListener(selectBotton, b -> {
			if ("0".equals(b.getName())) {
				pageButtonList.forEach(pageButton -> {
					pageButton.setName(UnSelectedPage);
					pageButton.setBackground(new Color(212, 212, 212, 212));
				});
			}
			if ("1".equals(b.getName())) {
				pageButtonList.forEach(pageButton -> {
					pageButton.setName(SelectedPage);
					pageButton.setBackground(Color.WHITE);
				});
			}
		});
	}
	

	/**
	 * 初始化BatchCard
	 * @param vsdsCard
	 */
	public static void initBatchCard(JPanel batchCard) {
		JLabel optionLabel1 = new JLabel("");
		JButton selectDir = createCardButton("选择目录", "请选择需要转化的visio绘图文件(vsd、vsdx)",optionLabel1);
		JLabel optionLabel2 = new JLabel("");
		JButton selectFile = createCardButton("选择文件", "请选择文件中的流程图页面进行转化", optionLabel2);
		batchCard.add(selectDir);
		batchCard.add(selectFile);
		
		addButtomListener(selectDir, 皇图霸业谈笑中->JOptionPane.showMessageDialog(batchCard, "这个需求应该没有，所以没实现这个功能"));
		addButtomListener(selectFile, 不胜人生一场醉->JOptionPane.showMessageDialog(batchCard, "这个需求应该没有，所以没实现这个功能"));
	}
	
	/**
	 * 初始化OutputCard
	 * @param outputCard
	 */
	public static void initOutputCard(JPanel outputCard) {
		
		
		JLabel optionLabel1 = new JLabel("");
		JButton vsds = createCardButton("当前文件输出到", "设置本次转化后的文件到指定的目录",optionLabel1);
		JLabel optionLabel2 = new JLabel("");
		JButton def = createCardButton("默认输出到", "转化的文件默认保存路径", optionLabel2);
		outputCard.add(vsds);
		outputCard.add(def);
		
		addHierarchyListener(outputCard, 这缭乱的城市->{
			String p1 = Main.getConfig(UserOptions.outPutDir);
			String p2 = Main.getConfig(UserOptions.defOutPutDir);
			optionLabel1.setText("上次输出目录:"+p1==null?"":p1);
			optionLabel2.setText("默认目录："+p2==null?"":p2);
		});
		
		addButtomListener(vsds, 容不下我的痴->{
			JFileChooser fileChooser = createFileChooser();
			String chooserPath = Main.getConfig(UserOptions.outPutDir);
			if(chooserPath!=null) {
				fileChooser.setCurrentDirectory(new File(chooserPath));
			}
		    int flat = fileChooser.showDialog(vsds, "选择");
		    if(flat!=JFileChooser.APPROVE_OPTION) {
		    	Main.setOutPutDir(null);
		    	optionLabel1.setText("使用默认目录");
		    	return;
		    }
			File file = fileChooser.getSelectedFile();
			if(file==null) return;
			String path = file.getPath();
			Produce<Void> produce1 = Main.setOutPutDir(path);
			if(showMessageDialogAtFailed(outputCard,produce1,""))return;
			optionLabel1.setText(produce1.config.get(Main.msg)+":"+path);
		});
		
		addButtomListener(def, 失明前我曾见过极光彩虹和海洋->{
			JFileChooser fileChooser = createFileChooser();
			String chooserPath = Main.getConfig(UserOptions.defOutPutDir);
			if(chooserPath!=null) {
				fileChooser.setCurrentDirectory(new File(chooserPath));
			}
		    int flat = fileChooser.showDialog(vsds, "选择");
		    if(flat!=JFileChooser.APPROVE_OPTION) {
		    	return;
		    }
			File file = fileChooser.getSelectedFile();
			if(file==null) return;
			String path = file.getPath();
			Produce<Void> produce2 = Main.setDefaultOutPutDir(path);
			if(showMessageDialogAtFailed(outputCard,produce2,""))return;
			optionLabel2.setText(produce2.config.get(Main.msg)+":"+path);
		});
	}

	/**
	 * 初始化ExecuteCard
	 * @param executeCard
	 */
	public static void initExecuteCard(JPanel executeCard) {
		JLabel optionLabel1 = new JLabel("");
		JButton vsds = createCardButton("单个文件", "转化单个的文件中选定的页面(不要关闭visio)，执行完后会自动打开",optionLabel1);
		JLabel optionLabel2 = new JLabel("");
		JButton batch = createCardButton("批量文件", "对批量选择的文件的所有页面进行转化(请不要关闭visio)", optionLabel2);
		executeCard.add(vsds);
		executeCard.add(batch);
		
		addButtomListener(vsds, 说走咱就走->{
			List<String> pageList = pageButtonList.stream()
					.filter(bu->SelectedPage.equals(bu.getName()))
					.map(JButton::getText)
					.collect(toList());
			optionLabel1.setText("已选择页面："+pageList);
			if(pageList==null || pageList.size()==0) {
				optionLabel1.setText("您还没有选择要处理的页面");
				return;
			}
			//pageButtonList.forEach(b1->System.out.println(b1.getText()));
			Produce<Void> produce1 = Main.setSelectedPages(pageList);
			if(showMessageDialogAtFailed(executeCard,produce1,""))return;
			Produce<Void> produce2 = Main.executeVsds();
			if(showMessageDialogAtFailed(executeCard,produce2,""))return;
			showMessageDialogAtSucess(executeCard, produce2, "页面转化完成");
		});
		
		addButtomListener(batch, 但这是条漫长的路->JOptionPane.showMessageDialog(executeCard, "这个需求应该没有，所以没实现这个功能"));
		
	}
	

	/**
	 * 初始化LogCard
	 * @param logCard
	 */
	public static void initLogCard(JPanel logCard) {
		
		logTextArea = new ScrollTextArea();
		logTextArea.setPreferredSize(new Dimension(550,420));
		logTextArea.setRows(10);
		setUniformFont(logTextArea);
		logCard.add(logTextArea);
		logTextArea.append("\nUI初始化完成");
	}


	public static void initAboutCard(JPanel aboutCard) {
		ScrollTextArea about = new ScrollTextArea();
		about.setPreferredSize(new Dimension(550,420));
		about.setRows(10);
		setUniformFont(about);
		aboutCard.add(about);
		about.append("介绍\n"
				+ "这是一个对vsd流程图进行视觉优化的小工具，可将vsd文件转为html，主要针对软件设计流程图中的泳道和阶段实现粘性导航标题，提高阅读效率。\n"
				+ "\nF&Q\n"
				+ "\n它用在什么场景？\n"
				+ "--软件设计流程图的初衷是如实的描述逻辑和关联系统的交互，因此泳道列表是必不可少的，当流程图较大，在visio中往往要上下翻动页面查看，"
				+ "影响了效率和准确性。此时你会希望泳道或阶段的标题可以像excel那样固定列头或行，这正是本工具所提供的。\n"
				+ "\n这会改动原来的vsd文件吗？\n"
				+ "--不会，但是需要通过visio打开vsd文件以读取信息。\n"
				+ "\n对运行环境的要求？\n"
				+ "--需要jdk1.8，兼容visio2007及以上版本，不支持IE，请将默认浏览器设为谷歌或其他浏览器\n"
				+ "\n可以在html中修改vsd文件吗？\n"
				+ "--理论上可以实现，但是不是现在。visio是个非常远古的软件，使用了封闭的文件格式(vsd)，"
				+ "本程序通过visio将vsd转为svg(W3C开放格式矢量图形)，才使得在浏览器中操作有了可能，这不仅仅是时间问题，"
				+ "要知道即便是解析visio生成的svg也是让人非常烦躁的，又谈何去做兼容？不重复造车轮了，点到为止即可。");
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
	 * 初始化提示弹框
	 */
	public static void initTopTip() {
		tipDialog = new JDialog();
		tipLabel = new JLabel();
		tipDialog.setSize(300,100);
		tipDialog.setLocationRelativeTo(null);
		tipDialog.add(tipLabel);
	}


	/**
	 * 主界面窗口置顶
	 */
	public static void setupOnTop() {
		frame.setAlwaysOnTop(true);
	}
	
	/**
	 * 取消主界面窗口置顶
	 */
	public static void cancelOnTop() {
		frame.setAlwaysOnTop(false);
	}
	
	/**
	 * 显示提示弹框
	 * @param tip
	 */
	public static void showTopTip(String tip) {
		tipLabel.setText(tip);
		tipDialog.setVisible(true);
	}
	
	/**
	 * 隐藏提示弹框
	 */
	public static void hideTopTip() {
		tipDialog.setVisible(false);
	}
	
	
	/**
	 * 创建文件选择器
	 * @return
	 */
	public static JFileChooser createFileChooser() {
		JFileChooser fileChooser=new JFileChooser();
		//如果操作系统为window则设置window样式
		if(OS_Name.indexOf(OS_Windows)>=0) {			
			changeTheme(LookAndFeel02, fileChooser);
		}
		//设置模式为文件和文件夹都可以选择
	    fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );
	    return fileChooser;
	}


	/**
	 * 改变主题
	 * @param theme
	 * @param frame
	 */
	public static void changeTheme(String theme,Component frame) {
		logTextArea.append("\n切换主题:"+theme);
		try {
			UIManager.setLookAndFeel(theme);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logTextArea.append("\n当前操作系统不支持该主题");
			JOptionPane.showMessageDialog(frame, "当前操作系统不支持该主题");
			return;
		}
		SwingUtilities.updateComponentTreeUI(frame);
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
	 * 创建正常按钮
	 * @return
	 */
	public static JButton createNormalButton(String text){
		JButton button = new JButton(text);
		setUniformButton(button);
		return button;
	}
	
	
	public static void setUniformButton(JButton button) {
		setUniformFont(button);
		changeTheme(LookAndFeel00, button);
		button.setBackground(Color.WHITE);
	}
	
	
	/**
	 * 创建翻转按钮，通过两次点击，对其的Name属性做两种标志的翻转
	 * @param name1 初始标识
	 * @param name2
	 * @param con1 对应name1执行的操作
	 * @param con2 对应name2执行的操作
	 * @return
	 */
	public static JButton createToggleButton(String name1,String name2,Consumer<JButton> con1,Consumer<JButton> con2) {
		JButton button = new JButton();
		setUniformFont(button);
		changeTheme(LookAndFeel00, button);
		button.setName(name1);
		
		if(con1!=null) {
			con1.accept(button);
		}
			addButtomListener(button, b->{
				if(b.getName().equals(name1)) {
					b.setName(name2);
					if(con2!=null) {
						con2.accept(button);
					}
				}else {
					b.setName(name1);
					if(con1!=null) {
						con1.accept(button);
					}
				}
			});
		return button;
	}
	

	public static JButton createSelectPageButton(String text) {
		return createToggleButton(UnSelectedPage,SelectedPage,
				b->UnSelectedPageFunc.accept(b, text), 
				b->SelectedPageFunc.accept(b, text));
	}
	
	
	static BiConsumer<JButton, String> UnSelectedPageFunc = (b,text)->{
		if(text!=null) {
			b.setText(text);
		}
		b.setBackground(new Color(188,188,188,188));
	};
	
	static BiConsumer<JButton, String> SelectedPageFunc = (b,text)->{
		if(text!=null) {
			b.setText(text);
		}
		b.setBackground(Color.WHITE);
	};
	
	static BiConsumer<JButton, String> SelectPageNoneFunc = (b,text)->{
		if(text!=null) {
			b.setText(text);
		}
		b.setBackground(new Color(188,188,188,188));
		pageButtonList.forEach(bu->{
		bu.setName(UnSelectedPage);
		UnSelectedPageFunc.accept(bu, null);
		});
	};
	
	static BiConsumer<JButton, String> SelectPageAllFunc = (b,text)->{
		if(text!=null) {
			b.setText(text);
		}
		b.setBackground(Color.WHITE);
		pageButtonList.forEach(bu->{
		bu.setName(SelectedPage);
		SelectedPageFunc.accept(bu, null);
		});
	};
	
	public static JButton createPageAllButton() {
		return createToggleButton(UserOptions.applyPage_none, UserOptions.applyPage_all, 
				b->SelectPageNoneFunc.accept(b,"没有全选(点击更改)"), b->SelectPageAllFunc.accept(b, "已全选(点击更改)"));
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
	 * 根据执行某一流程返回的produce结果，如果result为Failed则弹框提示
	 * @param com 弹框依附的组件
	 * @param produce 
	 * @param message 描述信息
	 */
	public static boolean showMessageDialogAtFailed(JComponent com,Produce<?> produce,String message) {
		if(produce.result==Failed) {
			JOptionPane.showMessageDialog(com, produce.config.get(Main.msg)+"\n"+message);
			return true;
		}
		return false;
	}
	
	/**
	 * 根据执行某一流程返回的produce结果，如果result为Sucess则弹框提示
	 * @param com 弹框依附的组件
	 * @param produce 
	 * @param message 描述信息
	 * @return
	 */
	public static boolean showMessageDialogAtSucess(JComponent com,Produce<?> produce,String message) {
		if(produce.result==Sucess) {
			JOptionPane.showMessageDialog(com, produce.config.get(Main.msg)+"\n"+message);
			return true;
		}
		return false;
	}
	
	/**
	 * 创建卡片面板中的通用按钮
	 * @param title 标题
	 * @param desc 描述
	 * @param optionLabel 一个事先创建用于动态显示内容的文本组件
	 * @return
	 */
	public static JButton createCardButton(String title,String desc,JLabel optionLabel) {
		JButton selectFile = new JButton();
		selectFile.setLayout(new GridLayout(3,1,0,0));
		selectFile.setPreferredSize(new Dimension(580,160));
		JLabel titleLabel = new JLabel(title);
		titleLabel.setFont(new Font(Font_Uniform,FontStyle_Uniform,18));
		JLabel descLabel = new JLabel(desc);
		setUniformFont(descLabel,optionLabel);
		
		selectFile.add(titleLabel);
		selectFile.add(descLabel);
		selectFile.add(optionLabel);
		selectFile.setBackground(Color.WHITE);
		return selectFile;
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
						toggleMenuChangeStyle(m.getName(), otherMenu->{
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
	 * 当点击菜单列表里某个菜单，对其余菜单的操作，通常用用于翻转取反
	 * @param menuName
	 * @param bfunc
	 */
	public static void toggleMenuChangeStyle(String menuName,Consumer<JButton> bfunc) {
		if(menuList==null || menuName==null) {
			return;
		}
		for(JButton menu:menuList) {
			if(!menuName.equals(menu.getName())) {
				bfunc.accept(menu);
			}
		}
	}

	/**
	 * 添加按钮鼠标侦听器
	 * @param button
	 * @param operation 鼠标点击的操作，侦听线程中不能绑定耗时操作
	 */
	public static void addButtomListener(JButton button,Consumer<JButton> operation) {
		button.addMouseListener(new MouseListener() {
			
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
				if(button.equals(e.getSource())) {
					operation.accept(button);
				}
				
			}
		});
	}
	
	/**
	 * 添加面本容器的层次侦听器，当面板显示层次发生改变式触发
	 * @param panel
	 * @param operation 对侦听面板的操作，侦听线程中不能绑定耗时操作
	 */
	public static void addHierarchyListener(JPanel panel,Consumer<JPanel> operation) {
		
		panel.addHierarchyListener(new HierarchyListener() {

			@Override
			public void hierarchyChanged(HierarchyEvent e) {
				if(e.getSource().equals(panel)) {
					if(operation!=null) {
						operation.accept(panel);
					}
				}
			}
		});
	}
	
	
}
