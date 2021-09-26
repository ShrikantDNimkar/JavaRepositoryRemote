package com.hcl.java.day1HandsOnExcercise;

public class InterationOfWordsInPattern {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=100;i++)
		{
			if(i%3 == 0)
				System.out.println(i+" : Fizz");
			if(i%5 == 0)
				System.out.println(i+" : Buzz");
			if(i%15 == 0)
				System.out.println(i+" : Fizz Buzz");
		}

	}

}
