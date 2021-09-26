package com.hcl.java.classobjectmethodconstructor;

public class MainTypesOfMethods {

	public static void main(String[] args) {
		//create an objects
		Employee2 empObj1=new Employee2();
		
		//call the method using reference
		empObj1.show();
		
		// call the parameterize using empObj1
		empObj1.showEmployee(1,"James", 51000.00);
		empObj1.showEmployee(2,"Gavin", 52000.00);
		empObj1.showEmployee(3,"Jhonson", 53000.00);
		empObj1.showEmployee(4,"EFCodd", 54000.00);

	}

}

class Employee2{
	int employeeId;
	String employeeName;
	double salary;
	
	//Type-1: method without parameters
	void show() {
		System.out.println("-----Employee Information-----");
	}
	
	void showEmployee(int employeeId, String employeeName, double salary) {
		/*
		System.out.println("Employee Id: "+ employeeId);
		System.out.println("Employee Name: "+ employeeName);
		System.out.println("Salary: "+ salary);
		*/
		System.out.println(employeeId+"\t"+employeeName+"\t"+salary);
	}
}
