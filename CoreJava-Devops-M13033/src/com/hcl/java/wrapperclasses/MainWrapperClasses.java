package com.hcl.java.wrapperclasses;

import java.util.ArrayList;

class Employee{
	Integer id;
}

public class MainWrapperClasses {

	public static void main(String[] args) {
		
		int i1 =10; //primitive data class
		
		Integer i2=10; //Wrapper Class
		Integer i3 = new Integer(10); //Wrapper Class
		
		//Boxing (Primitive type --> Wrapper class)  -- Using valueOf() Method 
 		System.out.println("-----Boxing-----");
		int i =10;
		Integer intValue = Integer.valueOf(i);
		System.out.println("Boxing: "+ intValue);
		
		//Unboxing (Wrapper class --> Primitive type)  -- Using ...Value() Method 
		System.out.println("-----Unboxing-----");
		Double doubleObj= new Double(5100.00);
		double d = doubleObj.doubleValue();
		System.out.println("Unboxing: "+ d);
		
		//Autoboxing
		System.out.println("-----AutoBoxing-----");
		char genderValue = 'M';
		Character genderObj = genderValue;
		System.out.println("AutoBoxing: "+ genderObj);
		
		//convert String to Integer or vice-versa
		String str = "10";
		Integer intObj = Integer.valueOf(str);
		System.out.println(intObj);
		// 2nd way
		Integer parseInt = Integer.parseInt(str);
		System.out.println(parseInt);
		
		/*ArrayList<Interger> arrayListO =new ArrayList<>(); =>Correct
		ArrayList<int> arrayListP =new ArrayList<>(); =>Incorrect   */
		
		//convert Character to String
		Character character = new Character('M');
		String string = String.valueOf(character); //1st way
		String string1 = character.toString(); //2nd way
		char c = 'M';
		String string2= Character.toString(c); //3rd way
		System.out.println(string);
		System.out.println(string1);
		System.out.println(string2);
		
		//Object o =new Object();
		
		
	}

}
