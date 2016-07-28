package com.test.lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparing;

public class Lamdas {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> addition = (x, y) -> x + y;
		System.out.println("calling addition of 2 and 3 resulting: " + addition.apply(2, 3));

		Runnable r = () -> System.out.println("Hi there");
		r.run();

		Comparator<Apple> c = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
		List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));

		inventory.sort(c);
		inventory.forEach(System.out::println);

		List<Apple> greenApple = filter(inventory, getAppleOfColor("green"));
		greenApple.forEach(System.out::println);

		inventory.sort(comparing(Apple::getWeight));

		inventory.forEach(System.out::println);

	}

	public static Predicate<Apple> getAppleOfColor(String color) {
		return (Apple a) -> a.getColor().equalsIgnoreCase(color);
	}

	public static List<Apple> filter(List<Apple> inventory, Predicate<Apple> predicate) {
		return inventory.stream().filter(predicate).collect(Collectors.<Apple>toList());
	}

	public static class Apple {
		private int weight = 0;
		private String color = "";

		public Apple(int weight, String color) {
			this.weight = weight;
			this.color = color;
		}

		public Integer getWeight() {
			return weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String toString() {
			return "Apple{" + "color='" + color + '\'' + ", weight=" + weight + '}';
		}
	}

}
