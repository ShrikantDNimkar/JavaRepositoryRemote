package com.hcl.java.day7HandsOnExcercise;

import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Calendar;

/**
 * Write a java program to print current date and time in the specified format. *
 */
public class SpecifiedFormatOfDateAndTime_1 {

	public static void main(String[] args) {
	
		// By Calendar
		Calendar c = Calendar.getInstance(); // default calendar
	    System.out.println("Calender Formatting :"); 
	    System.out.format("%tB %te, %tY%n", c, c, c);
	    System.out.format("%tH:%tN GARBAGE VALUE=>???::skjfskjdfn32232A   %ts,%n", c, c, c,c); 
	    System.out.format("%tl:%tM %tp%n", c, c, c); 
	    System.out.format("%ta:%tA RANDOM PATTERN=><<<<>>>>>><<<< %tp %S %n", c, c, c,c); 
		// by Date 
		Date dateObj = new Date();
		System.out.println("Date: "+ dateObj +"\n"); // current date
		System.out.println("\nDate Formatting");
		System.out.println(new SimpleDateFormat("EEEEE MMMMM yyyy HH:mm:ss.SSSZ").format(dateObj));
		System.out.println(new SimpleDateFormat("EEEEE").format(dateObj));
		System.out.println(new SimpleDateFormat("MMMMM ").format(dateObj));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd '<' '-' 'T' '-' '>'HH:mm:ssZ").format(dateObj));
		System.out.println(new SimpleDateFormat("G EEEEE MMMMM yyyy hh:mm:ss.SSS a Z").format(dateObj));		
		System.out.println(new SimpleDateFormat("EEEEE MMMMM yyyy hh:mm:ss.SSS a Z").format(dateObj));
		
		/*//SimpleDateFormat sdfObj = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		SimpleDateFormat sdfObjDate = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfObjTime = new SimpleDateFormat("hh:mm:ss");
		String dateString = sdfObjDate.format(dateObj);
		String timeString = sdfObjTime.format(dateObj);
		
		System.out.println("Date exctrated by using SimpleDateTimeFormat (DD/MM/YYYY): "+dateString);
		System.out.println("Time exctrated by using SimpleDateTimeFormat (hh:mm:ss): "+timeString);*/		
	}

}
