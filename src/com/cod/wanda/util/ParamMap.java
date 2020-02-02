package com.cod.wanda.util;

import java.util.HashMap;

public class ParamMap<V> extends HashMap<String, V>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	
	
	public <T> T getObject(String key) {
		V v = this.get(key);
		if(v==null) {
			return null;
		}else {
			return (T) v;
		}
	} 
	
	public String getString(String key) {
		V v = this.get(key);
		if(v==null) {
			return "";
		}else {
			return v.toString();
		}
	}
	
}
