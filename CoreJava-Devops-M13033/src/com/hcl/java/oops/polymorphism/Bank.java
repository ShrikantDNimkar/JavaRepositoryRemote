package com.hcl.java.oops.polymorphism;

public class Bank {
	//constructor overloading
	Bank(){
		System.out.println("BANK DETAILS");
		
	}
	
	Bank(String location){
		
		System.out.println("Location : "+ location);
		
	}
	
	//method overloading
	
	String bankInfo(String bankName) {
		
		return bankName;
		
	}
	
	int bankInfo(int ifscCode) {
		
		return ifscCode;
	}
	
	float getRateOfInterest() {
		
		return 15.0f;

	}

}
