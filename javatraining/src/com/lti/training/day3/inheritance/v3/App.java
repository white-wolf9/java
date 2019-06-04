package com.lti.training.day3.inheritance.v3;

public class App {

	//Testing our logger.
	public static void main(String[] args) {
		Logger l=LogFactory.getLoggerInstance();
		//FileLogger l=new FileLogger();
		//ConsoleLogger cl=new ConsoleLogger();
		/*
		 * l.log("Some message!", LogLevel.INFO);       
		 */
		l.log("Some serious message!", LogLevel.WARN);
		l.log("A very serious message!", LogLevel.ERROR);
		l.log("Alright cool then!");
	}
}
