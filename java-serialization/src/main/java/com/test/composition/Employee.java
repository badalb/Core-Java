package com.test.composition;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5597685283358068162L;

	private String name;
	
	private String address;
	
	private Department department;
	
	public Employee(String name, String address){
		this.name = name;
		this.address = address;
		this.department = new Department();
	}
	
	public Employee(String name, String address, Department dept){
		this.name = name;
		this.address = address;
		this.department = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
}
