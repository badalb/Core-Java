package com.test.decorator;

public class SprortsCarDecorator extends CarDecorator {

	SprortsCarDecorator(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Sports Car Assemble");

	}

}
