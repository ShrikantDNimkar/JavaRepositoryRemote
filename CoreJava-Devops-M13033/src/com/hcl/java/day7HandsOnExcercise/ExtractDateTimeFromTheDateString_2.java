package com.hcl.java.day7HandsOnExcercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExtractDateTimeFromTheDateString_2 {

	public static void main(String[] args) throws ParseException {
		Date dateObj = new Date(); //current date
		System.out.println("Current date: "+dateObj);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter user-defined date as well as time i.e. (yyyy-MM-dd HH:mm:ss): ");
		String dateTime = scan.nextLine();
		
		Date extractDateTime= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateTime);
		String extractDate = new SimpleDateFormat("EEEEE, dd MMMMM yyyy").format(extractDateTime);
		String extractTime = new SimpleDateFormat("hh:mm:ss a").format(extractDateTime);
		
		System.out.println("\nAfter modifying the extraction from string:\n"+extractDate+"\n"+extractTime);
		
		scan.close();
		
	}

}
