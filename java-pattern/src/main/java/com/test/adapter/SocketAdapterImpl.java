package com.test.adapter;

public class SocketAdapterImpl implements SocketAdapter {

	private Socket socket;

	public SocketAdapterImpl(Socket socket) {
		this.socket = socket;
	}

	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		return convertVolt(socket.getVolt(), 10);
	}

	@Override
	public Volt get3Volt() {
		return convertVolt(socket.getVolt(), 40);
	}

	private Volt convertVolt(Volt volt, int i) {

		return new Volt(volt.getVolts() / i);
	}
}
