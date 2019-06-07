package com.lti.training.day6.collections;

import java.util.HashSet;
import java.util.Set;

public class ExampleOnSet {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("Java");
		set1.add("Oracle");
		set1.add("PHP");
		set1.add(".NET");
		set1.add("CSS");
		
		for(String str : set1)
			System.out.println(str);
		
		Set<Person> setOfPerson = new HashSet<Person>();
		setOfPerson.add(new Person("Nikhil",99));
		setOfPerson.add(new Person("Dinesh",99));
		setOfPerson.add(new Person("Santosh",99));
		setOfPerson.add(new Person("Gaurav",99));
		setOfPerson.add(new Person("Gaurav",99));
		
		for(Person pr : setOfPerson)
			System.out.println(pr);
	}
}
