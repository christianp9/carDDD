package com.car.carDDD.infrastructure.exception;

public class colorVoidException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public colorVoidException() {
		super("elija un color");
	}

}
