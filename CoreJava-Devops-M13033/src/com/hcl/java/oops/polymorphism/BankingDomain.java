package com.hcl.java.oops.polymorphism;

public class BankingDomain {

	public static void main(String[] args) {
		
		//overriding details
		SBI sbiObj = new SBI();
		System.out.println(sbiObj.getRateOfInterest()+ "% : SBI Rate of Interest");
		HDFC hdfcObj=new HDFC();
		System.out.println(hdfcObj.getRateOfInterest()+"% : HDFC Rate of Interest");
		Axis axisObj=new Axis();
		System.out.println(axisObj.getRateOfInterest()+"% : Axis Rate of Interest");
			
		//Overloading details
		Bank bankObj= new Bank("India");
		
		System.out.println("Bank Name: "+ bankObj.bankInfo("AMEX"));
		System.out.println("IFSC Code: "+ bankObj.bankInfo(80011));
		
		
	}

}