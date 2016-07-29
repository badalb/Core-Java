package com.test.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonMain {

	public static void main(String[] args) {
		List<Person> filtered = Person.persons.stream().filter(s -> s.name.startsWith("P"))
				.collect(Collectors.toList());
		filtered.forEach(s -> System.out.println(s.name));

		List<String> filteredResult = Person.persons.stream().filter(s -> s.name.startsWith("P")).map(s -> s.name)
				.collect(Collectors.toList());
		filteredResult.forEach(System.out::println);

		Map<Integer, List<Person>> groupByAge = Person.persons.stream().collect(Collectors.groupingBy(s -> s.age));
		groupByAge.forEach((s, p) -> System.out.println("Age :" + s + ", Person: " + p));

		Double avgAge = Person.persons.stream().collect(Collectors.averagingDouble(s -> s.age));
		System.out.println(avgAge);

		String phrase = Person.persons.stream().filter(p -> p.age >= 18).map(p -> p.name)
				.collect(Collectors.joining(" and ", "Hi ", " how r you today!!"));

		System.out.println(phrase);

	}

}
