package com.hcl.java.day5HandsOnExcercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleException_2 {

	public static void main(String[] args) throws InputMismatchException, ArithmeticException {

		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter Integer Value: ");
			int inputInt1 = scan.nextInt();
			int inputInt2 = scan.nextInt();
			int result = inputInt1 / inputInt2;
			System.out.println(result);

		} catch (ArithmeticException eA) {

			eA.printStackTrace();

		} catch (InputMismatchException eI) {
			eI.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\n Program is terminated normally by end of code.");
		scan.close();
	}

}
