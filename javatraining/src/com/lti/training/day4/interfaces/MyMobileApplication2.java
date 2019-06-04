package com.lti.training.day4.interfaces;

/**
 * My dummy mobile app
 * @author Shrey
 *
 */
public class MyMobileApplication2 implements MobileApplication  {

	@Override
	public void start() {
		System.out.println("My super awesome Mobileapplication2 started ");
	}

	public void pause() {
		System.out.println("My super awesome Mobileapplication2 paused ");
		
	}

	@Override
	public void stop() {
		System.out.println("My super awesome Mobileapplication2 stopped ");
		
	}

		
}
