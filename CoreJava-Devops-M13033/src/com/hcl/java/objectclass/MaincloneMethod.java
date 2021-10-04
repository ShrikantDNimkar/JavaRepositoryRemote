package com.hcl.java.objectclass;

class Student implements Cloneable{
	
	int studentId;
	String studentName;
	public Student(int studentId,String studentName) {
		
		this.studentId =studentId;
		this.studentName =studentName;
	}
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}

public class MaincloneMethod {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student studObj1 = new Student(1, "James");
		Student studObj2 = (Student) studObj1.clone();
		
		System.out.println(studObj1.studentId+"	\t"+studObj1.studentName);
		System.out.println(studObj2.studentId+"	\t"+studObj2.studentName);
		

	}

}
