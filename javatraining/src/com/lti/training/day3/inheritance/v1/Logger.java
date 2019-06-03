package com.lti.training.day3.inheritance.v1;

import java.time.LocalDateTime;

/**
	 * A simple custom logger implementation.
	 * @author Saurav Sanyal
	 * @version 1.0
	 *
	 */

public class Logger {
	
	public void log(String message) {
		// Passing the control down to the other log function. 
		// System.out.println("[INFO] [" + LocalDateTime.now() +"] " + message);
		log(message,LogLevel.INFO);
	}
	
	public void log(String message, LogLevel level) {
		switch (level) {
		case INFO:
			System.out.println("[INFO] [" + LocalDateTime.now() + "] " + message);
			break;
		case WARN:
			System.out.println("[WARN] [" + LocalDateTime.now() + "] " +message);
			break;
		case ERROR:
			System.out.println("[ERROR] [" + LocalDateTime.now() + "] " + message);
			break;
		default:
			System.out.println("[INFO] [" + LocalDateTime.now() +"] " + message);
			break;
		}
	}

}
