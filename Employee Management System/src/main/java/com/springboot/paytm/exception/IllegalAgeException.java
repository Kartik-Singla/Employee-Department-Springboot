package com.springboot.paytm.exception;

public class IllegalAgeException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalAgeException(String message) {
		super(message);
	}
	
	
}
