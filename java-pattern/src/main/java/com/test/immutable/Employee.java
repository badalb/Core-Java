package com.test.immutable;

public final class Employee {

	private final String firstName;

	private final String lastName;

	private final String SSN;

	private final Car car;

	public Employee(String firstName, String lastName, String sSN, Car car) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		SSN = sSN;
		this.car = car;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSSN() {
		return SSN;
	}

	public Car getCar() throws CloneNotSupportedException {
		return (Car) car.clone();
	}

}
