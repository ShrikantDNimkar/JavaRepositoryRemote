package com.hcl.java.day2HandsOnExcercise;
import java.util.Scanner;

public class VowelsInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str= scan.nextLine();
		scan.close();
		int vowels=0;
		
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) == 'A' ||str.charAt(i) == 'E' ||
					str.charAt(i) == 'I' ||	str.charAt(i) == 'O' ||
					str.charAt(i) == 'U' || str.charAt(i) == 'a' || 
					str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
					str.charAt(i) == 'o' || str.charAt(i) == 'u'  ) 
			{
				
				vowels++;
			}			
		}
		
		System.out.println("Numbers of vowels are "+ vowels);

	}

}
