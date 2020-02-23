package com.cod.wanda.util;

import com.cod.util.RSC;

/**
 * 工作流产出对象，
 * @author Yulong
 *
 */
public class Produce<P>{
	
	public final StringMap config;
	public final P product;
	public final int result;//失败应当回滚
	
	
	public Produce(P product, int result){
		this.config = null;
		this.product = product;
		this.result = result;
	}
	
	public Produce(StringMap config, P product){
		this.config = config;
		this.product = product;
		this.result = RSC.Sucess;
	}
	
	public Produce(StringMap config, P product, int result){
		this.config = config;
		this.product = product;
		this.result = result;
	}

	public static <T> Produce<T> out(T product, int result){
		return new Produce<T>(product,result);
	}
	
	public static <T> Produce<T> out(StringMap config,T product){
		return new Produce<T>(config,product);
	}

	public static <T> Produce<T> out(StringMap config,T product, int result){
		return new Produce<T>(config,product,result);
	}


	
}
