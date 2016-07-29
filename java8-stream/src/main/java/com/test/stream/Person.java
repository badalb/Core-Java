package com.test.stream;

import java.util.Arrays;
import java.util.List;

public class Person {

	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static List<Person> getPersons() {
		return persons;
	}

	@Override
	public String toString() {
		return name;
	}

	public static List<Person> persons = Arrays.asList(new Person("Max", 18), new Person("Peter", 23),
			new Person("Pamela", 23), new Person("David", 12));
}
