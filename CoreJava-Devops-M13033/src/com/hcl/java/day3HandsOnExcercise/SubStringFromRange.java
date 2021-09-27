package com.hcl.java.day3HandsOnExcercise;

import java.util.Scanner;

public class SubStringFromRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str= scan.nextLine();
		char strArr[] = str.toCharArray();
		System.out.print("Enter the range for substring: ");
		int start= scan.nextInt();	
		int end= scan.nextInt();
		System.out.print("Substring will be: ");
		for (int i=start;i<end;i++) {
			System.out.print(strArr[i]);	
		}	
		scan.close();
	}
}
