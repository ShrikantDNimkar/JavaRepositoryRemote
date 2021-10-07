package com.hcl.java.day7HandsOnExcercise;

import java.util.Calendar;
import java.util.Scanner;

public class UserMainCode_6 {
	public static int getNumberOfDays(int month, int year) {
		Calendar calObj = Calendar.getInstance(); // default calendar

		calObj.set(Calendar.MONTH, month);
		calObj.set(Calendar.YEAR, year);

		return calObj.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	public static void main(String[] args) {
		System.out.println("Enter the Month and Year");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int year = scan.nextInt();

		System.out.println(getNumberOfDays(month, year)
				+ " days correspond to the number of days in the month in the given year.");
		scan.close();
	}

}
