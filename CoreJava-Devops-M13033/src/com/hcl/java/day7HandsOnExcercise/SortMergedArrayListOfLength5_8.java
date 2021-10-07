package com.hcl.java.day7HandsOnExcercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortMergedArrayListOfLength5_8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> alObj1 = new ArrayList<>();
		ArrayList<Integer> alObj2 = new ArrayList<>();
		ArrayList<Integer> alObj3 = new ArrayList<>();
		// ArrayList 1
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter the Integer in list 1 of position of " 
																+ i + " => ");
			alObj1.add(scan.nextInt());
		}
		System.out.println();
		// ArrayList 2
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter the Integer in list 2 of position of "
																+ i + " => ");
			alObj2.add(scan.nextInt());
		}

		System.out.println("\nAfter merging and sorting the arraylist :");
		alObj1.addAll(alObj2);
		Collections.sort(alObj1);

		for (Integer num : alObj1) {
			System.out.println(num);
		}
		System.out.println("\nFetching the elements at 2nd, 6th and 8th index "
				+ "into a new arrayList and return the final ArrayList:");
		alObj3.add(alObj1.get(2));
		alObj3.add(alObj1.get(6));
		alObj3.add(alObj1.get(8));
		
		for (Integer num : alObj3) {
			System.out.println(num);
		}
		scan.close();
	}

}
