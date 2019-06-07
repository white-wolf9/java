package com.lti.training.practice;

import java.util.*;
import java.io.*;
import java.io.IOException;

public class Test {

	public static void main(String args[]) throws java.lang.Exception {
		int a=5;
		int b=0;
		try {
			int c=a/b;
			if(a>0) throw new Exception("FIRST");
			if(c==0) throw new Exception("SECOND");
			if(b==0) throw new Exception("THIRD");
		} 
		
		catch (IOException | ArithmeticException x) {
			System.out.println(x.getMessage());
			// TODO: handle exception
		}
	}
}

