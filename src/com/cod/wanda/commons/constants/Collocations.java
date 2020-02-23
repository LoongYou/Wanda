package com.cod.wanda.commons.constants;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 属性组合接口类,将每个工作中所需的属性字段名放在对应的接口内，在参数传递过程中，
 * 使用这些字段名作为key值，从而避免DTO传参模式带来的代码泛滥和重复建模
 * 通常，你可以通过从Collocations类继承而来定义一个组合接口类，然后在测试环节或者
 * 程序执行前执行调用接口类的构造方法，其完成字段唯一性自检。
 * @author Yulong
 *
 */
public class Collocations {
	static Set<String> keySet = new HashSet<>();
	static List<String> conflictKeyList = new ArrayList<>();
	
	/**
	 * 创建key值，该方法可以将当前接口名和给定的key值组合为唯一的键
	 * @param keyName
	 * @return
	 */
	static String CreateKey(String keyName) {
		String key = Thread.currentThread().getStackTrace()[2].getClassName()+"."+keyName;
		if(keySet.contains(key)) {
			conflictKeyList.add(key);
		}
		keySet.add(key);
		return key;
	}
	
	/**
	 * 在组合键建模的模式下，java尚未有赋值唯一性校验机制，所以需要在使用前初始化key并检查是否有冲突
	 * @throws Exception
	 */
	static void initKey() throws Exception {
		if(conflictKeyList.size()>0) {
			throw new Exception("key冲突："+conflictKeyList);
		}
	}
	
	/**
	 * 创建的时候初始化内部接口以及接口中的所有常量，在默认构造方法上定义抛出异常，这样可以令子类也必需定义重写构造方法
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public Collocations() throws IllegalArgumentException, IllegalAccessException {
		Class<?>[] interfaces = getInnerInterface();
		for(Class<?> c:interfaces) {
			getInterfaceFields(c);
		}
	}
	
	/**
	 * 获取内部定义的接口
	 */
	public Class<?>[] getInnerInterface() {
		Class<?>[] interfaces = this.getClass().getClasses();
		System.out.println("size:"+interfaces.length);
		for(Class<?> c:interfaces) {
			System.out.println(c);
		}
		return interfaces;
	}
	
	/**
	 * 遍历接口中定义的所有常量，用于触发JVM自动初始化常量
	 * @param c
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public void getInterfaceFields(Class<?> c) throws IllegalArgumentException, IllegalAccessException {
		Field[] fields = c.getDeclaredFields();
		for(Field f:fields) {
			f.get(null);
		}
	}
	
	
}
