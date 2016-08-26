package com.test.immutable;

public class Car implements Cloneable {

	private String model;

	private String manufacturer;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
