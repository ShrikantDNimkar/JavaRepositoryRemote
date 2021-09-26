package com.hcl.java.day1HandsOnExcercise;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UserMainCode_10 {
	static String getLargestWord(String str1) {
		int maxLength=0;
		String str2=new String();
		StringTokenizer t=new StringTokenizer(str1," ");
		while(t.hasMoreTokens()){
			String str3=t.nextToken();
			int n=str3.length();
			if(n>maxLength){
				maxLength=n;
				str2=str3;
			}
		}
			return str2;
	}
	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str= scan.next();
		scan.close();		
		if(str != null){ 
			System.out.println("Largest word in given string is " 
								+ getLargestWord(str));
		} else		
			System.out.println("Please enter valid string only.");
	  }
	}

