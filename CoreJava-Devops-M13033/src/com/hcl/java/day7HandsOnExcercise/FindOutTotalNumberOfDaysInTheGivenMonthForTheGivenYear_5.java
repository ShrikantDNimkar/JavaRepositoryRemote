package com.hcl.java.day7HandsOnExcercise;
import java.util.Calendar;
import java.util.Scanner;

public class FindOutTotalNumberOfDaysInTheGivenMonthForTheGivenYear_5 {
	/**
	 * Given two inputs year and month (Month is coded as: Jan=0, Feb=1 ,Mar=2 ...), 
	 * write a program to find out total number of days in the given month for the given year. 
	 */
	
	public static void main(String[] args) {

		System.out.println("Enter the Month and Year");
		Scanner scan = new Scanner(System.in);
		int month=scan.nextInt();
		int year=scan.nextInt();
		
		Calendar calObj = Calendar.getInstance(); //default calendar 
		
		calObj.set(Calendar.MONTH, month);
		calObj.set(Calendar.YEAR, year);
		
			
		System.out.println("The total number of days in the given month for the given year is "+calObj.getActualMaximum(Calendar.DAY_OF_MONTH));
		scan.close();
	}

}
