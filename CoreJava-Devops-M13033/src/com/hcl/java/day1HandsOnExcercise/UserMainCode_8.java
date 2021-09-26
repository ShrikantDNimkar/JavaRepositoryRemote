package com.hcl.java.day1HandsOnExcercise;
import java.util.Scanner;

public class UserMainCode_8 {

	static int checkSum(int num)
	{
		int result =0;
		while (num>0)
		{
			result+=num%10;
			num/=10;
		}
		return (result%2==0)?-1:1;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num= scan.nextInt();
		scan.close();
		if(num>0) 
		{

			if (checkSum(num) == 1) 
				System.out.println("Sum of odd digits is odd.");
			else 
				System.out.println("Sum of odd digits is even.");
		}
		else		
			System.out.println("Please enter positive number only.");

	}

}
