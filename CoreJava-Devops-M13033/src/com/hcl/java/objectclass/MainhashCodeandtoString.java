 package com.hcl.java.objectclass;

class Employee11 /*=> by default have this=>*/ extends Object {
	private int employeeId;
	//private String employeeName="java";
	
	public Employee11(){
		employeeId =1020;
	}
	
	public int hashCode() {
		return employeeId;
	}
	
	public String toString() {
		return employeeId +"\t"/*employeeName*/;
	}  
	
}
public class MainhashCodeandtoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee11 empObj1=new Employee11();
		
		System.out.println(empObj1);
		
		String str = empObj1.toString();
		System.out.println(str);
		
		Employee11 empObj2 = new Employee11();
		System.out.println(empObj2);
		
		System.out.println(empObj1.hashCode());
		
	}

}
