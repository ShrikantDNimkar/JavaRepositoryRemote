package com.hcl.java.day3HandsOnExcercise;
import java.util.Scanner;

public class StringToLowercase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str= scan.nextLine();
		char strArr[] = str.toCharArray();
		
		for (int i=0;i<str.length();i++) {
			if(strArr[i]>=65 && strArr[i]<=90)
				strArr[i]= (char) (str.charAt(i) + 32);			
		}
		
		System.out.print("After lowercase: ");
		for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]);
    }
		scan.close();

	}

}
