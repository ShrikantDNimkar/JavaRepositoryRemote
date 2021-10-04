package com.hcl.java.day4HandsOnExcercise;

import java.util.Scanner;

interface AdvancedArithmetic {
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
	public int divisor_sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyCalculator cal = new MyCalculator();
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		System.out.println("I implemented: AdvancedArithmetic");
		System.out.println(cal.divisor_sum(num));
		scan.close();
	}
}
