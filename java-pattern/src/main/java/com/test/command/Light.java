package com.test.command;

public class Light {

	private boolean on;

	public void switchOn() {
		System.out.println("Switchinging on Light!!!");
		on = true;
	}

	public void switchOff() {
		System.out.println("Switchinging Off Light!!!");
		on = false;
	}
}