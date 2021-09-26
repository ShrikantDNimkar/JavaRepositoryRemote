package com.hcl.java.day1HandsOnExcercise;

import java.util.Scanner;

public class FindAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1,v2,v3;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\n Enter the first no. : ");
		v1= scan.nextInt();
		System.out.print("\n Enter the second no. : ");
		v2= scan.nextInt();
		System.out.print("\n Enter the third no. : ");
		v3= scan.nextInt();
		
		System.out.print("\nAverage of three no. = " + ((v1+v2+v3)/3));
		scan.close();
	}

}
