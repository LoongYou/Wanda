package com.cod.wanda.commons.constants;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 属性组合接口类,将每个工作中所需的属性字段名放在对应的接口内，在参数传递过程中，
 * 使用这些字段名作为key值，从而避免DTO传参模式带来的代码泛滥和重复建模。
 * 通常，你可以通过继承Collocations类来定义一个组合接口类，然后在测试环节或者
 * 程序执行前执行调用接口类的构造方法，其完成字段初始化和唯一性自检。
 * @author Yulong
 *
 */
public class Collocations {
	
	/**所有属性的字段的对应的key值，是以字段所在的类全限定名+给定的字段名组成，参考{@link #createKey(String)}
	 * 即是不同的类里面有相同的字段名，key值也不会相同，但是同一个类中字段名是可能人为重复的
	 */
	static Set<String> keySet = new HashSet<>();
	/**冲突的key值列表*/
	static List<String> conflictKeyList = new ArrayList<>();
	
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
	 * 创建key值，该方法可以将当前接口名和给定的key值组合为唯一的键
	 * @param keyName
	 * @return
	 */
	static String createKey(String keyName) {
		String key = Thread.currentThread().getStackTrace()[2].getClassName()+"."+keyName;
		if(keySet.contains(key)) {
			conflictKeyList.add(key);
		}
		keySet.add(key);
		return key;
	}
	
	/**
	 * 在组合键建模的模式下，java尚未有属性赋值唯一性校验机制，所以需要在使用前初始化key并检查是否有冲突
	 * @throws Exception
	 */
	static void initKey() throws Exception {
		if(conflictKeyList.size()>0) {
			throw new Exception("key冲突："+conflictKeyList);
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
