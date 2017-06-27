package com.singleton.eager;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	public static void main(String[] args) {
		EagerIntilization instance1 = EagerIntilization.getInstance();

		EagerIntilization instance2 = null;
		try {
			Class classObject = EagerIntilization.class;
			Constructor[] constructors = classObject.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instance2 = (EagerIntilization) constructor.newInstance();
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}

}
