package com.test.lamda;

public class LambdaTest {
	final static String salutation = "Hello!! ";

	public static void main(String ... args){
		
		GreetingService gs = (String message) -> System.out.println(salutation + message); 
		gs.sayHello("Badal");
	}
	
	interface GreetingService {
		void sayHello(String message);
	}
}
