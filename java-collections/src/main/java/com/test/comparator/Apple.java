package com.test.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Apple {

	private String color;

	private String origin;

	private Integer weight;

	public Apple(String color, String origin, Integer weight) {
		super();
		this.color = color;
		this.origin = origin;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
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
		Apple other = (Apple) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", origin=" + origin + ", weight=" + weight + "]";
	}

	public static void main(String[] args) {

		Apple usApple = new Apple("Green", "US", 200);
		Apple kashmirApple = new Apple("Red", "India", 150);
		Apple swissApple = new Apple("Red", "Switzerland", 225);

		List<Apple> apples = new ArrayList<Apple>();
		apples.add(usApple);
		apples.add(kashmirApple);

		apples.add(swissApple);

		System.out.println(apples);

		Collections.sort(apples, new Comparator<Apple>() {
			@Override
			public int compare(final Apple fapple, Apple lapple) {
				return fapple.getWeight() > lapple.getWeight() ? 1 : fapple.getWeight() == lapple.getWeight() ? 0 : -1;
			}
		});

		System.out.println(apples);
	}

}
