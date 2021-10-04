package com.hcl.java.day5HandsOnExcercise;
import java.util.Scanner;

class CustomNegativeException extends Exception{
	public CustomNegativeException() {
		System.out.println("java.lang.Exception: n or p should not be negative. ");
	}
}

class CustomZeroException extends Exception{
	public CustomZeroException() {
		System.out.println("java.lang.Exception: n and p should not be zero. ");
	}
}

public class MyCalculator_3  {
	long power(int n, int p) throws CustomZeroException, CustomNegativeException  {		
		if(n < 0 || p<0) {
			throw new CustomNegativeException();
		}
		if(n == 0 || p == 0){
			throw new CustomZeroException();
		}
		long result=1;		
		for (int i = 0; i < p; i++) {
			result *= n;		
		}
		return result;
	}
	
	public static void main(String[] args) throws CustomZeroException, CustomNegativeException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Numbers : ");
		int n = scan.nextInt();
		int p = scan.nextInt();
		MyCalculator_3 myCal = new MyCalculator_3();
		System.out.println(myCal.power(n, p));		
	}
}
