
package com.hcl.java.innerclasses;

//import com.hcl.java.innerclasses.Bank.Account;

/**
 * 1.can we define one class in another 2.can we define private class? if yes,
 * how can we access a private class and its members?
 *
 */

class Bank {
	static String bankName;
	static String userName;
	static String password;

	public void bankInfo() {
		Account accountObj = new Account();
		accountObj.accountInfo();

	}

	// TYPE 1: MEMBER CLASS (CLASS IN ANOTHER CLASS)
	private static class Account {
		public void accountInfo() {
			bankName = "HDFC";
			userName = "james";
			password = "java";
			System.out.println("Bank Name: " + bankName);
			System.out.println("User Name: " + userName);
			System.out.println("Password: " + password);
		}

	}

}

public class MainType1MemberClass {

	public static void main(String[] args) {
		Bank bankObj = new Bank();
		// Bank.Account accountObj = bankObj.new Account();
		// accountObj.accountInfo();
		// syntax :outclass.innerclass obj = outclassobj.innerclass()
		// Account acc =new Bank.Account();
		// acc.accountInfo();
		bankObj.bankInfo();

	}

}
