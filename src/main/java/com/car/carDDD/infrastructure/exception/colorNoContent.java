package com.car.carDDD.infrastructure.exception;

public class colorNoContent extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public colorNoContent() {
		super("color no encontrado");
	}

}
