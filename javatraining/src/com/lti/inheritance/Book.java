package com.lti.inheritance;

public class Book  extends Product {
	
	
	
	public Book(String name, int stockInHand, double price, String description) {	
		super(name, stockInHand, price, description);
	}

	@Override
	public double calculateDiscount() {
		
			return  0.1*getPrice();
	}
	
}
