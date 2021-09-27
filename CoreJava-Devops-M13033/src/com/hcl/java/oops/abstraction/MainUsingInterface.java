package com.hcl.java.oops.abstraction;

interface Bank1{
//	/*Optional => public abstract*/ void addEmployee();
//	/*Optional => public abstract*/ void showEmployee();
	void rateOfInterest();
}

interface RBI{
	void locationInfo();
}

class SBI1 implements Bank1,RBI{
	public void rateOfInterest() {
		System.out.println("SBI ROI : 14% (Abstract Methods of Interface of Bank1");
	}
	public void locationInfo() {
		System.out.println("Mumbai (Abstract Methods of Interface of RBI)");
	}
}
class HDFC1 implements Bank1,RBI{
	public void rateOfInterest() {
		System.out.println("HDFC ROI: 15% (Abstract Methods of Interface of Bank1)");
	}
	public void locationInfo() {
		System.out.println("Nagpur (Abstract Methods of Interface of RBI)");
	}
}

public class MainUsingInterface {

	public static void main(String[] args) {
		//Rule : Cannot instantiate the type Bank1 (We can not create an object for interface)
		//Bank1 bankObj= new Bank1();
		Bank1 bankObj = new SBI1();
		RBI bankObjR = new SBI1();
		bankObj.rateOfInterest();
		bankObjR.locationInfo();
		
		Bank1 bankObj2 = new HDFC1();
		RBI bankObjR2 = new HDFC1();
		bankObj2.rateOfInterest();
		bankObjR2.locationInfo();
		
	}

}
