package com.car.carDDD.infrastructure.restdto;

import lombok.Getter;
import lombok.Setter;

public class carRestDto {
	@Getter
	@Setter
	private String id;
	@Getter
	@Setter
	private String model;
	@Getter
	@Setter
	private Integer quantity;
	@Getter
	@Setter
	private String color;
	
	public carRestDto(String id, String model, Integer quantity, String color) {
		this.id = id;
		this.model = model;
		this.quantity = quantity;
		this.color = color; 
	}
	public carRestDto() {}
}
