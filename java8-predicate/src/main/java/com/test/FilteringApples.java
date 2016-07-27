package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilteringApples {

	public static void main(String... args) {

		List<Apple> inventory = Arrays.asList(new Apple(80, COLOR.GREEN, "USA"), new Apple(155, COLOR.GREEN, "IND"),
				new Apple(120, COLOR.RED, "USA"));

		List<Apple> greenApples = filterApples(inventory, FilteringApples::isGreenApple);
		System.out.println(greenApples);

		List<Apple> heavyApples = filterApples(inventory, FilteringApples::isHeavyApple);
		System.out.println(heavyApples);

		List<Apple> greenApples2 = filterApples(inventory, (Apple a) -> COLOR.GREEN.equals(a.getColor()));
		System.out.println(greenApples2);

		List<Apple> heavyApples2 = filterApples(inventory, (Apple a) -> a.getWeight() > 150);
		System.out.println(heavyApples2);
	}

	public static boolean isGreenApple(Apple apple) {
		return COLOR.GREEN.equals(apple.getColor());
	}

	public static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
	}

	public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

}