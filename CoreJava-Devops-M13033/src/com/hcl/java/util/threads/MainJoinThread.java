package com.hcl.java.util.threads;

class MyThread extends Thread{
	
	public void run() {
		System.out.println("One");
		try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Two");
	}
	
}

public class MainJoinThread {

	public static void main(String[] args) throws InterruptedException {
		MyThread threadObj1= new MyThread();
		MyThread threadObj2= new MyThread();
		MyThread threadObj3= new MyThread();
		threadObj1.start();
//		threadObj1.join();
		threadObj2.start();
		threadObj2.join(); // Afterwards no thread then it will not affect. 
		
		threadObj3.start();
		System.out.println(threadObj3.isAlive());
		
		
		
	}

}
