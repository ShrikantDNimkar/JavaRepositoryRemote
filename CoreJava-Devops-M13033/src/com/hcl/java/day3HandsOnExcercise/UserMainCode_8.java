//package com.hcl.java.day3HandsOnExcercise;
//import java.util.Scanner;
//
///**
// * 8.	Write a program to read a string and return a modified string 
// * 		based on the following rules. 
// *		Return the String without the first 2 characters except when 
// *			a.	Keep the first char if it is 'k' 
// *			b.	Keep the second char if it is 'b'. 
// *		Create a class UserMainCode with a static method getString which
// *	 	accepts a string and the return type (string) should be the 
// *	 	modified string based on the above rules. Consider all letters 
// *	 	in the input to be small case. 
// */
//
//public class UserMainCode_8 {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter a String: ");
//		String str= scan.nextLine();
//		char strArr[] = str.toCharArray();
//		
//		
//			
//		for (int i=0;i<str.length();i++) {
//			if(str.charAt(0) == 'k') {
//				if (str.charAt(1) == 'b') {
//					System.out.print(strArr[i]);
//				}
//				else
//				
//			}			
//		}
//		else
//			
//		
//		System.out.print("After lowercase: ");
//		for (int i = 0; i < strArr.length; i++) {
//            System.out.print(strArr[i]);
//    }
//		scan.close();
//
//	}
//
//}
//
//
//
