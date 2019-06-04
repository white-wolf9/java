package com.lti.training.day4;

public class EmployeeMain {
	
	
	public static void main(String[] args) {
		
		
		Employee emp1=new Employee();
		emp1.setEmpno(1001);
		emp1.setName("Shyam");
		Employee.setSalary(10000);
		
		Employee emp2=new Employee();
		emp2.setEmpno(1001);
		emp2.setName("Saum");
		Employee.setSalary(20000);
		
		System.out.println(emp1.getEmpno());
		System.out.println(emp1.getName());
		System.out.println(Employee.getSalary());
		
		System.out.println(emp2.getEmpno());
		System.out.println(emp2.getName());
		System.out.println(Employee.getSalary());
		
		System.out.println(Employee.companyName);
	}
	}
	


