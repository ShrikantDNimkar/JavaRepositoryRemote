package com.hcl.java.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.hcl.java.day2HandsOnExcercise.Room;

public class MainArrayList {

	public static void main(String[] args) {
		// Q: How to create object of ArrayList class?
		// Syntax: classname<generic> ref = new classname<>();
		// Ex: ArrayList<Object> alObj = new ArrayList<Object>();
		// Ex: ArrayList<Object> alObj = new ArrayList<>(); from java 7
		// Ex: ArrayList<WrapperClassess> alObj = new ArrayList<>();
		// Ex: ArrayList<Integer> alObj = new ArrayList<>();
		// Ex: ArrayList<Character> alObj = new ArrayList<>();

		// Ex: ArrayList<UserDefinedClass> alObj = new ArrayList<>();
		// Ex: ArrayList<Employee> alObj = new ArrayList<>();
		// Ex: ArrayList<Bank> alObj = new ArrayList<>();
		// Ex: ArrayList<Student> alObj = new ArrayList<>();

		// step 1: create an object of ArrayList
		ArrayList<Object> alObj = new ArrayList<>();
		// Step 2
		// Q: How to add (insert) elements to Arraylist
		// Ans: using add() method
		alObj.add(0, 1);
		alObj.add(1, "James");
		alObj.add(2, 51000.00);

		// Q: How to get or select or fetch or display the element from arraylist
		// step 3
		System.out.println(alObj);
		System.out.println(alObj.get(1));

		System.out.println("-----Serching------");
		boolean searchResult = alObj.contains("james");
		if (searchResult == true) {
			System.out.println("The element is exist");
		} else {
			System.out.println("The element is not exist");
		}

		System.out.println("-------iterator: iterate the object or display-------");
		// alObj.iterator();
		System.err.println(alObj.iterator());
		Iterator<Object> itrObj = alObj.iterator();
		while (itrObj.hasNext()) {
			System.out.println(itrObj.next());
		}

		int sizeOfList = alObj.size();
		System.out.println("Size " + sizeOfList);
		System.out.println("----Delete----");
		Object removeObj = alObj.remove(1);
		System.out.println("Remove element " + removeObj);

		System.out.println("----Size----");
		List<Object> subListObj = alObj.subList(0, 1);
		System.out.println("Sub Last:" + subListObj);

		// 1st ArrayList
		ArrayList<Object> list1 = new ArrayList<>();
		list1.add(0, 1021);
		list1.add(1, "Raj");
		list1.add(2, 51000.00);

		// 2nd ArrayList
		ArrayList<Object> list2 = new ArrayList<>();
		list2.add(0, 1022);
		list2.add(1, "Ef Codd");
		list2.add(2, 52000.00);
		
		list1.addAll(list2);
		
		System.out.println("First List : "+list1);
		System.out.println("Second List : "+list2);
	}

}
