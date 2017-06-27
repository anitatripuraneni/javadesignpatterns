package com.singleton.lazy;

public class DoubleCheckLockingPrinciple {

	private static DoubleCheckLockingPrinciple instance;

	private DoubleCheckLockingPrinciple() {

	}

	public static DoubleCheckLockingPrinciple getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckLockingPrinciple.class) {
				if (instance == null) {
					instance = new DoubleCheckLockingPrinciple();
				}

			}
		}
		return instance;
	}

	public static void main(String[] args) {
		DoubleCheckLockingPrinciple obj = DoubleCheckLockingPrinciple.getInstance();
		System.out.println(obj.hashCode());

	}

}
