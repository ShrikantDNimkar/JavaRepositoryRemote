package com.hcl.java.collection.comparator;

import java.util.Comparator;

public class ManagerSalarySort implements Comparator<Manager>{
	

	@Override
	public int compare(Manager e1, Manager e2) {
		if(e1.getSalary()>e2.getSalary())
			return 1;
		if (e1.getSalary()< e2.getSalary())
			return -1;
		
		return 0;
	}
}
