package com.hcl.java.oops.keywords;

public class MainSuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass subObj = new SubClass();
		subObj.display();
		subObj.show();
	}

}

class SuperClass{
	String color="green"; // variable
	
	void show()	{
		System.out.println("Super class method");
	}
}

class SubClass extends SuperClass{
	
	String color="maroon";
	void show()	{
		super.show();
		System.out.println("Sub class method");
	}
	void display() {
		System.out.println(super.color);
		System.out.println(this.color);
	}
}