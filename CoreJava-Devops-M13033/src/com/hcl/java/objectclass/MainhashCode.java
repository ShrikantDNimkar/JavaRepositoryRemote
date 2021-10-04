package com.hcl.java.objectclass;

class Employee extends Object{

	private int employeeId;
	private String employeeName;
	Employee() {
		employeeId = 1010;
		employeeName= "java";
	}

	public int hashCode() {

		return employeeId;
	}
	
	public String toString() {
		return employeeName+"\n"+employeeName;
	}
}

public class MainhashCode {

	public static void main(String[] args) {
		Employee empObj1 = new Employee();
		System.out.println(empObj1);
		System.out.println(empObj1.toString());
		System.out.println(empObj1.hashCode());
	}
	
}
