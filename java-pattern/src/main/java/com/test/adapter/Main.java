package com.test.adapter;

public class Main {

	public static void main(String[] args) {

		SocketAdapterImpl sockAdapter = new SocketAdapterImpl(new Socket());
		Volt v3 = sockAdapter.get3Volt();
		Volt v12 = sockAdapter.get12Volt();
		Volt v120 = sockAdapter.get120Volt();
		System.out.println("v3 volts using Object Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
		System.out.println("v120 volts using Object Adapter=" + v120.getVolts());

	}

}
