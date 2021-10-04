package com.hcl.java.innerclasses;

class Bank1 {

	String bankName = "HDFC";

	public void bankInfo() {
		System.out.println("Bank Name: " + bankName);
		// type 2: local class
		class Account1 {

			String username = "james";
			String password = "java";

			public void accountDetails() {
				System.out.println("Username Name:" + username);
				System.out.println("Password:" + password);
			}

		}

		Account1 accountObj = new Account1();
		accountObj.accountDetails();

	}

}

public class MainType2LocalClass {

	public static void main(String[] args) {

		Bank1 bank1Obj = new Bank1();
		bank1Obj.bankInfo();

	}

}
