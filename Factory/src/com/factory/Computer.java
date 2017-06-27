package com.factory;

public abstract class Computer {

	public abstract String getRAM();

	public abstract String getHDD();

	public abstract String getCPU();

	@Override
	public String toString() {
		return "Computer [getRAM()=" + this.getRAM() + ", getHDD()=" + this.getHDD() + ", getCPU()=" + this.getCPU()
				+ "]";
	}

}
