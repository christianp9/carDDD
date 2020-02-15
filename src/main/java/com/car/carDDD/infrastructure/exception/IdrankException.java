package com.car.carDDD.infrastructure.exception;

public class IdrankException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public IdrankException() {
		super("el id no esta dentro del rango");
	}

}
