package com.hcl.java.util.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class MainUtilityClasses {

	public static void main(String[] args) {
		
		Date dateObj = new Date();
		System.out.println("Date: "+ dateObj);
		
		//Date Format
		//1.DateFormat
		//2. SimpleDateFormat
		
		DateFormat dfObj = DateFormat.getInstance();
		String dateFormatResult = dfObj.format(dateObj);
		System.out.println("Date and time using dateformat: "+dateFormatResult);
		
		DateFormat dfObj1 = DateFormat.getDateInstance();
		String dateFormatResult1 = dfObj1.format(dateObj);
		System.out.println("Date using dateformat: "+dateFormatResult1);
		
		DateFormat dfObj2 = DateFormat.getTimeInstance();
		String dateFormatResult2 = dfObj2.format(dateObj);
		System.out.println("Time using dateformat: "+dateFormatResult2);
		
		//2.SimpleDateFormat
		
		SimpleDateFormat sdfObj = new SimpleDateFormat("MM/dd/yyyy");
		String result = sdfObj.format(dateObj);
		System.out.println("Date Format using SimpleDateFormat: "+result);
		
		//Note: Simple Formats: ==>MM/dd/yyyy, dd-MM-yyyy, dd-MM-yyyy hh:mm:ss
		
		//LocalDate
		LocalDate localDateObj = LocalDate.now();
		System.out.println("Local date: "+localDateObj);
		
		//Parsing
		LocalDate ldObj =LocalDate.parse("2021-10-04");
		System.out.println("String to Date: " +ldObj);
		
		
		
		
		
		
		
		
		
	}

}
