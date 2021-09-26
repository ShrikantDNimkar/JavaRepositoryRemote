package com.hcl.java.day1HandsOnExcercise;

import java.util.Scanner;

public class SwapValues {

	public static void main(String[] args) {
		
		int v1,v2;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\n Enter the first no. : ");
		v1= scan.nextInt();
		System.out.print("\n Enter the second no. : ");
		v2= scan.nextInt();
		
		System.out.print("\nBefore swapping no. " );
		System.out.println("v1 = "+ v1 + ", v2 = " +v2);
		
		v1=v1^v2;
		v2=v1^v2;
		v1=v1^v2;
		
		System.out.print("\nAfter swapping no. " );
		System.out.println("v1 = "+ v1 + ", v2 = " +v2);
		scan.close();		

	}

}
