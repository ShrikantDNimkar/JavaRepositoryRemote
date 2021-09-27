package com.hcl.java.oops.abstraction;

abstract class Bank{
	//abstract methods
	public abstract void rateOfInterest();
	public void locationInfo() {
		System.out.println("India (Non abstract Methods)");
		
	}
}

class SBI extends Bank{
	public void rateOfInterest() {
		System.out.println("SBI ROI : 14% (Abstract Methods)");
	}
}
class HDFC extends Bank{
	public void rateOfInterest() {
		System.out.println("HDFC ROI: 15% (Abstract Methods)");
	}
}
public class MainUsingAbstractClass {

	public static void main(String[] args) {
		//Rule : Cannot Instantiate the typeBank (i.e. abstract class)
		//Bank bankObj=new Bank();
		
		SBI sbiObj= new SBI();
		sbiObj.rateOfInterest();
		
		HDFC hdfcObj= new HDFC();
		hdfcObj.rateOfInterest();

		sbiObj.locationInfo();
		hdfcObj.locationInfo();
	}

}
