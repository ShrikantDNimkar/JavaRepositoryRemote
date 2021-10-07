package com.hcl.java.util.threads;

class CustomerDetails implements Runnable{
	
	int custId;
	String custName;
	
	public void run() {
		
		System.out.println(custId +"\t"+ custName + "\t" + Thread.currentThread().getName());
		
	}
	
}

public class MainNameThread {

	public static void main(String[] args) {
		
		CustomerDetails custObj1 = new CustomerDetails();
		custObj1.custId = 1021;
		custObj1.custName = "James";
		Thread threadObj1 = new Thread(custObj1);
		threadObj1.setName("SBI Bank Customer");
		threadObj1.start();
		
		CustomerDetails custObj2 = new CustomerDetails();
		custObj2.custId = 1022;
		custObj2.custName = "Gavin";
		Thread threadObj2 = new Thread(custObj2);
		threadObj2.setName("HDFC Bank Customer");
		threadObj2.start();
		
		CustomerDetails custObj3 = new CustomerDetails();
		custObj3.custId = 1023;
		custObj3.custName = "Jhonson";
		Thread threadObj3 = new Thread(custObj3);
		threadObj3.setName("ICICI Bank Customer");
		threadObj3.start();

	}

}
