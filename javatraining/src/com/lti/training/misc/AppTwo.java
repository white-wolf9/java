package com.lti.training.misc;

public class AppTwo {

	public static void main(String args[])
	{
		Employee emp=new Employee();
		emp.setEmpno(2345);
		emp.setName("Shre");
		emp.setDateOfJoining("25th january 2019");
		emp.setSalary(100000);
		
		
		AadharCard ac=new AadharCard(22144299532L,"Shre","Mumbai");
		/*
		 	ac.setAadharNo(22144299532L);
			ac.setAddress("Mumbai");
			ac.setName("Shre"); 
		 */
		
		Passport pport=new Passport();
		
		pport.setNameOfThePerson("Shre");
		pport.setPassportNo("P20130");
		pport.setIssueDate("12-Jan-2034");
		pport.setExpiryDate("16-Dec-2044");
		
		//Emp object linked with pport and ac objects of other function.
		//Use the object to get the class and then use it again to get the variable
		
		emp.setPassport(pport);
		emp.setAadharcard(ac);
		
		emp.displayInfo();
		
	}
}

