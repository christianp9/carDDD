package com.car.carDDD.shared.domain;

import com.car.carDDD.infrastructure.exception.IdrankException;
import com.car.carDDD.infrastructure.exception.idEmptyException;

public class id {

	private final String value;

	public id(String value) {
		if (value.isEmpty()) {
			throw new idEmptyException();
		} else if (value.length() > 64 || value.length() < 32) {
			throw new IdrankException();
		}

		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
