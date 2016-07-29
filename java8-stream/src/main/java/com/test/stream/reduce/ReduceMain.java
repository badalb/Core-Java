package com.test.stream.reduce;

import java.util.List;

import com.test.stream.Person;

public class ReduceMain {

	public static void main(String[] args) {

		List<Person> persons = Person.persons;
		persons.stream().reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2).ifPresent(System.out::println);

	}

}
