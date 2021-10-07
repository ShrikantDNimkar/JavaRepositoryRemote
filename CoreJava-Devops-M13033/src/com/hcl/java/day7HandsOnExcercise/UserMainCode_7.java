package com.hcl.java.day7HandsOnExcercise;

import java.util.Scanner;

public class UserMainCode_7 {

	public static int checkCharacters(String string){
		if(string.charAt(0) == string.charAt(string.length()-1))
			return 1;
		else
			return -1;
		
	}
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String :");
		String string=scan.nextLine();		
		
		int result = checkCharacters(string);
		
		if( result == 1)
			System.out.println("Valid");
		else 
			System.out.println("Invalid");
		
		System.out.println(result);
		scan.close();

	}

}
