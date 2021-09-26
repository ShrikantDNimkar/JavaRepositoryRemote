package com.hcl.java.classobjectmethodconstructor;

import java.util.Scanner;

public class MainEmployee 
{

	public static void main(String[] args) 
	{
		//Step 1: Create an object or instantiate object
		Employee empObj = new Employee();
		
		Scanner scan = new Scanner(System.in);
		
		//Step 2: Initialization or assign the values
		
		System.out.println("Enter Employee ID : ");
		empObj.employeeId=scan.nextInt();
		System.out.println("Enter Employee Name : ");
		empObj.employeeName=scan.next();
		System.out.println("Enter Employee Salary : ");
		empObj.salary=scan.nextDouble();
		System.out.println("Enter Employee Email : ");
		empObj.emailId=scan.next();
		System.out.println("Enter Employee Mobile No. : ");
		empObj.mobile=scan.nextLong();
		System.out.println("Enter Employee Password : ");
		empObj.password=scan.next();
		
		//Step 3: display employee details in console using class object.
		System.out.println("-------1st employee-------");
		System.out.println("        Employee ID : "+ empObj.employeeId);
		System.out.println("      Employee Name : "+ empObj.employeeName);
		System.out.println("    Employee Salary : "+ empObj.salary);
		System.out.println("     Employee Email : "+ empObj.emailId);
		System.out.println("Employee Mobile No. : "+ empObj.mobile);
		System.out.println("  Employee Password : "+ empObj.password);
		
		Employee empObj2 = new Employee();
		Employee empObj3 = new Employee();
				
		empObj2.employeeId=2;
		empObj2.employeeName="Gavin";
		empObj2.salary=51000.00;
		empObj2.emailId="gavin@gmail.com";
		empObj2.mobile=9876543212L;
		empObj2.password="java2";
		
		empObj3.employeeId=3;
		empObj3.employeeName="Jhonson";
		empObj3.salary=53000.00;
		empObj3.emailId="jhonson@gmail.com";
		empObj3.mobile=9876543213L;
		empObj3.password="java3";
		
		System.out.println();
		System.out.println("-------2nd employee-------");
		System.out.println("        Employee ID : "+ empObj2.employeeId);
		System.out.println("      Employee Name : "+ empObj2.employeeName);
		System.out.println("    Employee Salary : "+ empObj2.salary);
		System.out.println("     Employee Email : "+ empObj2.emailId);
		System.out.println("Employee Mobile No. : "+ empObj2.mobile);
		System.out.println("  Employee Password : "+ empObj2.password);
		
		System.out.println( );
		System.out.println("-------3rd employee-------");
		System.out.println("        Employee ID : "+ empObj3.employeeId);
		System.out.println("      Employee Name : "+ empObj3.employeeName);
		System.out.println("    Employee Salary : "+ empObj3.salary);
		System.out.println("     Employee Email : "+ empObj3.emailId);
		System.out.println("Employee Mobile No. : "+ empObj3.mobile);
		System.out.println("  Employee Password : "+ empObj3.password);
		
	}

}
