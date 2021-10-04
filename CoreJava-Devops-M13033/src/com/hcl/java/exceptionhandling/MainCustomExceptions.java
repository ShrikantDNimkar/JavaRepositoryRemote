package com.hcl.java.exceptionhandling;

import java.util.Scanner;

class HCLException extends Exception {
	
	public HCLException() {
		System.out.println("Please enter non zero values for Y");
	}
}

class HCLExceptionSubClass extends HCLException{
	public void exceptionDetails() throws HCLException	 {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter X value:");
		int x = scan.nextInt();

		System.out.println("Enter Y value:");
		int y = scan.nextInt();
		
			int result = x / y;
			
			if(y==0) {
				throw new HCLException();
			}
			else
			{
				System.err.println();
			}
	}
}

public class MainCustomExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner scan = new Scanner(System.in);
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter X value:");
		int x = scan.nextInt();

		System.out.println("Enter Y value:");
		int y = scan.nextInt();
		
		try
		{
			int result = x / y;
			System.out.println("Result: " + result);
		}catch(
		ArithmeticException exp1)
		{
			System.out.println("-----Arithemetic Exception-----");
			exp1.printStackTrace();
			
			//please enter non zero values for y values
		}
		System.out.println("Copyrights@2021:hcl");
		scan.close();
	}

}
