package com.hcl.java.day2HandsOnExcercise;
import java.util.Scanner;
public class MiddleCharacterOfString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str= scan.next();
		scan.close();
		
		if(str.length()%2 == 0)
		{
			System.out.println("Middle charater of even string is '" 
		+ str.substring(str.length()/2 -1, str.length()/2+1)+"'");
		}
		else
			System.out.println("Middle charater of odd string is '"
		+ str.charAt(str.length()/2 + 1)+"'");
		
	}

}
