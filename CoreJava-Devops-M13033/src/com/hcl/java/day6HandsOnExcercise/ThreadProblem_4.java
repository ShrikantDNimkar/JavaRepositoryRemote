package com.hcl.java.day6HandsOnExcercise;

class DemoThread1 extends Thread {
	String objName;

	public DemoThread1(String objName) {
		this.start();
		this.setName(objName);
	}

	@Override
	public void run() {

		try {
			for (int i = 1; i < 11; i++) {
				System.out.println(Thread.currentThread().getName()
						/* OR SIMPLY CALL-->>objName */ + "running child Thread in loop :" + i);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

/**
 * Write a program to create a class DemoThread1 implementing Runnable
 * interface. In the constructor, create a new thread and start the thread. In
 * run() display a message "running child Thread in loop : " display the value
 * of the counter ranging from 1 to 10. Within the loop put the thread to sleep
 * for 2 seconds. In main create 3 objects of the DemoTread1 and execute the
 * program.
 * 
 * Rewrite the earlier program so that, now the class DemoThread1 instead of
 * implementing from Runnable interface, will now extend from Thread class.
 *
 * 
 * 
 */
public class ThreadProblem_4 {

	public static void main(String[] args) {

		DemoThread1 demoThread1 = new DemoThread1("Object No. 1->");
		DemoThread1 demoThread2 = new DemoThread1("Object No. 2->");
		DemoThread1 demoThread3 = new DemoThread1("Object No. 3->");

	}

}
