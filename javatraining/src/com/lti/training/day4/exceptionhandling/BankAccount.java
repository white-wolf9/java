package com.lti.training.day4.exceptionhandling;

public class BankAccount {

	private int acno;
	private String name;
	private double balance;
	
	public BankAccount(int acno, String name, double balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}
	
	public double withdraw(double amount)  throws Exception {
		if(amount>balance) {
			Exception e=new Exception("Insufficient Balance!");
			throw e;
		}
		
		else {
			balance = amount;
			return balance;
		}
	}
	
	public static void main(String args[]) {
		
		BankAccount bankAcc=new BankAccount(1234,"Shr",5000);
		try {
			double balance = bankAcc.withdraw(6000);
			System.out.println("Balance left : "+balance);
		}
		
		catch(Exception e ) {
			System.out.println(e.getMessage());
		}
		
	}
}
	
