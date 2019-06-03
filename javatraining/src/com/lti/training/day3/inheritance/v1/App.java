package com.lti.training.day3.inheritance.v1;

public class App {

	//Testing our logger.
	public static void main(String[] args) {
		Logger l=new Logger();
		l.log("Some message!", LogLevel.INFO);       
		l.log("Some serious message!", LogLevel.WARN);
		l.log("A very serious message!", LogLevel.ERROR);
		l.log("Alright cool then!");
	}
}
