package com.hcl.java.day7HandsOnExcercise;

import java.util.Calendar;

public class MaximumValueOfTheYearMonthWeekDateFromTheCurrentDateOfDefaultCalendar_4 {

	public static void main(String[] args) {		
        Calendar cal = Calendar.getInstance(); // Default calendar		
		System.out.println("Current Date and Time:" + cal.getTime()); // Current Date & Time		
		System.out.println("Maximum value for Year: "+cal.getActualMaximum(Calendar.YEAR));
		System.out.println("Maximum value for Month: "+(cal.getActualMaximum(Calendar.MONTH)+1));
		System.out.println("Maximum value for Week of Year: "+cal.getActualMaximum(Calendar.WEEK_OF_YEAR));
		System.out.println("Maximum value for Date: "+cal.getActualMaximum(Calendar.DATE));	
	}

}
