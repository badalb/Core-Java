package com.test;

public class AppleGreenColorPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return COLOR.GREEN.equals(apple.getColor());
	}

}
