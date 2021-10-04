package com.hcl.java.exceptionhandling;

import java.util.Scanner;

public class MainMultipleCatch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
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
		}catch(
		Exception exp2)
		{
			System.out.println("-----Exception-----");
			exp2.printStackTrace();

		}
		System.out.println("Copyrights@2021:hcl");
	}
	

}
