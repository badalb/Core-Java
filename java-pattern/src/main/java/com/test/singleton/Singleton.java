package com.test.singleton;

public class Singleton {

	private static volatile Singleton instance;

	private Singleton() {

	}

	public static Singleton getSingelton() {

		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					synchronized (Singleton.class) {
						instance = new Singleton();
					}
				}

			}
		}
		return instance;
	}

}
