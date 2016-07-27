package com.test.overloading;

public class Polymorphism {
	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		A a = new A();
		a.cal(15);
		a.sayHi();
		
		A aa = new B();
		aa.cal(4);
		aa.sayHi();
		
		B b = new B();
		b.cal(25);
		b.sayHi();
	}
}
