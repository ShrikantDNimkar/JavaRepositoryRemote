package com.hcl.java.day3HandsOnExcercise;

import java.util.Scanner;

public class SearchAnElementInArray {

	public static void main(String[] args) {
		boolean found=false;
		int i,j;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size= scan.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter the Inputs in Array: ");				
		for (j=0;j<arr.length;j++) {
			arr[j]= scan.nextInt();		
		}		
		System.out.print("Enter the element to be searched in Array: ");
		int element= scan.nextInt();
		System.out.println("Searching: ");
		
		
		for (i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
            	found=true;
            	break;
            }            
    }
		if(found == true) {
        	System.out.println("Element is found at index of "+ i + " in array." );
        	
        }else {
        	System.out.println("Given element is not found." );
        }
		scan.close();
	}

}
