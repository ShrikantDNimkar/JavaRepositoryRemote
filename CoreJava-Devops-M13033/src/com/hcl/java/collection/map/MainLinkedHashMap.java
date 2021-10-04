package com.hcl.java.collection.map;
import java.util.LinkedHashMap;

public class MainLinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Object> lhMapObj = new LinkedHashMap<>();
		
		lhMapObj.put(1, "James");
		lhMapObj.put(2, 51000.00);
		lhMapObj.put(3, "Hyd");
		lhMapObj.put(4, 51000.00); // duplicate
		lhMapObj.put(5, null); // null at value position
		lhMapObj.put(null, 987654321L); // null at position
		
		
		System.out.println("Linked Hash Map Elements: "+lhMapObj);
		
	}

}
