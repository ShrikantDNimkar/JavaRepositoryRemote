package com.hcl.java.util.threads;

class Employee extends Thread{
	
	int empId;
	String empName;
	public void run() {
		System.out.println(empId+"\t"+empName+"\t"+Thread.currentThread().getPriority());;
	}
}

public class MainThreadPriority {

	public static void main(String[] args) {
		Employee empObj1 = new Employee();
		empObj1.empId=1021;
		empObj1.empName="James";
		empObj1.setPriority(Thread.MIN_PRIORITY);//empObj1.setPriority(1);
		empObj1.start();

		Employee empObj2 = new Employee();
		empObj2.empId=1022;
		empObj2.empName="Gavin";
		empObj2.setPriority(Thread.MAX_PRIORITY);//empObj2.setPriority(10);
		empObj2.start();
		
		Employee empObj3 = new Employee();
		empObj3.empId=1023;
		empObj3.empName="Jhonson";
		empObj3.setPriority(Thread.NORM_PRIORITY);//empObj3.setPriority(5);
		empObj3.start();
		
	}

}
