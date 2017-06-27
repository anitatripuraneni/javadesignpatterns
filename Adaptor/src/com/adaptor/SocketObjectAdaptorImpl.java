package com.adaptor;

public class SocketObjectAdaptorImpl implements SocketAdaptor {

	Socket s = new Socket();

	@Override
	public Volt get120Volt() {
		return s.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = s.getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt v = s.getVolt();
		return convertVolt(v, 40);
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolt() / i);
	}

}
