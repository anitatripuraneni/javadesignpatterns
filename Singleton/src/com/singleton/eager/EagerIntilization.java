package com.singleton.eager;

public class EagerIntilization {
	
	private static final EagerIntilization instance = new EagerIntilization();
	
	private EagerIntilization(){
		
	}
	
	public static EagerIntilization getInstance(){
		return instance;
	}

	public static void main(String[] args) {
		
		EagerIntilization obj1 = EagerIntilization.getInstance();
		EagerIntilization obj2 = EagerIntilization.getInstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		if(obj1.equals(obj2)){
			System.out.println(true);
		}
		
		

	}

}
