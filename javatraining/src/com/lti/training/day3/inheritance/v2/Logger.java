package com.lti.training.day3.inheritance.v2;



/**
	 * A simple custom logger implementation.
	 * @author Saurav Sanyal
	 * @version 2.0
	 *
	 */

public abstract class Logger {
	
	public void log(String message) {
		// Passing the control down to the other log function. 
		// System.out.println("[INFO] [" + LocalDateTime.now() +"] " + message);
		log(message,LogLevel.INFO);
	}
	
	public abstract void log(String message, LogLevel level) ;
	
}


