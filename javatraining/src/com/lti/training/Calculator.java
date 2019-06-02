package com.lti.training;

public class Calculator {
	
	public void add(int x,int y) {
		System.out.println(x+y);
	}
	public void sub(int x,int y) {
		System.out.println(x-y);
	}
	public static void mul(int x,int y) {
		System.out.println(x*y);
	}

	public static void main(String[] args) {
		String a="Shreyansh";
		System.out.println(a.toUpperCase());
		System.out.println(a.charAt(2)); 
		
		Calculator cal=new Calculator();
		cal.add(5,4);
		cal.sub(6,2);
		Calculator.mul(10,20);
		
		System.out.println(Integer.toBinaryString(84));
		System.out.println(Integer.toOctalString(123));
		System.out.println(Integer.toHexString(2241));
	}
}	


