package com.lti.training.day3.inheritance.v2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;


public class FileLogger extends Logger {

	// Overriding is known as runtime polymorphism.
	@Override
	public void log(String message, LogLevel level) {
		try(FileWriter fw = new FileWriter("app.log",true)) {
			switch (level) {
			case INFO:
				fw.write("[INFO] [" + LocalDateTime.now() + "] " + message + "\n");
				break;
			case WARN:
				fw.write("[WARN] [" + LocalDateTime.now() + "] " +message + "\n");
				break;
			case ERROR:
				fw.write("[ERROR] [" + LocalDateTime.now() + "] " + message + "\n");
				break;
			default:
				fw.write("[INFO] [" + LocalDateTime.now() +"] " + message + "\n");
				break;
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}