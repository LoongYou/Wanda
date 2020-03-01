package com.cod.wanda.util;

import com.cod.util.RSC;

/**
 * 工序产出出对象，提供规范的工作流式函数入参和出参形式
 * @author Yulong
 *
 */
public class Produce<P>{
	
	/**当工序完成，应当基于后续工序对应的操作信息*/
	public final StringMap config;
	/**工序的产出物*/
	public final P product;
	/**工序的执行结果*/
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

	/**
	 * 返回工序的产出和执行结果
	 * @param product
	 * @param result
	 * @return
	 */
	public static <T> Produce<T> out(T product, int result){
		return new Produce<T>(product,result);
	}
	
	/**
	 * 返回工序的配置、产出
	 * @param config
	 * @param product
	 * @return
	 */
	public static <T> Produce<T> out(StringMap config,T product){
		return new Produce<T>(config,product);
	}

	/**
	 * 返回工序的配置、产出、结果
	 * @param config
	 * @param product
	 * @param result
	 * @return
	 */
	public static <T> Produce<T> out(StringMap config,T product, int result){
		return new Produce<T>(config,product,result);
	}


	
}
