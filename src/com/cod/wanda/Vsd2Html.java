package com.cod.wanda;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;

import com4j.Com4jObject;
import visiotool.ClassFactory;
import visiotool.IVApplication;
import visiotool.IVCell;
import visiotool.IVDocument;
import visiotool.IVHyperlink;
import visiotool.IVHyperlinks;
import visiotool.IVPage;
import visiotool.IVShape;
import visiotool.IVShapes;


public class Vsd2Html {
	public static void main(String[] args) {
		System.out.println("start");
		
		// TODO Auto-generated method stub

				//vsd vsdx文件路径
				String filePath = "D:\\javaTest\\demo.vsdx";
				//输出文件夹
				String outputDir = "D:\\javaTest\\output";
				
				// 创建Visio对象
				IVApplication app = ClassFactory.createApplication();
				
				// Visio对象设置为可见
				app.visible(true);
				
				// 打开一个Visio文件
				IVDocument doc = app.documents().open(filePath);
				
				// 创建一个Dom4j类型的Document对象
				Document xmlDoc = DocumentHelper.createDocument();
				Element root = xmlDoc.addElement("page");
				try {
					// 只读取Visio文档中第一个页面的信息
					IVPage page = doc.pages().itemFromID(0);
					// 读取Page对象的长和宽，并转化为像素单位（乘以96）
					root.addAttribute("宽：", "" + ((int) (page.pageSheet().cells("PageWidth").resultIU() * 96)));
					root.addAttribute("高：", "" + ((int) (page.pageSheet().cells("PageHeight").resultIU() * 96)));
					
					//获取page下的所有shape
					IVShapes shapes = page.shapes();
					
					//将页面保存为svg矢量图片，保证放大不会失真
					page.export(outputDir + "\\" + page.name() + ".svg");
					
					System.out.println("shapes=" + shapes.count());
					// 遍历该Page对象中所有的Shape对象
					for (int shapeCount = 1; shapeCount <= shapes.count(); shapeCount++) {
						IVShape shape = shapes.itemU(shapeCount);

						/*获取shap必要的信息,这些信息用于支持展示流程图的时候html页面执行的操作，如超链接、上一个节点、下一个节点、甚至是修改节点文本、超链接等等
						* 这些信息包括：
						* 模型坐标
						* 模型大小
						* 模型ID
						* 模型文本
						* 模型超链接
						* 模型
						*/
						
						//即你在这个模具输入的文本
						String text = shape.text();
						
						//所在page里面唯一id
						int id = shape.id();
						
						//和id相同
						short id16 = shape.iD16();

						//模具名称
						String name = shape.name();
						
						//如果是输入Sheet中登记的，等于Sheet.+id
						String nameID = shape.nameID();
						
						//英文名称
						String nameU = shape.nameU();
						
						//x坐标和y坐标，原单位是英寸，需要转换为厘米
						double pinx = shape.cells("PinX").resultIU() * 25.4;
						double piny = shape.cells("PinY").resultIU() * 25.4;

						//超链接集合
						IVHyperlinks hypers = shape.hyperlinks();
//						IVHyperlink link1 = hypers.item(0);
//						String address = link1.address();
//						String description = link1.description();
//						String subAddress = link1.subAddress();
						
//						System.out.println("address="+address);
//						System.out.println("description="+description);
//						System.out.println("subAddress="+subAddress);
						
//						if(name!=null && name.equals("跨页引用")) {
//							IVHyperlink link = shape.hyperlink();
//							String address = link.address();
//							String description = link.description();
//							String subAddress = link.subAddress();
//							
//							System.out.println("address="+address);
//							System.out.println("description="+description);
//							System.out.println("subAddress="+subAddress);
//						}
						short hcount = hypers.count();
						Iterator<Com4jObject> iter = hypers.iterator();
						while(iter.hasNext()) {
							System.out.println(iter.next());
						}
						
						
//						if(hcount>0) {							
//							IVHyperlink item = hypers.item(0);
//							String address = item.address();
//							String description = item.description();
//							String subAddress = item.subAddress();
//							
//							System.out.println("address="+address);
//							System.out.println("description="+description);
//							System.out.println("subAddress="+subAddress);
//							
//							
//						}
						
						
						System.out.println("text="+text);
						System.out.println("id="+id);
						System.out.println("id16="+id16);
						System.out.println("name="+name);
						System.out.println("nameID="+nameID);
						System.out.println("nameU="+nameU);
						System.out.println("pinx="+pinx);
						System.out.println("piny="+piny);
						System.out.println("hypers="+hypers);
						System.out.println("hcount="+hcount);
						
						
						System.out.println("PinX=" + shape.cells("PinX").resultIU() * 25.4);
						// System.out.println("自定义属性="+shape.cellsU("Prop.equ").result(new String()));

						// 找出被我们事先标识了的Shape对象进行进一步处理
						if (text.length() > 0) {
							// 在page元素下面新建一个shape元素
							Element shapeElement = root.addElement("shape");
							// 为shape元素添加id,height,width,x,y等属性
							shapeElement.addAttribute("id", text);
							shapeElement.addAttribute("height", "" + ((int) (shape.cells("Height").resultIU() * 96)));
							shapeElement.addAttribute("width", "" + ((int) (shape.cells("Width").resultIU() * 96)));
							shapeElement.addAttribute("x", "" + ((int) (shape.cells("PinX").resultIU() * 96)));
							shapeElement.addAttribute("y", "" + ((int) (shape.cells("PinY").resultIU() * 96)));
							shape.export(outputDir + "\\" + text + ".svg");

						}
					}
					//doc.saved(true);
				} finally {
					doc.close();// 关闭打开的文件
					app.quit();// 退出Visio应用程序
				}
				try {
					// lets write to a file
					XMLWriter writer = new XMLWriter(new FileWriter("output.xml"));
					writer.write(xmlDoc);
					writer.close();
				} catch (IOException e) {

				}
		
	}
}
