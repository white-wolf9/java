package com.lti.training;

public class AddressCustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer=new Customer();
		
		customer.setName("Lamar");
		customer.setEmail("longd@lifeinvader.com");
		
		Address address=new Address();
		
		address.setCity("Los Santos");
		address.setState("America");
		address.setPincode(520224);
		
		customer.setAddress(address);
		
		customer.displayInformation();

	}

}
