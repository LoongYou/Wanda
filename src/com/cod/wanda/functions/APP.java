package com.cod.wanda.functions;

import java.util.function.Supplier;

import visiotool.ClassFactory;
import visiotool.IVApplication;

public interface APP {
	
	Supplier<IVApplication> create = ()->{
		
		//创建Visio对象
		IVApplication app = ClassFactory.createApplication();
		//Visio对象设置为可见
		app.visible(true);
		return app;
	};
	
	
}
