package com.singleton.lazy;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6422035143016464681L;

	private SerializedSingleton() {

	}

	private static class InnerStaticHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return InnerStaticHelper.instance;
	}

	public static void main(String[] args) {
		SerializedSingleton obj1 = SerializedSingleton.getInstance();
		SerializedSingleton obj2 = SerializedSingleton.getInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}