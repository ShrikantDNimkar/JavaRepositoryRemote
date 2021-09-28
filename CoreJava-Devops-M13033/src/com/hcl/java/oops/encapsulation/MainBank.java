package com.hcl.java.oops.encapsulation;

public class MainBank {

	public static void main(String[] args) {
		Bank bankObj = new Bank();
		
		bankObj.setBankName("SBI");
		bankObj.setIfscCode("SBIN00012");
		bankObj.setContactNumber(987654321L);
		
		System.out.println("Bank Name: "+ bankObj.getBankName());
		System.out.println("IFSC Code: "+ bankObj.getIfscCode());
		System.out.println("Contact Number: "+ bankObj.getContactNumber()	);
		
	}

}
