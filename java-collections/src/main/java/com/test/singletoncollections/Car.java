package com.test.singletoncollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Car {

	private String name;

	private String manufacturer;

	private String yearLaunched;

	private Integer seatingCapacity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getYearLaunched() {
		return yearLaunched;
	}

	public void setYearLaunched(String yearLaunched) {
		this.yearLaunched = yearLaunched;
	}

	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((seatingCapacity == null) ? 0 : seatingCapacity.hashCode());
		result = prime * result + ((yearLaunched == null) ? 0 : yearLaunched.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (seatingCapacity == null) {
			if (other.seatingCapacity != null)
				return false;
		} else if (!seatingCapacity.equals(other.seatingCapacity))
			return false;
		if (yearLaunched == null) {
			if (other.yearLaunched != null)
				return false;
		} else if (!yearLaunched.equals(other.yearLaunched))
			return false;
		return true;
	}

	public Car(String name, String manufacturer, String yearLaunched, Integer seatingCapacity) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.yearLaunched = yearLaunched;
		this.seatingCapacity = seatingCapacity;
	}

	public static void main(String[] args) {
		
		Car vwPolo = new Car("VW POLO", "Volkswagen", "2010", 4);
		Car hondaCity = new Car("Honda City", "Honda", "2010", 5);
		
		List<Car> carList =  new ArrayList<Car>();
		carList.add(vwPolo);
		carList.add(hondaCity);
		
		List<Car> singletonList = Collections.unmodifiableList(carList);
		Car audiA4 = new Car("Audi A4", "Audi", "2010", 5);

		singletonList.add(audiA4);
		
	}

}
