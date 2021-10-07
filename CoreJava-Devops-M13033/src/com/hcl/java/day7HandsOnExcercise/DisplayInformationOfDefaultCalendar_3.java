package com.hcl.java.day7HandsOnExcercise;

import java.util.Calendar;

public class DisplayInformationOfDefaultCalendar_3 {

	public static void main(String[] args) {
		
        Calendar cal = Calendar.getInstance(); // Default calendar
        System.out.println("Displaying the information (year, month, day, hour, minute) of a default calendar");
        System.out.println("Year: " + cal.get(Calendar.YEAR)); //Year
        System.out.println("Month: " + cal.get(Calendar.MONTH)); //Month
        System.out.println("Day: " + cal.get(Calendar.DATE)); //Date
        System.out.println("Hour: " + cal.get(Calendar.HOUR)); //Hour
        System.out.println("Minute: " + cal.get(Calendar.MINUTE));//Minute
	   

	}

}
