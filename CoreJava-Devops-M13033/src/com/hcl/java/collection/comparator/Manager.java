package com.hcl.java.collection.comparator;

public class Manager {
	private int employeeId;
	private String employeeName;
	private double salary;
	
	public Manager (int employeeId, String employeeName, double salary) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getSalary() {
		return salary;
	}

	
	
}
