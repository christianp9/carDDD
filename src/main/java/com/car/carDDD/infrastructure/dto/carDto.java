package com.car.carDDD.infrastructure.dto;

import lombok.Getter;
import lombok.Setter;

public class carDto extends baseDto {
	
	static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private String model;
	@Getter
	@Setter
	private Integer quantity;
	@Getter
	@Setter
	private String color;

}
