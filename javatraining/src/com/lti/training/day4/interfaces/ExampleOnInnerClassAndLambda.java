package com.lti.training.day4.interfaces;

interface Printer{
	void print(String document);
}

class DotMatrixPrinter implements Printer{

	@Override
	public void print(String document) {
		System.out.println("Currently printing"+document);
	}	
}

public class ExampleOnInnerClassAndLambda {
	
	public static void main(String[] args) {
			class DeskjetPrinter implements Printer{
				@Override
				public void print(String document) {
					System.out.println("Currently printing"+document);
				}
		}
 
		Printer p=new DeskjetPrinter();
		p.print("abc.txt");
		
		Printer sp=new Printer() {
			@Override
			public void print(String document) {
				System.out.println("Now printing"+document);
			
			}
		};
		sp.print("xyz.txt");
		
		// anonymous functions -a.k.a lambda expressions
		//lambda expressions are nothing but anonymous inner classes in other
		Printer pr= (document ) -> {
			System.out.println("Now printing"+document);
		};
		pr.print("hello.txt");
		
		//We could have typed
		/* Printer pr= ( String document ) -> {
					System.out.println("Now printing"+document);
				};
				pr.print("hello.txt");
			}
		}
		*/
		
		Printer pt=doc-> System.out.println("Now printing "+doc);
		pt.print("hi.txt");
	}
}
