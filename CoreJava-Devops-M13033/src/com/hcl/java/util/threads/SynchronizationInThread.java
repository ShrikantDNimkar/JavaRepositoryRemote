package com.hcl.java.util.threads;

class Account{
	int balance;
	public Account() {
		balance = 5000;
	}
	public /*synchronized*/ void withdraw(int bal) {
		try {
			Thread.sleep(3000);
		}catch (Exception ex) {
			System.out.println("Exception Occured.. "+ex);
		}
		balance-=bal;
		System.out.println("Balance Remaining ::: "+ balance + " "+ Thread.currentThread().getName());
		
	}
}

class SubClassAccount implements Runnable{
	Account obj;
	public SubClassAccount(Account a) {
		obj = a;
	}
	@Override
	public void run() {
		obj.withdraw(500);
		
	}
}

public class SynchronizationInThread {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		SubClassAccount c1 =new SubClassAccount(a1);
		Thread t1 =new Thread(c1,"a");
		Thread t2 =new Thread(c1,"b");
		Thread t3 =new Thread(c1,"c");
		t1.start();
		t2.start();
		t3.start();

	}

}
