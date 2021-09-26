package com.hcl.java.day2HandsOnExcercise;
import java.util.Scanner;
public class SmallestAmong {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Three Numbers:");
		int v1= scan.nextInt();
		int v2= scan.nextInt();
		int v3= scan.nextInt();
		scan.close();
		
		if(v1<v2 && v1<v3)
		{
			System.out.println(v1+" is smallest among the number.");
		}
		else if(v2<v1 && v2<v3)
		{
			System.out.println(v2+" is smallest among the number.");
		}
		else if(v3<v2 && v3<v1)
		{
			System.out.println(v3+" is smallest among the number.");
		}
		else 
			System.out.println("All are same numbers.");
			

	}

}
