package com.hcl.java.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MainSetClasses {

	public static void main(String[] args) {
		
		HashSet<Object> hashSetObj = new HashSet<>();
		hashSetObj.add(1021);
		hashSetObj.add(null);
		hashSetObj.add("James");
		hashSetObj.add(51000.00);
		hashSetObj.add("James");
		hashSetObj.add(null);
		hashSetObj.add(null);
		// No duplication as well as o/p order is being followed. 
		System.out.println("Hash set Element: "+ hashSetObj);
		
		LinkedHashSet<Object> linkedHashSetObj = new LinkedHashSet<>();
		linkedHashSetObj.add(1021);
		linkedHashSetObj.add(null);
		linkedHashSetObj.add("James");
		linkedHashSetObj.add(51000.00);
		linkedHashSetObj.add("James");
		linkedHashSetObj.add(null);
		linkedHashSetObj.add(null);
		// No duplication but o/p order is being followed same by i/p. 
		System.out.println("Linked Hash set Element: "+ linkedHashSetObj);
		
		
		TreeSet<Object> treeSetObj = new TreeSet<>();
		treeSetObj.add("Jhonson");
		treeSetObj.add("James");
		treeSetObj.add("Gavin");
		treeSetObj.add("James");
//		treeSetObj.add(null);
//		treeSetObj.add(null);
		// No duplication but o/p order is being followed  by Ascending(here alphabetical order). 
		System.out.println("Tree Hash set Element: "+ treeSetObj);
		
	}

}
