package com.lti.training;

public class Customer {
	
	private String name;
	private String email;
	
	private Address address;
	//has-a relationship
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String name, String email, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	void displayInformation() {
		System.out.println("Name"+name);
		System.out.println("E-Mail:"+email);
		System.out.println("City:"+address.getCity());
		System.out.println("Address:"+address.getState());
		System.out.println("Pin Code"+address.getPincode());
	}
	
	
}
