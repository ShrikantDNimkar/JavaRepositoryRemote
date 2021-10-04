package com.hcl.java.exceptionhandling;

import java.util.Scanner;

public class MainExceptionHandling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter X value:");
		int x = scan.nextInt();

		System.out.println("Enter Y value:");
		int y = scan.nextInt();

		try {
			int result = x / y;
			System.out.println("Result: " + result);
		} catch (ArithmeticException exp) {
			// System.err.println(exp);

			// System.out.println(exp.getMessage());
			// System.out.println(exp.getStackTrace());
			try {
				StringBuilder username = new StringBuilder("James");
				char c = username.charAt(6);
				System.out.println(c);
			} catch (Exception exp1) {
				exp1.printStackTrace();
			}
			exp.printStackTrace();

			try {
				String password = null;
				int ln = password.length();
				System.out.println(ln);
			} catch (Exception exp2) {
				System.out.println(exp2);
			}
			System.exit(0);
		} finally {
			// Use 1=> to close the objects or to close the file or to close the database
			// connection or clean up of resource leak
			scan.close();
			// Use 2: finally block statement is always executed whether exception is
			// handled or not
			System.out.println("Copyrights@2021:hcl");
			//Rule -1 : finally block follows either try block or catch block then afterwards no one follows finally block of statements of either try block or catch block except new one. 
			
			try {
				int num =1/0;
				System.out.println("num :"+num);
			} finally {
				System.out.println("Success");
			}
		}

	}

}
