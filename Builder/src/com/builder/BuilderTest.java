package com.builder;

public class BuilderTest {
	public static void main(String[] args) {
		Computer com = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		System.out.println(com.toString());

	}
}
