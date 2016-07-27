package com.test;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static List<Apple> filterApple(List<Apple> inventory, ApplePredicate p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		List<Apple> inventory = new ArrayList<>();
		inventory.add(new Apple(160, COLOR.GREEN, "USA"));
		inventory.add(new Apple(140, COLOR.RED, "USA"));
		inventory.add(new Apple(160, COLOR.RED, "IND"));
		inventory.add(new Apple(170, COLOR.GREEN, "IND"));

		List<Apple> greenApple = filterApple(inventory, new AppleGreenColorPredicate());
		List<Apple> heavyApple = filterApple(inventory, new AppleHeavyWeightPredicate());

		greenApple.forEach(System.out::println);
		heavyApple.forEach(System.out::println);

	}

}
