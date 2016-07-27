package com.test.overloading;

class B extends A {
	public void cal(double x) {
		System.out.println("square root=" + Math.sqrt(x));
	}
	
	public static void sayHi(){
		System.out.println("Hi from B.");
	}
}