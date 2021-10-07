package com.hcl.java.day7HandsOnExcercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

/**
 * 11.Given a method with two date strings in yyyy-mm-dd format as input. Write
 * code to find the difference between two dates in months.  Include a
 * class UserMainCode with a static method getMonthDifference which accepts two
 * date strings as input.  The return type of the output is an integer which
 * returns the diffenece between two dates in months.  Create a class Main which
 * would get the input and call the static method getMonthDifference present in
 * the UserMainCode.   Sample Input 1: 2012-03-01 2012-04-16 Sample Output 1: 1
 * Sample Input 2: 2011-03-01 2012-04-16 Sample Output 2: 13
 */
public class UserMainCode_11 {

	@SuppressWarnings("deprecation")
	public static long getMonthDifference(String dateString1, String dateString2) {
		Period difference = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date1 = sdf.parse(dateString1);
			Date date2 = sdf.parse(dateString2);
			LocalDate first_date = LocalDate.of(date1.getYear(), date1.getMonth(), date1.getDay());
			LocalDate second_date = LocalDate.of(date2.getYear(), date2.getMonth(), date2.getDay());
			difference = Period.between(first_date, second_date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return difference.toTotalMonths() + 1;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a two date (yyyy-mm-dd):");
		String date1 = scan.next();
		String date2 = scan.next();
		System.out.println("Difference of given months is " + getMonthDifference(date1, date2));
		scan.close();
	}

}
