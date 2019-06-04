package com.lti.training.day4.interfaces;

/**
 * Inbuilt Launcher
 * for launching mobile apps
 * @author Google Inc
 *
 */
public class Launcher {
	
	private static TaskManager taskManager = new TaskManager();  // creating only one copy of the object and not making it multiple times
																														// private used to make it to be called in this class only
	public void launch(MobileApplication mobileApp)  {
		
		mobileApp.start();
		//mobileApp.pause();
		//mobileApp.stop();
		taskManager.inform(mobileApp);
		// System.out.println(taskManager.runningApps());
		
	}

	public void closeAllRunningApps() {
		taskManager.clearAll();    //If it is accessed from outside this class then you will have to include the class name as well
	}
}
