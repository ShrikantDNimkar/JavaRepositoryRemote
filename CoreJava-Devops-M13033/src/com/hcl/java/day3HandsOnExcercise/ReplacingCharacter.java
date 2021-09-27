package com.hcl.java.day3HandsOnExcercise;

import java.util.Scanner;

public class ReplacingCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str= scan.nextLine();
		char strArr[] = str.toCharArray();
		
		for (int i=0;i<str.length();i++) {
			if(strArr[i] == 'd')
				strArr[i]= 'h';		
		}
		
		System.out.print("After lowercase: ");
		for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]);
    }
		scan.close();

	}

}
