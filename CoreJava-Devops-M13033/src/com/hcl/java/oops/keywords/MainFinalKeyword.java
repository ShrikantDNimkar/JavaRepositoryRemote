package com.hcl.java.oops.keywords;

public class MainFinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class RBI 
{
	final float rateOfInterest = 15.0f;
	final void info() {
		System.out.println("Rate of Interest"+ rateOfInterest);;
	}
}

class SBI extends RBI{
	float rateOfInterest = 16.0f;
//	 void info(){
//		System.out.println("Rate of Interest"+ rateOfInterest);;
//	}
}