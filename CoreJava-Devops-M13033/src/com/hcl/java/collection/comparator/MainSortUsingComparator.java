package com.hcl.java.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;


public class MainSortUsingComparator {

	public static void main(String[] args) {

		Manager empObj1 = new Manager(1021, "James", 51000.00);
		Manager empObj2 = new Manager(1022, "Gavin", 53000.00);
		Manager empObj3 = new Manager(1023, "Jhonson", 52000.00);

		ArrayList<Manager> employeeList = new ArrayList<>();

		employeeList.add(empObj1);
		employeeList.add(empObj2);
		employeeList.add(empObj3);

		// System.out.println(employeeList);

		System.out.println("----Before Sorting----");
		for (Manager empObj : employeeList) {
			System.out.println(empObj.getEmployeeId() + "\t" + empObj.getEmployeeName() + "\t" + empObj.getSalary());
		}

		
		// Name Sort
		ManagerNameSort empNameSortObj = new ManagerNameSort();
		Collections.sort(employeeList, empNameSortObj);
		System.out.println("----Name Sorting----");
		for (Manager empObj : employeeList) {
			System.out.println(empObj.getEmployeeId() + "\t" + empObj.getEmployeeName() + "\t" + empObj.getSalary());
		}

		// Salary Sort
		ManagerSalarySort empSalarySortObj = new ManagerSalarySort();
		Collections.sort(employeeList, empSalarySortObj);
		System.out.println("----Salary Sorting----");
		for (Manager empObj : employeeList) {
			System.out.println(empObj.getEmployeeId() + "\t" + empObj.getEmployeeName() + "\t" + empObj.getSalary());
		}

	}

}
