package com.hcl.java.day5HandsOnExcercise;

import java.util.Scanner;

public class RunRateException_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter the total runs scored : ");
			int runs = Integer.parseInt(scan.next());
			System.out.println("Enter the total overs faced : ");
			int overs = Integer.parseInt(scan.next());
			int runRate = runs / overs;
			System.out.println(runRate);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			e.printStackTrace();

		}

		
		System.out.println("\n Program is terminated normally by end of code.");
		scan.close();		
	}

}
