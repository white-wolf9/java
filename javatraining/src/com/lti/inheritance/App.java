package com.lti.inheritance;

public class App {
	
	public static void  main(String args[]) {
		Book b1=new Book("Java Handbook",99,500,"A classic book on Java");
		Book b2=new Book("Java Unleashed",99,400,"A classic book on Java");
		
		Toy  t1=new Toy("RC car ",99,2500,"RC car","4-5");
		Toy  t2=new Toy("Super hero ",99,500,"Action figure ","5+");
		
		double bill1=b1.generateBill(40);
		System.out.println("Total bill amount for ordering 40 copies of "+b1.getName()+" is"+bill1);
		
	}
}
