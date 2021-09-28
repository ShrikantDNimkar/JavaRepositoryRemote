package com.hcl.java.day3HandsOnExcercise;
import java.util.Scanner;
/**
 * 8.	Write a program to read a string and return a modified string 
 * 		based on the following rules. 
 *		Return the String without the first 2 characters except when 
 *			a.	Keep the first char if it is 'k' 
 *			b.	Keep the second char if it is 'b'. 
 *		Create a class UserMainCode with a static method getString which
 *	 	accepts a string and the return type (string) should be the 
 *	 	modified string based on the above rules. Consider all letters 
 *	 	in the input to be small case. 
 */
public class UserMainCode_8 {	
	public static String modify(String str) {    
		  if(str.length() > 0) {
		    if(str.substring(0,1).equals("k") && !str.substring(1,2).equals("b")) {
		      return str.substring(0,1) + str.substring(2,str.length());
		    } else if(str.substring(1,2).equals("b") && !str.substring(0,1).equals("k")) {
		      return str.substring(1,2) + str.substring(2,str.length());
		    } else if(str.substring(0,1).equals("k") && str.substring(1,2).equals("b")) {
		      return str;
		    } else {
		      return str.substring(2,str.length());
		    }
		  } else {
		    return "Please enter valid String.";
		  }
		}	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str= scan.nextLine();
		System.out.println(modify(str));		
		scan.close();
	}
}



