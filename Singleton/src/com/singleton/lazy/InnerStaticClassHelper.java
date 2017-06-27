package com.singleton.lazy;

public class InnerStaticClassHelper {

	private InnerStaticClassHelper() {

	}

	private static class InnerSingletonHelper {

		private static final InnerStaticClassHelper instance = new InnerStaticClassHelper();
	}

	public static InnerStaticClassHelper getInstance() {
		return InnerSingletonHelper.instance;
	}

	public static void main(String[] args) {
		InnerStaticClassHelper obj =InnerStaticClassHelper.getInstance();
		InnerStaticClassHelper obj1 = InnerStaticClassHelper.getInstance();
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}
}
