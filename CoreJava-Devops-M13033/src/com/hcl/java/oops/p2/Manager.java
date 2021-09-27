package com.hcl.java.oops.p2;
import com.hcl.java.oops.p1.Employee; 	
public class Manager extends Employee {

	public Manager(int empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}

	public  void managerInfo() {
		System.out.println("Manager Name:"+empName);

	}

}
