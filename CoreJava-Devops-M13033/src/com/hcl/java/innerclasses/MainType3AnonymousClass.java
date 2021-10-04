package com.hcl.java.innerclasses;

abstract class Bank2 {

	public abstract void bankDetails();

}

interface Bank3 {

	void bankInfo();

}

public class MainType3AnonymousClass {

	public static void main(String[] args) {

		// type 3: Anonymous Class
		Bank2 bank1Obj = new Bank2() {

			@Override
			public void bankDetails() {
				// TODO Auto-generated method stub
				System.err.println("Banks Details with anonymous class");
			}
		};

		bank1Obj.bankDetails();
		
		Bank3 bank3Obj =new Bank3() {
			
			@Override
			public void bankInfo() {
				// TODO Auto-generated method stub
				System.err.println("Bank Info using anonymous class with interface");
			}
		};
		
		bank3Obj.bankInfo();
		
	}

}
