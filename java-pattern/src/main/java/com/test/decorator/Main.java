package com.test.decorator;

public class Main {

	public static void main(String[] args) {
		Car sportsCar = new SprortsCarDecorator(new BasicCar());
		sportsCar.assemble();
	}

}
