//package com.hcl.java.day6HandsOnExcercise;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
///**
// * In the previous program remove the try{}catch(){} block surrounding the sleep
// * method and try to execute the code. What is your observation?
// */
//class Customer implements Runnable {
//
//	Date dateObj1;
//	Date dateObj2;
//
//	public Customer() {
//		dateObj1 = new Date();
//	}
//
//	public void run() {
//		System.out.println();
//		System.out.println("Thread Name" + "\t" + "Timestamp" + "\n\r\t\t" + "(mm:ss.SSS)");
//		System.out
//				.println(Thread.currentThread().getName() + "\t" + new SimpleDateFormat("mm:ss.SSS").format(dateObj1));
//		Thread.sleep(10000);
//		/*
//		 * Thread.sleep() method throws InterruptedException if a thread in sleep is
//		 * interrupted by other threads. Because if a Thread is sleeping, the thread may
//		 * be interrupted e.g. with Thread.interrupt() by another thread in which case
//		 * the sleeping thread (the sleep() method) will throw an instance of this
//		 * InterruptedException.
//		 */
//		dateObj2 = new Date();
//		System.out
//				.println(Thread.currentThread().getName() + "\t" + new SimpleDateFormat("mm:ss.SSS").format(dateObj2));
//
//	}
//
//}
//
//public class ThreadProblem_2 {
//
//	public static void main(String[] args) {
//		Customer custObj1 = new Customer();
//		Thread t1 = new Thread(custObj1);
//		t1.start();
//		System.out.println("Original name of thread :" + Thread.currentThread().getName());
//		t1.setName("MyThread");
//	}
//
//}
