package com.hcl.java.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainArrayListandLinkedList {

	public static void main(String[] args) {
		
		ArrayList<Object> alObj =new ArrayList<>();
		alObj.add(0,1021);
		alObj.add(1, "James");		
		alObj.add(2, null);
		
		alObj.add(3, "James");
		alObj.add(4, null);
		alObj.add(5, null);
		alObj.add(6, 51000.00);
		System.out.println("Array List Element Object :" + alObj);
		
		LinkedList<Object> llObj =new LinkedList<>();
		llObj.add(0,1021);
		
		llObj.add(1, "James");
		llObj.add(2, 51000.00);
		llObj.add(3, null);
		llObj.add(4, "James");
		llObj.add(5, null);
		llObj.add(6, null);
		 
		
		System.out.println("Linked List Element Object :" + llObj);
		
		
	}

}
