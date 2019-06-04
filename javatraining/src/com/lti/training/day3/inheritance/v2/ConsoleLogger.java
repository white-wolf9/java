package com.lti.training.day3.inheritance.v2;
import java.time.LocalDateTime;
public class ConsoleLogger extends Logger{

	public  void log(String message, LogLevel level) {
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

	

