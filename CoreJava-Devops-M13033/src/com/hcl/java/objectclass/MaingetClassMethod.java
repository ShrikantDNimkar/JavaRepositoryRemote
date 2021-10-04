package com.hcl.java.objectclass;

public class MaingetClassMethod {

	public static void main(String[] args) {
		Object obj = new String();
		Class classObj = obj.getClass();
		
		System.out.println(classObj);
		System.out.println("Class name is "+classObj.getName());
	}

}
