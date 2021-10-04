package com.hcl.java.collection.comparator;

import java.util.Comparator;

public class ManagerNameSort implements Comparator<Manager>{
	
	@Override
	public int compare(Manager e1, Manager e2) {
		
		int result = e1.getEmployeeName().compareTo(e2.getEmployeeName());
		
		return result;
	}

}
