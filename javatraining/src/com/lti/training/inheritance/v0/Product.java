package com.lti.training.inheritance.v0;

                                                                     //This program is an example of runtime polymorphism
public abstract class Product {

	private static int sequence=1000;   	//static will retain your last value, only one copy of it in memory 
																	//static will make sure  that the value doesn't go back to 1000
	
	private int id = sequence++;
	private String name;
	private int stockInHand;
	private double price;
	private String description;
	
	
	public Product(String name, int stockInHand, double price, String description) {
		super();
		this.name = name;
		this.stockInHand = stockInHand;
		this.price = price;
		this.description = description;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getStockInHand() {
		return stockInHand;
	}
	
	public double getPrice() {
		return price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public abstract  double calculateDiscount();
	
	public double generateBill(int quantity) {
		
			double total=(price-calculateDiscount())*quantity;
			return total;
		
	}
	 	
}
