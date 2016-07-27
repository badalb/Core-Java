package com.test.ambiguity;

public class OverLoadingAmbiguity {
	static void testOverload(int i, double d) {
		System.out.println("testOverload 1: int, double");
	}

	static void testOverload(double d, int i) {
		System.out.println("testOverload 2: double,int");
	}

	public static void main(String[] args) {

		testOverload(2, 3.5);
		testOverload(2.5, 3);
		testOverload(2, 3); // Compilation error: The method testOverload(int,
							// double) is ambiguous for the type OverLoadingTest
	}
}