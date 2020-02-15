package com.car.carDDD.shared.domain;

import com.car.carDDD.infrastructure.exception.colorVoidException;

public class quantity {
	private final String value;
	
	
	public quantity(String value) {
		if (value.isEmpty()) {
			throw new colorVoidException();
		}
		
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}