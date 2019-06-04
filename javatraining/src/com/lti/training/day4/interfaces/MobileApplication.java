package com.lti.training.day4.interfaces;

/**
 * Contract for a Mobile Application
 * @author Google Inc
 *@version 1.0
 */
public interface MobileApplication {
	
	String INFO="Developed by Google Inc";
	
	public void start();
	public void pause();
	public void stop();
	
	//non abstract methods not allowed from Java8 onwards
	public default void version() {
		System.out.println(INFO+"Version is 1.0");
	}
	
	
}
