package com.hcl.java.util.threads;

class Customer extends Thread /*implements Runnable*/ {
	
	int custId;
	String custName;
	
	public void run() {
		System.out.println(custId +"\t"+ custName);
	}
	
	
}

public class MainMultiThreads {

	public static void main(String[] args) {
		
		Customer custObj1 = new Customer();
		custObj1.custId = 1021;
		custObj1.custName = "James";
		
		custObj1.start();
		
		//Step 1: Create Thread Object or new born stage 
		//Thread threadObj1 = new Thread(custObj); use if you want  not to use extends Thread instead of implements Runnable
		//threadObj1.start();
		//threadObj1.start();
		
		Customer custObj2 = new Customer();
		custObj2.custId = 1022;
		custObj2.custName = "Gavin";		
		custObj2.start();
		
		Customer custObj3 = new Customer();
		custObj3.custId = 1023;
		custObj3.custName = "EF Codd";		
		custObj3.start();
		
		custObj2.suspend();
		custObj2.resume();
		
		custObj2.stop();

	}

}
