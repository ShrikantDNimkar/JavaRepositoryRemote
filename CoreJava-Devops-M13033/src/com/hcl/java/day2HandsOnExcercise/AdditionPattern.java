package com.hcl.java.day2HandsOnExcercise;
import java.util.Scanner;
import java.util.Arrays;
public class AdditionPattern {

	public static void main(String[] args) {
		System.out.println("Enter the size of input of Array:");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int num[]=new int[size];
		System.out.println("Enter the inputs in Array:");
		for(int i=0;i<size;i++)
		{
		    num[i]=scan.nextInt();
		}
		
		for(int i=1;i<=size;i++)
		{
		    addition(Arrays.copyOfRange(num, 0, i));
		}
		scan.close();
	}
	
	static void addition(int[] numbers)
    {
        int sum = 0;
        for(int num:numbers)
        {
            if(sum !=0){
                System.out.print("+");
            }
            sum+=num;
            System.out.print(num);
        }
        System.out.println("="+sum);
    }
}
