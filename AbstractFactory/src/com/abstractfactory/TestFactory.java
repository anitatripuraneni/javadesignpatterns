package com.abstractfactory;

public class TestFactory {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500GB", "2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16GB", "1 TB", "2.9 GHz"));
		System.out.println("Factory PC config: " + pc);
		System.out.println("Factory Server config: " + server);

	}

}
