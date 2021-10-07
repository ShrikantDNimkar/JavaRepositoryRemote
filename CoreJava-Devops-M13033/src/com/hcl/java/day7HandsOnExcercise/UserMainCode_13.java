package com.hcl.java.day7HandsOnExcercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 13.Get two date strings as input and write code to find difference between
 * two dates in days. Include a class UserMainCode with a static
 * method getDateDifference which accepts two date strings as input. The return
 * type of the output is an integer which returns the diffenece between two
 * dates in days. Create a class Main which would get the input and call the
 * static method getDateDifference present in the UserMainCode.   Sample Input
 * 1: 2012-03-12 2012-03-14 Sample Output 1: 2
 * 
 * Sample Input 2: 2012-04-25 2012-04-28 Sample Output 2: 3
 *
 * 
 */
public class UserMainCode_13 {

	public static long getDateDifference(String dateString1, String dateString2) {
		long days_difference = 0;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date1 = sdf.parse(dateString1);
			Date date2 = sdf.parse(dateString2);
			days_difference = ((date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24)) % 365;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return days_difference;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a two date (yyyy-mm-dd):");
		String date1 = scan.next();
		String date2 = scan.next();
		System.out.println("Difference of given dates is " + getDateDifference(date1, date2));
		scan.close();
	}
}
