package com.test.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{

	private String name;
	private double salary;
	private List<Employee> employees = new ArrayList<Employee>();
	
	public Manager(String name,double salary){
	  this.name = name;
	  this.salary = salary;
	 }

	
	public void add(Employee employee) {
		employees.add(employee);
	}

	public Employee getChild(int i) {
		return employees.get(i);
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void print() {
		System.out.println("-------------");
		System.out.println("Name =" + getName());
		System.out.println("Salary =" + getSalary());
		System.out.println("-------------");

		employees.forEach( e -> e.print());
	}

	public void remove(Employee employee) {
		employees.remove(employee);
	}

}
