package com.hcl.java.day1HandsOnExcercise;
import java.util.Scanner;

public class UserMainCode_9 {

	static int sumOfSquaresOfEvenDigit(int num)
	{
		int result =0,temp;
		while (num>0)
		{
			temp=num%10;
			num/=10;
			if(temp%2==0)
				result+=temp*temp;
			else
				continue;				
		}
		return result;
	}
	
	public static void main(String[] args) {
					
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the Number: ");
			int num= scan.nextInt();
			scan.close();
			if(num>0) 
			{ 
				System.out.println("Sum of Squares Of Even Digit of "+num 
						+ " is " + sumOfSquaresOfEvenDigit(num));
			}
			else		
				System.out.println("Please enter positive number only.");
		}
	}

