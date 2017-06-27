package com.proxy;

public class CommandExecutorProxy implements CommandExecutor {

	private boolean isAdmin;
	private CommandExecutor commandExecutor;

	public CommandExecutorProxy(String user, String pwd) {
		if ("Anita".equals(user) && "abcd".equals(pwd)) {
			isAdmin = true;
			commandExecutor = new CommandExecutorImpl();
		}
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		if(isAdmin){
			commandExecutor.runCommand(cmd);
		}else{
			if(cmd.trim().startsWith("rm")){
				throw new Exception("rm command is not allowed for nonadmin users.");
			}else
				commandExecutor.runCommand(cmd);
		}

	}

}
