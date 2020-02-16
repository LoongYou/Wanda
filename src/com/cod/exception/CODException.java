package com.cod.exception;

public class CODException extends Throwable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7913816964824586799L;

	public CODException() {
		super();
	}
	
	
	public CODException(String message,Throwable e) {
		super(message,e);
	}
	
	
	
}
