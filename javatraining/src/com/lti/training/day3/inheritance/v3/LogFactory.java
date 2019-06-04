package com.lti.training.day3.inheritance.v3;

public class LogFactory {
	
	//Factory is a (design pattern) 
	public static Logger getLoggerInstance() {
		return new ConsoleLogger();
		
	}
}
