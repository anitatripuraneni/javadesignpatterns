package com.builder;

public class Computer {
	// required attributes

	private String ram;
	private String hdd;

	// optional attributes

	private boolean isGraphicCardEnabled;
	private boolean isBluetoothEnabled;

	public String getRam() {
		return ram;
	}

	public String getHdd() {
		return hdd;
	}

	public boolean isGraphicCardEnabled() {
		return isGraphicCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	private Computer(ComputerBuilder builder) {
		this.ram = builder.ram;
		this.hdd = builder.hdd;
		this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	public static class ComputerBuilder {
		// required attributes

		private String ram;
		private String hdd;

		// optional attributes

		private boolean isGraphicCardEnabled;
		private boolean isBluetoothEnabled;

		public ComputerBuilder(String ram, String hdd) {
			this.ram = ram;
			this.hdd = hdd;

		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicCardEnabled) {
			this.isGraphicCardEnabled = isGraphicCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

		@Override
		public String toString() {
			return "ComputerBuilder [ram=" + ram + ", hdd=" + hdd + ", isGraphicCardEnabled=" + isGraphicCardEnabled
					+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
		}

	}
}
