package com.hcl.java.day7HandsOnExcercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 9. A Company wants to obtain employees of a particular designation. You have
 * been assigned as the programmer to build this package. You would like to
 * showcase your skills by creating a quick prototype. The prototype consists of
 * the following steps: Read Employee details from the User. The details would
 * include name and designaton in the given order. The datatype for name and
 * designation is string. Build a hashmap which contains the name as key and
 * designation as value. You decide to write a function obtainDesignation which
 * takes the hashmap and designation as input and returns a string array of
 * employee names who belong to that designation as output. Include this
 * function in class UserMainCode. Create a Class Main which would be used to
 * read employee details in step 1 and build the hashmap. Call the static method
 * present in UserMainCode. 
 * Sample Input 1: 4 Manish MGR Babu CLK Rohit MGR Viru PGR MGR
 * 
 * Sample Output 1: Manish Rohit
 *
 * 
 */
public class UserMainCode_9 {

	public static ArrayList<String> obtainDesignation(HashMap<String, String> hashMapObj, String  designation) {
		String temp;
		ArrayList<String> emplyeeName = new ArrayList<>();
		
		Iterator<String> i = hashMapObj.keySet().iterator();
		while(i.hasNext()) {
			temp =i.next();
			if(hashMapObj.get(temp).equals(designation))
				emplyeeName.add(temp);
		}	
		
		return emplyeeName;
	}

	public static void main(String[] args) {
		HashMap<String, String> hashMapObj = new HashMap<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of employees :");
		int numberOfEmployee = scan.nextInt();
		
		System.out.println("Enter the details of Employee ie. Name Designation");
		
		for (int i = 0; i < numberOfEmployee; i++) {
			String name = scan.next();
			String post = scan.next();
			hashMapObj.put(name, post);			
		}				
		System.out.println();
		System.out.println("Enter the Name of Designation of Employee to display list.");
		String designation = scan.next();
		
		System.out.println("Names are : -->>" + obtainDesignation(hashMapObj, designation));
		System.err.println("i.e. \n" );
		obtainDesignation(hashMapObj, designation).forEach((name) -> System.out.println(name));
		scan.close();
		}
	}


