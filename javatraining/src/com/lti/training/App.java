package com.lti.training;
//import java.util.*;

public class App {

	public static void main(String[] args) {
		
		// Scanner sc=new Scanner(System.in);
		
		//This way of using getters and setters is Java Beans convention.
		//Also known as POJO Programming Old Java Object.
		//Use of creating getter and setter. There is no real use.
		//For instance when we use getters, setters on private variables, there is no security aspect.
		//It can be thought of this way as once the value is initialized, we can remove set method to prevent modification of a variable.
		//Four actual pillars of OOP is 1.Identity 2.Classification 3.Polymorphism 4.Inheritance
		//Constructor does not promote readability, it can be difficult of others to understand the parameters of the constructor`
		
		/*
		 //creating an object of student class
		Student student1=new Student();
		student1.name="Shreyansh";
		student1.college="VIT Chennai";
		student1.doj="21-May-2019";
		//Displaying the data of student 1
		System.out.println(student1.name+" "+student1.college+" "+student1.doj);
		
		//Input from the user
		System.out.println("Enter details");
		student1.name=sc.nextLine();
		student1.college=sc.nextLine();
		student1.doj=sc.nextLine();
		
		System.out.println(student1.name+" "+student1.college+" "+student1.doj);
		
		
		//Creating a passport class object
		Passport passport1=new Passport();
		
		//Setting the values
		passport1.setExpiryDate("12-Jun-2021");
		passport1.setIssueDate("11-Jun-2011");
		passport1.setNameOfThePerson("Daud Ibrahimovich");
		passport1.setPassportNo("PSAK46URPG!007");
		
		//Getting the values
		System.out.println(passport1.getExpiryDate());
		System.out.println(passport1.getIssueDate());
		System.out.println(passport1.getNameOfThePerson());
		System.out.println(passport1.getPassportNo());
		*/
		
		 //Initializing object of class Aadhar card with a constructor. 
		//Constructor and getter setter created using the source menu after right click.
		AadharCard ac=new AadharCard(214062791824L ,"Saurav","Kolkata");
		//Displaying the values using get method.
		System.out.println(ac.getAadharNo());
		System.out.println(ac.getAddress());
		System.out.println(ac.getName());
		
	}
}
