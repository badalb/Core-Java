package com.test;

public class Apple {

	private int weight;

	private COLOR color;

	private String origin;

	public Apple() {
		super();
	}

	public Apple(int weight, COLOR color, String origin) {
		super();
		this.weight = weight;
		this.color = color;
		this.origin = origin;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public COLOR getColor() {
		return color;
	}

	public void setColor(COLOR color) {
		this.color = color;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color + ", origin=" + origin + "]";
	}

}
