package com.hcl.java.collection.comparable;

import java.lang.Comparable;

public class Employee implements Comparable<Object>{
		
		private int employeeId;
		private String employeeName;
		private double salary;
		
		public Employee (int employeeId, String employeeName, double salary) {
			this.employeeId=employeeId;
			this.employeeName=employeeName;
			this.salary=salary;
		}

		public int getEmployeeId() {
			return employeeId;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public double getSalary() {
			return salary;
		}

		
		public int compareTo(Object o) {
			
			Employee e = (Employee) o;
			// compare employeeNames
			//int result = employeeName.compareTo(e.getEmployeeName());
			if(salary>e.getSalary())
				return 1;
			if (salary< e.getSalary())
				return -1;
			
			return 0;
		}

}


