package com.car.carDDD.domain.model;

import java.awt.Color;

import org.springframework.ui.Model;

public class carModelDomain {

	private String id;
	private String color;
	private Integer quantity;
	private String model;

	public static carModelDomain of(Id id, Color color, Quantity quantity, Model model) {
		return new(id, color, quantity, model)
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
