package com.hcl.java.day1HandsOnExcercise;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String args[])
	   {		
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number except 0 or 1:");
		int num=scan.nextInt();
		scan.close();
		if(num==0||num==1)
		{
			isPrime=false;			
		}
		else
		{
			for(int i=2;i<=num/2;i++)
			{
			   if((num%i)==0)
			   {
			      isPrime=false;
			      break;
			   }
			}
		}
		
		
		if(isPrime)
		   System.out.println("Given "+num + " is a Prime Number");
		else
		   System.out.println("Given "+num + " is not a Prime Number");
	   }
}
