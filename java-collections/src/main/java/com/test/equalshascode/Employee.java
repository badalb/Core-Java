package com.test.equalshascode;

import java.util.HashMap;
import java.util.Map;

public class Employee {

	private String name;

	private Integer age;

	private Long id;

	private Double salary;
	

	public Employee(String name, Integer age, Long id, Double salary) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	//
	//
	// @Override
	// public int hashCode() {
	// final int prime = 31;
	// int result = 1;
	// result = prime * result + (int) (id ^ (id >>> 32));
	// return result;
	// }

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public static void main(String[] args) {
		
		Employee emp =  new Employee("John Doe", 32, 1L, 5500.00);
		Map<Long,Employee> empMap = new HashMap<Long, Employee>();
		empMap.put(emp.getId(), emp);
		System.out.println(empMap.get(1L));
		
		Employee newEmp =  new Employee("John Doe", 32, 1L, 5500.00);
		empMap.put(emp.getId(), newEmp);
		
		
		//Although two objects are equal they have different hashcode so when the map key is same it replaces 
		//the existing object with new object 
		System.out.println(empMap.get(1L));
		
		System.out.println(emp.equals(newEmp));

	}

}
