package com.cod.wanda.stages;

import com.cod.functions.Text;
import com.cod.util.Log;
import com.cod.wanda.commons.constants.FieldCollocations.HtmlPage;
import com.cod.wanda.util.Produce;
import com.cod.wanda.util.StringMap;

public interface HtmlStages extends Log{

	String javascriptVarsAnchor = "//javascriptVarsAnchor";
	String svgContentAnchor = "<!-- svgContentAnchor -->";
	
	/**
	 * 工序：根据
	 * @param config
	 * @param html
	 * @return
	 */
	default Produce<String> htmlPageStage(StringMap config,String html){
		StringMap htmlPageConfig = new StringMap();
		htmlPageConfig.put(javascriptVarsAnchor, config.get(HtmlPage.javascriptVars));
		htmlPageConfig.put(svgContentAnchor, config.get(HtmlPage.visioSvgContent));
		Text.Insert.StringMap.apply(html, htmlPageConfig);
		return Produce.out(Text.Insert.StringMap.apply(html, htmlPageConfig), Sucess);
	}
	
}
