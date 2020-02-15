package com.car.carDDD.infrastructure.exception;

public class modelEmptyException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public modelEmptyException() {
		super("model vacio");
	}

}
