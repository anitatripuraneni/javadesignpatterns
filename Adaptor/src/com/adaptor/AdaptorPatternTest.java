package com.adaptor;

public class AdaptorPatternTest {

	public static void main(String[] args) {
		testClassAdaptor();
		testObjectAdaptor();

	}

	private static void testObjectAdaptor() {
		SocketAdaptor adaptor = new SocketObjectAdaptorImpl();
		Volt v3 = getvolt(adaptor, 3);
		Volt v12 = getvolt(adaptor, 12);
		Volt v120 = getvolt(adaptor, 120);

		System.out.println("v3 volts using Object Adapter=" + v3.getVolt());
		System.out.println("v12 volts using Object Adapter=" + v12.getVolt());
		System.out.println("v120 volts using Object Adapter=" + v120.getVolt());

	}

	private static void testClassAdaptor() {
		SocketAdaptor adaptor = new SocketClassAdaptorImpl();
		Volt v3 = getvolt(adaptor, 3);
		Volt v12 = getvolt(adaptor, 12);
		Volt v120 = getvolt(adaptor, 120);
		System.out.println("v3 volts using Class Adapter=" + v3.getVolt());
		System.out.println("v12 volts using Class Adapter=" + v12.getVolt());
		System.out.println("v120 volts using Class Adapter=" + v120.getVolt());

	}

	private static Volt getvolt(SocketAdaptor adaptor, int i) {
		switch (i) {
		case 3:
			return adaptor.get3Volt();
		case 12:
			return adaptor.get12Volt();
		case 120:
			return adaptor.get120Volt();
		default:
			return adaptor.get120Volt();
		}
	}
}
