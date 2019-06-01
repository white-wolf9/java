package com.lti.training;
import java.util.*;

public class App {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
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
		*/
		
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
		
		
		
	}
}
