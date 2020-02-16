package com.cod.wanda.commons.functions;

import java.util.function.Function;

public interface STR {

	
	public interface Verify{
		
		Function<String, Boolean> Digit = (str)->{
			if(str==null || "".equals(str)) {
				return false;
			}
			for (int i = 0; i < str.length(); i++){
				if (!Character.isDigit(str.charAt(i))){
					return false;
					}
			}
			return true;
		};
	}
	
	
}
