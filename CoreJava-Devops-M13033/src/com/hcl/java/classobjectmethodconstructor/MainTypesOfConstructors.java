package com.hcl.java.classobjectmethodconstructor;

public class MainTypesOfConstructors {

	public static void main(String[] args) {
		System.out.println("----Default Constructor----");
		Employee1 empObj1= new Employee1(); // no argument
		
		//display result
		System.out.println(empObj1.empId);
		System.out.println(empObj1.empName);
		System.out.println(empObj1.salary);
		System.out.println(empObj1.emailId);
		System.out.println(empObj1.mobileNumber);
		System.out.println(empObj1.password);
		
		System.out.println();
		System.out.println("----Parameterized Constructor----");
		//create an object
		Employee1 empObj2= new Employee1(2, "Gavin", 52000.00, 9876543212L, "gavin@gmail.com", "java2");
		System.out.println(empObj2.empId);
		System.out.println(empObj2.empName);
		System.out.println(empObj2.salary);
		System.out.println(empObj2.emailId);
		System.out.println(empObj2.mobileNumber);
		System.out.println(empObj2.password);
		
		System.out.println();
		System.out.println("----Copy Constructor----");
		//create an object
		Employee1 empObj3= new Employee1(empObj2);
		System.out.println(empObj3.empId);
		System.out.println(empObj3.empName);
		System.out.println(empObj3.salary);
		System.out.println(empObj3.emailId);
		System.out.println(empObj3.mobileNumber);
		System.out.println(empObj3.password);
		
		

	}

}

class Employee1{
	
	//declare variables
	int empId;
	String empName;
	double salary;
	long mobileNumber;
	String emailId;
	String password;
	
	//Type-1: Default Constructor
	Employee1(){
		empId=1;
		empName="James";
		salary=51000.00;
		mobileNumber=9876543210L;
		emailId="james@gmail.com";
		password="java";
	}
	
	//Type-1: Parameterized Constructor
	Employee1(int empId,
	String empName,
	double salary,
	long mobileNumber,
	String emailId,
	String password){
		
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		this.mobileNumber=mobileNumber;
		this.emailId=emailId;
		this.password=password;
	}
	
	Employee1(Employee1 empObj)
	{
		this.empId=empObj.empId;
		this.empName=empObj.empName;
		this.salary=empObj.salary;
		this.mobileNumber=empObj.mobileNumber;
		this.emailId=empObj.emailId;
		this.password=empObj.password;
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
