package com.hcl.java.day7HandsOnExcercise;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 12.Write a program to read a string and validate the IP address. Print
 * “Valid” if the IP address is valid, else print “Invalid”.   Include a
 * class UserMainCode with a static method ipValidator which accepts a string.
 * The return type (integer) should return 1 if it is a valid IP address else
 * return 2. Create a Class Main which would be used to accept Input String and
 * call the static method present in UserMainCode.
 * 
 * Note: An IP address has the format a.b.c.d where a,b,c,d are numbers between
 * 0-255.   Sample Input 1: 132.145.184.210 Sample Output 1: Valid   Sample
 * Input 2: 132.145.184.290 Sample Output 2: Invalid
 *
 * 
 */
public class UserMainCode_12 {
	public static int ipValidator(String ipAddress) {
	    StringTokenizer stringToken = new StringTokenizer(ipAddress, ".");
	    
	    int a = Integer.parseInt(stringToken.nextToken());
	    int b = Integer.parseInt(stringToken.nextToken());
	    int c = Integer.parseInt(stringToken.nextToken());
	    int d = Integer.parseInt(stringToken.nextToken());
	    if ((a >= 0 && a <= 255) && (b >= 0 && b <= 255) && (c >= 0 && c <= 255) && (d >= 0 && d <= 255))
	    	return 1;	    
	    else
	    	return 2;
	  }

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter an IPv4 Address(a.b.c.d):");
	    String ipAddress = scan.nextLine();
	    int  result = ipValidator(ipAddress);
	    if (result == 1)
	      System.out.println("Valid");
	    else
	      System.out.println("Invalid");
	    scan.close();
	  }
	  
}
