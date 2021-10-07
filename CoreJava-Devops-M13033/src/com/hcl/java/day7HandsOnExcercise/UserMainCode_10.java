package com.hcl.java.day7HandsOnExcercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
public class UserMainCode_10 {
	public static String findOldDate(String dateString1, String dateString2) {
		String oldDate= null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date date1 = sdf.parse(dateString1);
			Date date2 = sdf.parse(dateString2);
			StringTokenizer dateTokenYear1=new StringTokenizer(dateString1, "-");
			String d1 = dateTokenYear1.nextToken();
			String m1 = dateTokenYear1.nextToken();
			String y1 = dateTokenYear1.nextToken();
			StringTokenizer dateTokenYear2=new StringTokenizer(dateString2, "-");
			String d2 = dateTokenYear2.nextToken();
			String m2 = dateTokenYear2.nextToken();
			String y2 = dateTokenYear2.nextToken();
			if(date1.compareTo(date2) == 0 || date1.compareTo(date2) < 0) 
				oldDate=((date1.getMonth()+1) <10 ?("0"+(date1.getMonth()+1)) : (date1.getMonth()+1) )+"/"
						+((date1.getDate() <10) ? ("0"+date1.getDate()) : date1.getDate())+"/"+y1;
			else 
				oldDate=((date2.getMonth()+1) <10 ?("0"+(date2.getMonth()+1)) : (date2.getMonth()+1) )+"/"
						+((date2.getDate() <10) ? ("0"+date2.getDate()) : date2.getDate())+"/"+y2;		
				
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return oldDate;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a two date (dd-mm-yyyy):");
		String date1 = scan.next();
		String date2 = scan.next();
		System.out.println("Oldest of given dates is " + findOldDate(date1, date2));
		scan.close();
	}

}
