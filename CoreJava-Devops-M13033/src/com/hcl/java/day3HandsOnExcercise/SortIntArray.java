package com.hcl.java.day3HandsOnExcercise;
import java.util.Scanner;
public class SortIntArray {	
	static int[] sort(int[] arr) {	
		for(int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {				
					if(arr[i]>arr[j]) {
						arr[i]=arr[i]^arr[j];
						arr[j]=arr[i]^arr[j];
						arr[i]=arr[i]^arr[j];
				}
			}
		}				
		return arr;		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size= scan.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter the Inputs in Array: ");				
		for (int i=0;i<arr.length;i++) {
			arr[i]= scan.nextInt();		
		}		
		System.out.println("After Sorting in Ascending: ");
		int[] sortArray=sort(arr);
		for (int i = 0; i < sortArray.length; i++) {
            System.out.print(sortArray[i]+" ");
    }
		scan.close();
	}
}
