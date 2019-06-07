package com.lti.training.day6.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExampleOnList extends Person {

	public static void main(String[] args) {
		//  Angular brace notation is called generics in Java
		List<String> list1= new ArrayList<String>();
		List<String> list2= new ArrayList<String>();
		List<String> list3= new ArrayList<String>();
		LinkedList<String> list4= new LinkedList<String>(); 
		list1.add("Java");
		list1.add("Oracle");
		list1.add(".NET");
		list1.add("Java");
		list2.add("Bhoot");
		list2.add("Vartman");
		// for each loop
		/*for(String str : list1) {
			System.out.println(str);
		}*/
		// for loop
		/*for(int i=0; i<list1.size(); i++) {
			String str = list1.get(i);
			System.out.println(str);
		}*/
		// lambda
		// list1.forEach(str -> System.out.println(str));
		// iterator
		/*Iterator<String> itr = list1.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}*/
		
		//practicing various other methods used in collections
		list1.addAll(list2);
		/*Iterator<String> itr = list2.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}*/
		// list2.clear();
		// System.out.println(list2.contains("Java"));
		// System.out.println(list3.isEmpty());
		/*list3=list1.subList(0, 3);
		Iterator<String> itr = list3.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}*/
		/*list1.set(2, "Big oops");
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}*/
		List<Person> listOfPerson = new ArrayList<Person>();
		Person p1 = new Person("Shrey",69);
		Person p2 = new Person("Shreya",70);
		listOfPerson.add(p1);
		listOfPerson.add(p2);
		Iterator<Person> itr = listOfPerson.iterator();
		while(itr.hasNext()) {
			Person p = itr.next();
			System.out.println(p);
		}
		for(Person str : listOfPerson) {
			System.out.println(str);
		}
		
		listOfPerson.forEach(str -> System.out.println(str)); 
	}
}
