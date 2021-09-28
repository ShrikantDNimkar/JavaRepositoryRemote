package com.hcl.java.oops.encapsulation;

public class Bank {
	private String bankName;
	private String ifscCode;
	private long contactNumber;
	
	//setter and getter methods for bankName
	public void setBankName(String bankName) {
		this.bankName = bankName; 
	}
	
	public String getBankName() {
		return bankName; 
	}
	
	//setter and getter methods for IFSC Code
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode; 
	}
	
	public String getIfscCode() {
		return ifscCode; 
	}
	//setter and getter methods for Contact Number
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber; 
	}
	
	public long getContactNumber() {
		return contactNumber; 
	}
	
			
	
}
