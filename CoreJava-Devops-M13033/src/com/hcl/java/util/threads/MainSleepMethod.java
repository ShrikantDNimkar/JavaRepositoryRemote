package com.hcl.java.util.threads;

public class MainSleepMethod {

	public static void main(String[] args) throws InterruptedException   {
		System.out.println("Before Sleeping");
		
		Thread.sleep(5000);
		
		System.out.println("After Sleeping");
		
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

}
