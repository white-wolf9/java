package com.lti.training.day6.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.*;
public class ExampleOnSorting {

		public static void main(String[] args) {
			// for sorting we can use a dedicated sort method
			//alternatively TreeSet is a type of collection where
			//data is by default sorted
			//for Sorting data we need to implement Comparable/Comparator interface
			
			//if we need to store int,float,double or any other primitive 
			//value in a collection, we need to use wrapper classes
			//primitives are not supported directly in collections. Only objects
			List<Integer> list1=new ArrayList<Integer>();
			list1.add(10);
			list1.add(50);
			list1.add(30);
			list1.add(20);
			list1.add(40);
			
			for(Integer no : list1)
				System.out.println(no);
			
			TreeSet<Integer> tr=new TreeSet<Integer>(list1);												//One method of sorting
			System.out.println("---after sorting---");
			for(Integer no:tr)
				System.out.println(no);           
			
			Collections.sort(list1);																									//Second method of sorting
			System.out.println("---After sorting (using sort method) ---");
			for(Integer no:tr)
				System.out.println(no);              
			
			//how to sort data in case of user defined objects in a collection
			List<Person> listOfPersons=new ArrayList<Person>();
			listOfPersons.add(new Person("Majrul",59));
			listOfPersons.add(new Person("Nikhil",79));
			listOfPersons.add(new Person("Dinesh",89));
			listOfPersons.add(new Person("Santosh",39));
			listOfPersons.add(new Person("Gaurav",69));
			
			//write our own Comparator. It is an Interface. An anonymous class has been created down there
			//After typing till here................ Press Ctrl+Space
			Comparator<Person>  c = new Comparator<Person>() {
				@Override
				public int compare(Person p1, Person p2) {
					return p1.getName().compareTo(p2.getName());
					//return -p1.getName().compareTo(p2.getName());  sorts in descending order  
				}
			};
			
			Comparator<Person>  c2 = new Comparator<Person>() {
				@Override
				public int compare(Person p1, Person p2) {
					return p1.getAge() - p2.getAge();
					// return p2.getAge() - p1.getAge(); for descending order
				}
			};
			
			//Age desc
			Comparator<Person> c3 = (p1,p2) -> p2.getAge() -p1.getAge(); 								// Creating comparator using lambda
			//Name desc
			Comparator<Person> c4 = (p1,p2) -> p1.getName().compareTo(p2.getName());	 // Creating comparator using lambda
			
			
			Collections.sort(listOfPersons, c2); 																					//Sorting based on the age
			for(Person p : listOfPersons)
				System.out.println(p);
			
			
		}
}
