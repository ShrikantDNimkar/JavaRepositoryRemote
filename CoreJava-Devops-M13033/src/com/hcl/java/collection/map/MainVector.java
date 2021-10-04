package com.hcl.java.collection.map;

import java.util.Vector;

public class MainVector {

	public static void main(String[] args) {
		Vector<Object> vectorObj = new Vector<>();
		vectorObj.add(1);
		vectorObj.add("James");
		vectorObj.add(51000.00);
		vectorObj.add("James");
		vectorObj.add(null);
		
		System.out.println("Vecor Elements :" + vectorObj);
	}

}
