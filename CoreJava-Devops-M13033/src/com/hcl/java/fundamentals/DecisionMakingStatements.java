package com.hcl.java.fundamentals;

import java.lang.System;
 import java.util.Scanner;

public class DecisionMakingStatements 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("---------------------");
		System.out.println("Hotel ABC");
		System.out.println("---------------------");
		
		System.out.println("Enter your choice");
		
		// read the data from keyboard using scanner class
		Scanner scan = new Scanner(System.in);
		int number= scan.nextInt();
		if(number>0)
		{
			switch (number) 
			{
				case 1:
					System.out.println("Idly");
					break;
				case 2:
					System.out.println("Wada");
					break;	
				case 3:
					System.out.println("Puri");
					break;	
				case 4:
					System.out.println("Dosa");
					break;	
				default:
					System.out.println("No stock");
			}		
		}
		else if(number == 0)
		{
			System.out.println("Please enter non zero values only");
		}
		else	
		{
			System.out.println("Please enter positive values only");
		}
	}

}
