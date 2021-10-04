package com.hcl.java.day5HandsOnExcercise;
import java.util.Scanner;

class CustomException  extends Exception{
	public CustomException () {
		System.out.println("CustomException: InvalidAgeRangeException ");
	}
}

public class PlayerException_4 {
	
	public static void main(String[] args) throws CustomException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the player name : ");
		String name = scan.nextLine();
		System.out.println("Enter the player age : ");
		int age = scan.nextInt();
		
		if(age<19) {
			throw new CustomException();
		}
		else {	
			System.out.println("Player name : "+ name);
			System.out.println("Player age :  "+ age);
		}

		
	}

}
