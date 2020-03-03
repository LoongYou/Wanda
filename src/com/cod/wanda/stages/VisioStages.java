package com.cod.wanda.stages;

import com.cod.wanda.commons.constants.FieldCollocations.Page;
import com.cod.wanda.commons.constants.FieldCollocations.Shape;
import com.cod.wanda.util.Produce;
import com.cod.wanda.util.StringMap;

import visiotool.IVHyperlink;
import visiotool.IVHyperlinks;
import visiotool.IVPage;
import visiotool.IVShape;
import visiotool.IVShapes;

public interface VisioStages {

	/**
	 * 工序：处理page对象信息
	 * @param config
	 * @param page
	 * @return
	 */
	default Produce<IVPage> pageStages(StringMap config,IVPage page) {
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
		return Produce.out(pageConfig, page);
	}
	
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
