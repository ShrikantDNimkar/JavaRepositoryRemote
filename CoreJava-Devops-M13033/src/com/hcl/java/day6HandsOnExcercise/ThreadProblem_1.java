package com.hcl.java.day6HandsOnExcercise;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Write a program to assign the current thread to t1. Change the name of the
 * thread to MyThread. Display the changed name of the thread. Also it should
 * display the current time. Put the thread to sleep for 10 seconds and display
 * the time again.
 *
 */

class Customer implements Runnable {

	Date dateObj1;
	Date dateObj2;

	public Customer() {
		dateObj1 = new Date();
	}

	public void run() {
		System.out.println("Thread Name" + "\t\t" + "Timestamp" + "\r(main=>MyThread)\t" +"(Hrs:Min:Sec.milliSec)");		

		try {
			System.out.println();
			System.out.println(
					Thread.currentThread().getName() + "\t\t" + new SimpleDateFormat("hh:mm:ss.SSS a").format(dateObj1));
			Thread.sleep(10000);
			dateObj2 = new Date();
			System.out.println(
					Thread.currentThread().getName() + "\t\t" + new SimpleDateFormat("hh:mm:ss.SSS a").format(dateObj2));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

public class ThreadProblem_1 {

	public static void main(String[] args) {

		Customer custObj1 = new Customer();
		Thread t1 = new Thread(custObj1);
		t1.start();
		System.out.println("Original name of thread :" + Thread.currentThread().getName());
		t1.setName("MyThread");

	}

}
