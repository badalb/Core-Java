package com.test.ambiguity;

public class FooBarImpl implements Foo, Bar {

	@Override
	public void sayHi() {

		System.out.println("Foo-Bar Impl Class");
	}

	public static void main(String[] args) {
		FooBarImpl impl = new FooBarImpl();
		impl.sayHi();

		System.out.println(impl instanceof Foo);
		System.out.println(impl instanceof Bar);
	}

}
