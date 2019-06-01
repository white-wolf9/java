package com.lti.training;

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
	
	
}
