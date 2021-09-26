package com.hcl.java.day1HandsOnExcercise;
import java.util.Scanner;
public class ASCII_ValueOfCharacter {
	
	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		System.err.print("Enter the Character : ");
		char c = scan.next().charAt(0);
		int i = (int)c;
		System.out.println("\nASCII value of " + c + " is "+ i);
		scan.close();	
		
	}

}
