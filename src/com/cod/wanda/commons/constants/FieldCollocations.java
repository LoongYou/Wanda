package com.cod.wanda.commons.constants;

/**
 * 属性组合类,原则上属性名首字母小写
 * @author YL
 *
 */
public class FieldCollocations extends Collocations{
	
	public FieldCollocations() throws IllegalArgumentException, IllegalAccessException {
		super();
	}


	/**
	 * VISIO Doc对象
	 * @author Yulong
	 *
	 */
	public interface Doc {
		String name = CreateKey("name");
		String pageCount = CreateKey("pageCount");
		String alternateNames = CreateKey("alternateNames");
		String creator = CreateKey("creator");
		String path = CreateKey("path");
	}
	
	/**
	 * VISIO Page对象
	 * @author Yulong
	 *
	 */
	public interface Page {
		String name = CreateKey("name");
		String width = CreateKey("PageWidth");
		String height = CreateKey("PageHeight");
		String shapeCount = CreateKey("shapeCount");
	}
	
	
	/**
	 * VISIO shape对象
	 * @author Yulong
	 *
	 */
	public interface Shape {
		
		/**即你在这个模具输入的文本，通常遍历当前页面的第一个磨具应该是CFF容器*/
		String text = "text";
		/**在page中的唯一id*/
		String id = "id";
		/**和id相同*/
		String id16 = "id16";
		/**模具名称*/
		String name = "name";
		/**如果是输入Sheet中登记的，等于Sheet.+id*/
		String nameId = "nameId";
		/**英文名称*/
		String nameU = "nameU";
		/**超链接地址*/
		String hyerLinkAddress = "hyerLinkAddress";
		/**超链接描述*/
		String hyerLinkDescription = "hyerLinkDescription";
		/**超链接子地址*/
		String hyerLinkSubAddress = "hyerLinkSubAddress";
		
		String index = CreateKey("index");
		String index16 = CreateKey("index16");
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
	}


	public static void main(String[] args) throws Exception {
//		Collocations coll = new Collocations();
//		Class<?>[] interfaces = coll.getInnerInterface();
//		for(Class<?> c:interfaces) {
//			coll.getInterfaceFields(c);
//		}
		new FieldCollocations();
		initKey();
		System.out.println(Doc.name);
		System.out.println(Doc.pageCount);
		System.out.println(Page.name);
		System.out.println(keySet);System.out.println(conflictKeyList);
	}
}
