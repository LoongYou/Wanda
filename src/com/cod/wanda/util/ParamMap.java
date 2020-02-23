package com.cod.wanda.util;

import java.util.HashMap;

/**
 * 一个通用的适用于属性组合映射关系传参的Map类
 * @author Yulong
 *
 * @param <V>
 */
public class ParamMap<V> extends HashMap<String, V>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 判断给定的键对应的值和给定的值是否相等
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean match(String key,V value) {
		if(key==null) {
			return false;
		}
		if(this.containsKey(key)) {
			V v = this.get(key);
			if(v==null && value==null) {
				return true;
			}
			if(v!=null && v.equals(value)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 获取对象
	 * @param key
	 * @return
	 */
	public Object getObject(String key) {
		Object obj = this.get(key);
		if(obj==null) {
			return null;
		}else {
			return obj;
		}
	}
	
	
	
	/**
	 * 获取对象对应的字符串输出
	 * @param key
	 * @return
	 */
	public String getString(String key) {
		V v = this.get(key);
		if(v==null) {
			return "";
		}else {
			return v.toString();
		}
	}
	
}
