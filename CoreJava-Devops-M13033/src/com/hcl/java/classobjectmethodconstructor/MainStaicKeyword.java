package com.hcl.java.classobjectmethodconstructor;

public class MainStaicKeyword {

	static int employeeId=1; //static variable
	
	MainStaicKeyword() {
		System.out.println("----info----");
		this.show();
	}
	
	void show() {
		System.out.println(employeeId);
		employeeId++;
	}
	
	static void display() {
		System.out.println("I am static method");
	}
	
	//Static block
	static {
		System.out.println("I am static block");
		employeeId =9;
	}
	
	public static void main(String[] args) {
		
		MainStaicKeyword obj1 =new MainStaicKeyword();
		MainStaicKeyword obj2 =new MainStaicKeyword();
		MainStaicKeyword obj3 =new MainStaicKeyword();
		
		obj1.display(); //using object
		MainStaicKeyword.display();
		display();
		//rules
		// 
		//

	}

}
