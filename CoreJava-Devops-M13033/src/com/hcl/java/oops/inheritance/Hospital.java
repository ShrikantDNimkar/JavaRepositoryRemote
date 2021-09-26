package com.hcl.java.oops.inheritance;

public class Hospital {

	public static void main(String[] args) {
		
		NeuroSurgeon nsObj = new NeuroSurgeon();
		nsObj.doctorDetails();      //GrandParent Class Members
		nsObj.surgeonDetails();     //Parent Class Members
		nsObj.neuroSergeonDetails();//Child Class Members
		
		GeneralPhysician gpObj = new GeneralPhysician();
		gpObj.doctorDetails();      //Parent Class Members
		gpObj.physicianDetails();   //Child Class Members

	}

}
