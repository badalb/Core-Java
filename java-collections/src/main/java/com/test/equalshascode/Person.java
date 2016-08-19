package com.test.equalshascode;

import java.util.HashMap;
import java.util.Map;

public class Person {


	private String name;

	private Integer age;

	private Long id;

	private Double salary;
	

	public Person(String name, Integer age, Long id, Double salary) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	 
	 
	public static void main(String[] args) {
		
		Person emp =  new Person("John Doe", 32, 1L, 5500.00);
		Map<Long,Person> empMap = new HashMap<Long, Person>();
		empMap.put(emp.getId(), emp);
		System.out.println(empMap.get(1L));
		
		Person newEmp =  new Person("John Doe", 32, 1L, 5500.00);
		empMap.put(emp.getId(), newEmp);
		
		// If both equals and hashcode both overridden properly because the equals returns true and hash code are equal
		// so it represents the same old object.
		System.out.println(empMap.get(1L));
		
		System.out.println(emp.equals(newEmp));

	}


}
