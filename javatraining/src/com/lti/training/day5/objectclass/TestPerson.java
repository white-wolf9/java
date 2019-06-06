package com.lti.training.day5.objectclass;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person("Shreyansh",69);
		System.out.println(p1);
		
		Person p2 = new Person("Shreyansh",69);
		
		//System.out.println(p1 == p2);
		//System.out.println(p1.equals(p2));
		

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		
	}
}
