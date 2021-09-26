package com.hcl.java.day2HandsOnExcercise;

class A{
	A(){
		System.out.println("Hi I am from class A");
	}
}

class B extends A{
	B(){
		super();
		System.out.println("Hi I am from class B");
	}
}

public class InheritOfAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Intializing class A");
		A a=new A();
		System.out.println();
		System.out.println("Intializing class B");
		B b=new B();
	}

}
