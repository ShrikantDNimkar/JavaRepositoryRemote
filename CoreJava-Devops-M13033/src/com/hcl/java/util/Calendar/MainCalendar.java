package com.hcl.java.util.Calendar;

import java.util.Calendar;

public class MainCalendar {

	public static void main(String[] args) {
		
		Calendar calObj = Calendar.getInstance(); 	
		System.out.println(calObj.getWeekYear());
		System.out.println(calObj.getTime());
		System.out.println(calObj.getCalendarType());
		System.out.println(calObj.getFirstDayOfWeek());
		System.out.println(calObj.getTimeZone());
		
		System.out.println(calObj.get(Calendar.DATE));
		System.out.println(calObj.get(Calendar.YEAR));
		System.out.println(calObj.get(Calendar.MONTH) + 1);
		System.out.println(calObj.get(Calendar.DAY_OF_YEAR));
		
		System.out.println();
		System.out.println();
		
		
		
	}

}
