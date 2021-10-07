package com.hcl.java.day6HandsOnExcercise;

/**
 * Write a program to create a class Number  which implements Runnable. Run
 * method displays the multiples of a number accepted as a parameter. In main
 * create three objects - first object should display the multiples of 2, second
 * should display the multiples of 5 and third should display the multiples of
 * 8. Display appropriate message at the beginning and ending of thread. The
 * main thread should wait for the first object to complete. Display the status
 * of threads before the multiples are displayed and after completing the
 * multiples.
 */
class Number implements Runnable {

	int number;

	public Number(int number) {
		this.number = number;
	}

	public void run() {
		System.out.println("Multiple of <" + number + ">");
		try {
			for (int i = 0; i < 11; i++) {
				System.out.println(number + "x" + i + " = " + (number * i));
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

public class ThreadProblem_5 {

	public static void main(String[] args) throws InterruptedException {

		Number numberObj1 = new Number(2);
		Number numberObj2 = new Number(5);
		Number numberObj3 = new Number(8);

		Thread threadObj1 = new Thread(numberObj1);
		Thread threadObj2 = new Thread(numberObj2);
		Thread threadObj3 = new Thread(numberObj3);

		threadObj1.start();
		threadObj1.join();
		threadObj2.start();
		threadObj3.start();

	}

}
