package com.hcl.java.langpackage;

public class MainStringBufferAndStringBuilder {

	public static void main(String[] args) {
		
		System.out.println("------Using String Buffer------");
		StringBuffer strBufferObj1= new StringBuffer("HCL");
		StringBuffer strBufferObj2= new StringBuffer("Channai");
		
		System.out.println("Capacity: "+strBufferObj1.capacity());
		System.out.println("Insert: "+ strBufferObj1.insert(3,"TECH"));
		System.out.println("Repalce: "+ strBufferObj1.replace(3,4," "));
		System.out.println("Reverse: "+ strBufferObj1.reverse());
		System.out.println("Delete: "+ strBufferObj1.delete(0,3));
		System.out.println("Append: "+ strBufferObj1.append(strBufferObj2));
		
		System.out.println("------String Builder------");
		StringBuilder strBuilderObj1= new StringBuilder("HCL");
		StringBuilder strBuilderObj2= new StringBuilder("Channai");
		
		System.out.println("Capacity: "+strBuilderObj1.capacity());
		System.out.println("Insert: "+ strBuilderObj1.insert(3,"TECH"));
		System.out.println("Repalce: "+ strBuilderObj1.replace(3,4," "));
		System.out.println("Reverse: "+ strBuilderObj1.reverse());
		System.out.println("Delete: "+ strBuilderObj1.delete(0,3));
		System.out.println("Append: "+ strBuilderObj1.append(strBuilderObj2));
	}

}
