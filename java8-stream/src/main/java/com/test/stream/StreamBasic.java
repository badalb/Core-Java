package com.test.stream;

import java.util.List;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class StreamBasic {

	public static void main(String... args) {
		List<String> filteredDish = filterDishesh(Dish.menu);
		filteredDish.forEach(System.out::println);
	}

	private static List<String> filterDishesh(List<Dish> dishes) {
		return dishes.stream().filter(d -> d.getCalories() > 500).sorted(comparing(Dish::getCalories))
				.map(Dish::getName).collect(toList());
	}
}
