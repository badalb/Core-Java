package com.test;

public interface InterfaceA {
	
	public void saySomething();

	default public void sayHi() {
		System.out.println("Hi");
	}
}
