package com.test;

public class MyClass implements InterfaceA {
	 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	MyClass myClass = new MyClass();
    	myClass.saySomething();
    }
 
    @Override
    public void saySomething() {
        System.out.println("Hello World");
        InterfaceA.super.sayHi();
    }
}
