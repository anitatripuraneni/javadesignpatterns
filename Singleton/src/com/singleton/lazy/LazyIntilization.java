package com.singleton.lazy;

public class LazyIntilization {
	
	private static LazyIntilization instance;
	
	private LazyIntilization(){
		
	}
	public static LazyIntilization getInstance(){
		if(instance == null){
			instance= new LazyIntilization();
		}
		return instance;
	}

	public static void main(String[] args) {
		LazyIntilization obj1=LazyIntilization.getInstance();
		System.out.println(obj1.hashCode());
		
		

	}

}
