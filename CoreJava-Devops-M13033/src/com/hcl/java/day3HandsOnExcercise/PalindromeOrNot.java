package com.hcl.java.day3HandsOnExcercise;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str= scan.nextLine();
		int c = 0;
		
		for (int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i)==str.charAt(str.length()-1-i))
				c++;					
		}
		if(c>=str.length()/2)
			System.out.print(str+ " is palindrome.");
		else
			System.out.print(str+ " is not palindrome.");
	}

}
