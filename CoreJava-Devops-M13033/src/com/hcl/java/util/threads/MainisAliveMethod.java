package com.hcl.java.util.threads;
class MyThread1 extends Thread{
	
	public void run() {
		System.out.println("Hi");
		
	}
	
}
public class MainisAliveMethod {

	public static void main(String[] args) throws InterruptedException {

		MyThread1 threadObj1= new MyThread1();
		threadObj1.start();
		System.out.println(threadObj1.isAlive());

		/*threadObj1.stop();
		System.out.println(threadObj1.isAlive());*/
		
		threadObj1.suspend();
		System.out.println(threadObj1.isAlive());
		
		threadObj1.interrupt();
	
		System.out.println(threadObj1.isAlive());
		
		if(threadObj1.isAlive())
		{
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				Thread.sleep(3000);
			}
		}	else
				System.out.println("Your tranaction is failed");
		}
}


