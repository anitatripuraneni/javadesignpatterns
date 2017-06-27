package com.proxy;

public class ProxyTest {

	public static void main(String[] args) {
		CommandExecutor commandExecutor = new  CommandExecutorProxy("Anita", "abcd");
		try{
			commandExecutor.runCommand("ls -ltr");
			commandExecutor.runCommand(" rm -rf abc.pdf");
		}catch(Exception e){
			System.out.println("Exception Message::"+e.getMessage());
		}
	}

}
