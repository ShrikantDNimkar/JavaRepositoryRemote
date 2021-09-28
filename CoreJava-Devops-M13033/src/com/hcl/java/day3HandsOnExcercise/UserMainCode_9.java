package com.hcl.java.day3HandsOnExcercise;
import java.util.Scanner;
/**
 * 9.Write a program to read a string and a character, and reverse the string and convert
 *  it in a format such that each character is separated by the given character. 
 *  Print the final string.
 *  Create a class UserMainCode with a static method reshape which accepts a string and 
 *  a character. The return type (String) should return the final string.
 *  Create a Class Main which would be used to accept a string and a character, 
 *  and call the static method present in UserMainCode.
 *  Input and Output Format:
 *  Input consists of a string and a character.
 *  Output consists of a string (the final string).
 *  Sample Input: Rabbit     - 
 *  Sample Output:t-i-b-b-a-R
 */
public class UserMainCode_9 {

	public static void main(String[] args) {
		int j=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str= scan.nextLine();
		System.out.print("Enter a Character for separation: ");
		String ch= scan.next();
		String revStr = "";
		  for (int i = str.length() - 1; i >= 0; i--) {
			  revStr += str.charAt(i);
		  }		
		System.out.print("String after reversed and by separation: ");
		for(j=0;j<revStr.length()-1;j++) {
			System.out.print(revStr.charAt(j)+ch);
		}
		System.out.print(revStr.charAt(j));
		scan.close();
	}
}
