package com.cod.wanda.stages;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

import com.cod.util.Log;
import com.cod.wanda.commons.constants.FieldCollocations.Doc;
import com.cod.wanda.commons.constants.FieldCollocations.Page;
import com.cod.wanda.commons.constants.FieldCollocations.Shape;
import com.cod.wanda.commons.constants.OptionCollocations.UserOptions;
import com.cod.wanda.util.Produce;
import com.cod.wanda.util.StringMap;

import visiotool.ClassFactory;
import visiotool.IVApplication;
import visiotool.IVDocument;
import visiotool.IVDocuments;
import visiotool.IVHyperlink;
import visiotool.IVHyperlinks;
import visiotool.IVPage;
import visiotool.IVPages;
import visiotool.IVShape;
import visiotool.IVShapes;

/**
 * 工序，原则：只加工不改变性质,例如输入一个组件A，则返回也是A和对应的信息，而产出物应当是在加工过程中获得的，
 * 通过传入函数，你可以对加工过程中的产出物进行提取或者消费等其他操作，这样既可以维护原有工序的原子性，也可以进行嵌入式的流程开发，
 * 即工序和流程分离开来。传统的方法调方法串流程方式，无法避免如新增一个字段就需要动整个流程此类的问题，而通过函数式编程的延迟执行特点，
 * 方法外的参数可以直接被方法内的函数使用，不需要再改变方法的入参，大大降低复杂度和冗余度。
 * 这种开发模式在以前，只能用传统的java接口式开发来实现，即入参是接口，但是由于接口方法中入参变量没有不可变性，有很大的副作用，所以也被称为侵入式开发，
 * 而现在我们可以使用函数式特性来做了。
 * 
 * 工序和流程，可以理解为，工序是必需做的，流程是可选择的。流程将多个工序组合，并且在工序执行过程中，有选择的嵌入
 * @author Yulong
 *
 */
public interface VisioStages extends Log{
	

	
	/**
	 * 工序：处理doc对象信息
	 * @param <T>
	 * @param config
	 * @param filePath
	 * @return
	 */
	default Produce<IVDocument> docStages(StringMap config) {
		StringMap docConfig = new StringMap();

		// 创建Visio对象
		IVApplication app = ClassFactory.createApplication();
		// Visio对象设置为可见
		app.visible(true);
		// 打开一个Visio文件
		IVDocuments docs = app.documents();
		IVDocument doc = docs.open(config.get(UserOptions.sourceFilePath));
		docConfig.put(Doc.path, doc.path());
		docConfig.put(Doc.name, doc.name());
		docConfig.put(Doc.creator, doc.creator());
		docConfig.put(Doc.alternateNames, doc.alternateNames());

		IVPages pages = doc.pages();
		if (pages != null) {
			docConfig.put(Doc.pageCount, String.valueOf(pages.count()));
		}
		Info("document has opened");
		
		doc.close();
		return Produce.out(docConfig, doc);
	}
	
	BiFunction<StringMap, Produce<IVDocument>, Produce<IVDocument>> docst = (config,doc)->{
		return doc;
		
	};
	
	BiFunction<StringMap, Produce<IVDocument>, Produce<List<IVPages>>> pagest = (config,doc)->{
		return null;
		
	};
	
	
/*	*//**
	 * 工序：处理page对象信息
	 * @param config
	 * @param page
	 * @return
	 *//*
	default Produce<IVPage> pageStages(StringMap config,List<IVPage> pageList) {
		StringMap pageConfig = new StringMap();
		//获取page下的所有shape
		IVShapes shapes = page.shapes();
		if(shapes!=null) {
			pageConfig.put(Page.shapeCount, String.valueOf(shapes.count()));
		}
		pageConfig.put(Page.name, page.name());
		// 读取Page对象的长和宽，并转化为像素单位（乘以96）
		pageConfig.put(Page.width, String.valueOf(page.pageSheet().cells("PageWidth").resultIU() * 96));
		pageConfig.put(Page.height, String.valueOf(page.pageSheet().cells("PageHeight").resultIU() * 96));
		return Produce.out(pageConfig, pageList);
	}
	*/
	/**
	 * 工序：处理shape对象信息
	 * @param config
	 * @param shape
	 * @return
	 */
	default Produce<IVShape> shapeStages(StringMap config,IVShape shape) {

		/*获取shap必要的信息,这些信息用于支持展示流程图的时候html页面执行的操作，如超链接、上一个节点、下一个节点、甚至是修改节点文本、超链接等等
		* 这些信息包括：
		* 模型坐标
		* 模型大小
		* 模型ID
		* 模型文本
		* 模型超链接
		* 模型引入对象
		* 模型引出对象
		*/
		
		StringMap shapeConfig = new StringMap();
		
		shapeConfig.put(Shape.text, shape.text());
		shapeConfig.put(Shape.id, String.valueOf(shape.id()));
		shapeConfig.put(Shape.id16, String.valueOf(shape.iD16()));
		shapeConfig.put(Shape.name, shape.name());
		shapeConfig.put(Shape.nameId, shape.nameID());
		shapeConfig.put(Shape.nameU, shape.nameU());
		shapeConfig.put(Shape.PinX, String.valueOf(shape.cells("PinX").resultIU() * 96));
		shapeConfig.put(Shape.PinY, String.valueOf(shape.cells("PinY").resultIU() * 96));
		shapeConfig.put(Shape.Width, String.valueOf(shape.cells("Width").resultIU() * 96));
		shapeConfig.put(Shape.Height, String.valueOf(shape.cells("Height").resultIU() * 96));
		shapeConfig.put(Shape.index, String.valueOf(shape.index()));
		shapeConfig.put(Shape.index16, String.valueOf(shape.index16()));
		IVHyperlinks hypers = shape.hyperlinks();
		short hcount = hypers.count();
		if(hcount>0) {
			IVHyperlink item = hypers.item(0);
			shapeConfig.put(Shape.hyerLinkAddress, item.address());
			shapeConfig.put(Shape.hyerLinkDescription, item.address());
			shapeConfig.put(Shape.hyerLinkSubAddress, item.subAddress());
		}
		return Produce.out(shapeConfig, shape);

	}
}
