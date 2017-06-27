package com.singleton.eager;

public class StaticBlockEagerIntilization {
	
	private static StaticBlockEagerIntilization instance;
	
	private StaticBlockEagerIntilization(){
		
	}
	static{
		try{
			instance = new StaticBlockEagerIntilization();
		}catch(RuntimeException e){
			throw new RuntimeException("Exception occured while creating object");
		}
	}
	
	public static StaticBlockEagerIntilization getInstance(){
		return instance;
	}
public static void main(String[] args) {
	StaticBlockEagerIntilization obj1 = StaticBlockEagerIntilization.getInstance();
	StaticBlockEagerIntilization obj2 = StaticBlockEagerIntilization.getInstance();
	
	System.out.println(obj1.hashCode());
	System.out.println(obj2.hashCode());
	
	if(obj1.equals(obj2)){
		System.out.println(true);
	}
}
}
