package com.test;

public class GenericsType<T> {

	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	
	public static void main(String args[]){
		GenericsType<String> type = new GenericsType<>();
		type.set("Badal"); //valid
		System.out.println(type.get());
		
		GenericsType type1 = new GenericsType(); //raw type
		type1.set("Badal"); //valid
		System.out.println(type1.get());
		
		System.out.println();
		type1.set(10); //valid and autoboxing support
		System.out.println(type1.get());
	}
}