package com.hcl.java.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainSortingUsingComparable {

	public static void main(String[] args) {

		Employee empObj1 = new Employee(1021, "James", 51000.00);
		Employee empObj2 = new Employee(1022, "Gavin", 53000.00);
		Employee empObj3 = new Employee(1023, "Jhonson", 52000.00);

		ArrayList<Employee> employeeList = new ArrayList<>();

		employeeList.add(empObj1);
		employeeList.add(empObj2);
		employeeList.add(empObj3);

		// System.out.println(employeeList);

		System.out.println("----Before Sorting----");
		for (Employee empObj : employeeList) {
			System.out.println(empObj.getEmployeeId() + "\t" + empObj.getEmployeeName() + "\t" + empObj.getSalary());
		}

		Collections.sort(employeeList); //sorting

		System.out.println("----After Sorting----");
		for (Employee empObj : employeeList) {
			System.out.println(empObj.getEmployeeId() + "\t" + empObj.getEmployeeName() + "\t" + empObj.getSalary());
		}

	}

}
