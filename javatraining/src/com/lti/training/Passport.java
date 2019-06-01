package com.lti.training;

public class Passport {
		
	
		//This way of using getters and setters is Java Beans convention.
	
		private String passportNo;
		private String issueDate;
		private String expiryDate;
		private String nameOfThePerson;
		
		public String getPassportNo() {
			return passportNo;
		}
		public void setPassportNo(String passportNo) {
			this.passportNo = passportNo;
		}
		public String getIssueDate() {
			return issueDate;
		}
		public void setIssueDate(String issueDate) {
			this.issueDate = issueDate;
		}
		public String getExpiryDate() {
			return expiryDate;
		}
		public void setExpiryDate(String expiryDate) {
			this.expiryDate = expiryDate;
		}
		public String getNameOfThePerson() {
			return nameOfThePerson;
		}
		public void setNameOfThePerson(String nameOfThePerson) {
			this.nameOfThePerson = nameOfThePerson;
		}
		
		
}
