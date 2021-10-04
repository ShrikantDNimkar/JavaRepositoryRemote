package com.hcl.java.objectclass;

public class MainfinalizeMethod {

	protected void finalize() {
		System.out.println("Finalize Method.");
	}
	public static void main(String[] args) {
		
		MainfinalizeMethod m = new MainfinalizeMethod();
		
		m=null;
		
		System.gc();
		System.out.println("End");

	}

}
