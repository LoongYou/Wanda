package com.cod.wanda.flow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import com.cod.wanda.commons.constants.FieldCollocations.Doc;
import com.cod.wanda.stages.HtmlStages;
import com.cod.wanda.stages.VisioStages;
import com.cod.wanda.util.Produce;
import com.cod.wanda.util.StringMap;

import visiotool.IVDocument;
import visiotool.IVPage;
import visiotool.IVPages;
import visiotool.IVShape;

public class ExecuteFlow implements VisioStages,HtmlStages{
	
	
	private volatile BiFunction<StringMap,Produce<?>,Produce<?>> lastStep;
	private List<String> stageLink = new LinkedList<String>();
	
	public ExecuteFlow() {
		stageLink.add("docStages");
		stageLink.add("pageStages");
		stageLink.add("htmlPageStage");
	}
	

	public StringMap singleDoc(StringMap config,Function<List<IVPage>,StringMap> func) {
		
		
		Produce<IVDocument> doc = stageStep("1", ()->{
			return docStages(config);
		});
		
		Produce<IVDocument> doc = docStages(config);
		int pageCount = Integer.parseInt(doc.config.get(Doc.pageCount));
		List<IVPage> pageList = new ArrayList<>();
		for(int i = 0;i<pageCount;i++) {
			pageList.add(doc.product.pages().itemFromID(i));
		}
		
		stageStep("a",()->{
			return pageStages(config, doc);
		});
		pageStages(config, pageList);
		if(stageSite(func)!=null)return config;
		for(IVPage page:pageList) {			
			IVShape shape;
			shapeStages(config, shape);
			String html;
			htmlPageStage(config, html);
		}

		return null;

		
	}

	public StringMap con() {
		StringMap config = null;
		return singleDoc(config,list->{
			return config;
		});
		
		
	}
	
	
	
	public StringMap stageSite(Function<List<IVPage>,StringMap> func) {
		return null;
		
	}
	
	
	public <P> Produce<P> stageStep(String step,Supplier<Produce<P>> func){
		
		
		return func.get();
		
//		pagest.apply(t, u)
//		
//		if(produce.result==Sucess) {
//			lastStep = currStep;
//		}
//		if(produce!=null) {
//		}
		return null;
	}
	
}
