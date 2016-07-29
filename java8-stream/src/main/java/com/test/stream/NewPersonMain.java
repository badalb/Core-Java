package com.test.stream;

import java.util.Map;
import java.util.stream.Collectors;

public class NewPersonMain {

	public static void main(String[] args) {

		Map<Integer, String> personMap = Person.persons.stream()
				.collect(Collectors.toMap(s -> s.age, s -> s.name, (name1, name2) -> name1 + ";" + name2));
		personMap.forEach((k, v) -> System.out.println("Age :" + k + "Name :" + v));

	}

}
