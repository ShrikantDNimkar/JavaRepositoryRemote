package com.hcl.java.collection.map;

import java.util.Hashtable;

public class MainHashtable {

	public static void main(String[] args) {
		
		Hashtable<Object, Object> hashTableObj = new Hashtable<>();
		hashTableObj.put(1021, "James");
		hashTableObj.put(1023, "Gavin");
		hashTableObj.put(1, 9876543321L);
		//hashTableObj.put(1, null); // java.lang.NullPointerException -->at value position
		//hashTableObj.put(null, null); // java.lang.NullPointerException -->at key position
		hashTableObj.put('X',87468456L);
		System.out.println("Hash Table Elements: "+ hashTableObj);

	}

}
