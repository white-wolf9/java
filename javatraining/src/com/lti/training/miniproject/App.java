package com.lti.training.miniproject;

import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		StudentDao sdao = new StudentDao();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("<!--------------->Welcome to the student interface.<---------------!>");
		System.out.println("Operations Performed");
		System.out.println("1. Add a record of a student.");
		System.out.println("2. Search the record of a student.");
		System.out.println("3. Delete the record of a student.");
		System.out.println("4. Show the names of all the student.");

		char choicecontinue;
		do {
			int rn;
			String fn,ln,co,re;
			System.out.println("Enter your choice of operation:");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the roll number of the student.");
				rn = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter the first name of the student.");
				fn = scanner.nextLine();
				System.out.println("Enter the last name of the student.");
				ln = scanner.nextLine();
				System.out.println("Enter the course of the student.");
				co = scanner.nextLine();
				System.out.println("Enter the result of the student. 'Pass/Fail'");
				re = scanner.nextLine();
				Student stud = new Student();
				stud.setRollno(rn);
				stud.setFname(fn);
				stud.setLname(ln);
				stud.setCourse(co);
				stud.setResult(re);
				sdao.addStudent(stud,rn,fn,ln,co,re);
				break;
			
			case 2:
				System.out.println("Enter the roll number of the student whose information you want to view.");
				rn = scanner.nextInt();
				Student x = sdao.searchStudent(rn);
				System.out.println(x);
				break;
				
			case 3:
				System.out.println("Enter the roll number of the student whose record is to be deleted.");
				rn = scanner.nextInt();
				sdao.delStudent(rn);
				break;
				
			case 4:
				System.out.println("The information of the students who failed are listed below.");
				List<Student> students=sdao.fetchFailure();
				for(Student s : students) {
					System.out.println(s);
				}
				break;
			case 0:
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
			System.out.println("Press 'Y' to continue, and 'N' to exit the application.");
		} while ((choicecontinue = scanner.next().charAt(0)) == 'Y');
		/*
		 * Well no shit.
		 */
	}
}
