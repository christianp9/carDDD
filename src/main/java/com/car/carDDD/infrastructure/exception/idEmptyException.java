package com.car.carDDD.infrastructure.exception;

public class idEmptyException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public idEmptyException() {
		super("llene el campo id");
	}

}
