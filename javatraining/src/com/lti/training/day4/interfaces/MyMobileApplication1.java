package com.lti.training.day4.interfaces;

/**
 * My dummy mobile app
 * @author Shrey
 *
 */
public class MyMobileApplication1 implements MobileApplication  {

	@Override
	public void start() {
		System.out.println("My awesome Mobileapplication1 started ");
	}

	public void pause() {
		System.out.println("My awesome Mobileapplication1 paused ");
		
	}

	@Override
	public void stop() {
		System.out.println("My awesome Mobileapplication1 stopped ");
		
	}

		
}
