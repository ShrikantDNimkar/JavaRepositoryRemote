package com.hcl.java.day7HandsOnExcercise;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 14.Given a date string in the format dd/mm/yyyy, write a program to convert
 * the given date to the format dd-mm-yy. Include a class UserMainCode with a
 * static method “convertDateFormat” that accepts a String and returns a String.
 *  Create a class Main which would get a String as input and call the static
 * method convertDateFormat present in the UserMainCode. Sample Input:
 * 12/11/1998   Sample Output: 12-11-98
 */
public class UserMainCode_14 {
	public static String convertDateFormat(String date) {
		StringTokenizer StringToken = new StringTokenizer(date, "//");
		String d = StringToken.nextToken();
		String m = StringToken.nextToken();
		String y = StringToken.nextToken();
		String yy = null;
		if (y.length() != 4)
			System.out.println("Invalid year format (yyyy).");
		else
			yy = String.valueOf(y.charAt(2)) + String.valueOf(y.charAt(3));

		return d + "-" + m + "-" + yy;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a date (dd/mm/yyyy):");
		String date = scan.next();
		System.out.println("After required formatting (dd-mm-yy) :" 
									+ convertDateFormat(date));
		scan.close();
	}

}
