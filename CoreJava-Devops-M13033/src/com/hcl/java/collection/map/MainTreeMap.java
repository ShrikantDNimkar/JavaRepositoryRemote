package com.hcl.java.collection.map;

import java.util.TreeMap;

public class MainTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Object, Object> treeMapObj = new TreeMap<>();
		
		treeMapObj.put(1021, "James");
		treeMapObj.put(1023, "Gavin");
		treeMapObj.put(1022, "Jhonson");
		treeMapObj.put(1020, 5400);
		//treeMapObj.put(null, 5400); // java.lang.NullPointerException	
		treeMapObj.put(2024, null);
		
		
		System.out.println("Tree aMap Elements: "+ treeMapObj);

	}

}
