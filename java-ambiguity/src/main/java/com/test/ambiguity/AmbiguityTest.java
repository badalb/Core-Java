package com.test.ambiguity;

public class AmbiguityTest {

	public void foo(Object o) {
		System.out.println("Object");
	}

	public void foo(String s) {
		System.out.println("String");
	}

	public static void main(String[] args) {
		new AmbiguityTest().foo(null);
	}

}