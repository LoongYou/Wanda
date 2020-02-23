package com.cod.wanda.commons.constants;

/**
 * 属性组合接口类,将每个工作中所需的属性字段名放在对应的接口内，在参数传递过程中，
 * 使用这些字段名作为key值，从而避免DTO传参模式带来的代码泛滥和重复建模
 * 通常，你可以通过从CollocationsKey类继承而来定义一个组合接口类，然后在测试环节或者
 * 程序执行前执行调用接口类的构造方法，其完成字段唯一性自检。
 * @author YL
 *
 */
public class Collocations extends CollocationsKey{
	
	public Collocations() throws IllegalArgumentException, IllegalAccessException {
		super();
	}


	/**
	 * VISIO Doc对象
	 * @author Yulong
	 *
	 */
	public interface Doc {
		String Name = CreateKey("Name");
		String PageCount = CreateKey("PageCount");
		
	}
	
	/**
	 * VISIO Page对象
	 * @author Yulong
	 *
	 */
	public interface Page {
		String Name = CreateKey("Name");
	}
	
	
	/**
	 * VISIO shape对象
	 * @author Yulong
	 *
	 */
	public interface Shape {
		
		/**这个模具上显示的文本*/
		String Text = "shapeText";
		/**在page中的唯一id*/
		String Id = "Id";
		/**和id相同*/
		String Id16 = "Id16";
		/**模具名称*/
		String Name = "Name";
		/**sheet.+id*/
		String NameId = "NameId";
		/**英文名称*/
		String NameU = "NameU";
		/**超链接地址*/
		String HyerLinkAddress = "shapeHyerLinkAddress";
		/**超链接描述*/
		String HyerLinkDescription = "HyerLinkDescription";
		/**超链接子地址*/
		String HyerLinkSubAddress = "HyerLinkSubAddress";
		
		
		/**坐标X*/
		String PinX = "PinX";
		/**坐标y*/
		String PinY = "PinY";
		/**宽*/
		String Width = "Width";
		/**高*/
		String Height = "Height";
		/**起始点x*/
		String BeginX = "BeginX";
		/**起始点y*/
		String BeginY = "BeginY";
		/**结束点x*/
		String EndX = "EndX";
		/**结束点y*/
		String EndY = "EndY";
		/**页宽*/
		String PageWidth = "PageWidth";
		/**页高*/
		String PageHeight = "PageHeight";
	}


	public static void main(String[] args) throws Exception {
//		Collocations coll = new Collocations();
//		Class<?>[] interfaces = coll.getInnerInterface();
//		for(Class<?> c:interfaces) {
//			coll.getInterfaceFields(c);
//		}
		new Collocations();
		initKey();
		System.out.println(Doc.Name);
		System.out.println(Doc.PageCount);
		System.out.println(Page.Name);
		System.out.println(keySet);System.out.println(conflictKeyList);
	}
}
