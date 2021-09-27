package com.hcl.java.oops.p1;

public class Employee {
	
	protected int empId;
	protected String empName;
	
	public Employee (int empId, String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	public void employeeInfo() {
		System.out.println("employee ID:"+empId);
		System.out.println("employee name:"+empName);
	}
	
}
