package com.lti.training.misc;

public class Employee {

	private int empno;
	private String name;
	private String dateOfJoining;
	private double salary;
	
	
	//Has-a relationship, also known as association
	//Can also be called as one-to-one association
	
	private Passport passport;
	private AadharCard aadharcard;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empno, String name, String dateOfJoining, double salary, Passport passport,
			AadharCard aadharcard) {
		super();
		this.empno = empno;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.passport = passport;
		this.aadharcard = aadharcard;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public AadharCard getAadharcard() {
		return aadharcard;
	}

	public void setAadharcard(AadharCard aadharcard) {
		this.aadharcard = aadharcard;
	}
	
	public void displayInfo() {
		
		System.out.println("Employee number: "+getEmpno());
		System.out.println("Name: "+ getName());
		System.out.println("Date of joining: "+getDateOfJoining());
		System.out.println("Aadhar number :"+getAadharcard().getAadharNo());
		System.out.println("Address: "+getAadharcard().getAddress());
		System.out.println("Name: "+getAadharcard().getName());
		System.out.println("Name: "+getPassport().getNameOfThePerson());
		System.out.println("Passport number: "+getPassport().getPassportNo());
		System.out.println("Issue number of passsport: "+getPassport().getIssueDate());
		System.out.println("Expiry date of  passport: "+getPassport().getExpiryDate());
		
	}
	
}
