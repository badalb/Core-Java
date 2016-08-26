package com.test.decorator;

public class CarDecorator implements Decorator, Car {

	private Car car;

	CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public void assemble() {
		this.car.assemble();

	}

}
