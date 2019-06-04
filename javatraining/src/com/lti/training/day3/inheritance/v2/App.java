package com.lti.training.day3.inheritance.v2;

public class App {

	//Testing our logger.
	public static void main(String[] args) {
		FileLogger l=new FileLogger();
		ConsoleLogger cl=new ConsoleLogger();
		/*
		 * l.log("Some message!", LogLevel.INFO);       
		 */
		cl.log("Some serious message!", LogLevel.WARN);
		cl.log("A very serious message!", LogLevel.ERROR);
		cl.log("Alright cool then!");
	}
}
