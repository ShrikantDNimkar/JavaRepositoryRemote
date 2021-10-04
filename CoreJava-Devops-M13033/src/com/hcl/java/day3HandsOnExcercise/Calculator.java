package com.hcl.java.day3HandsOnExcercise;
import com.hcl.java.day2HandsOnExcercise.AddForDay3PackageProgram;
public class Calculator extends AddForDay3PackageProgram{

	protected int add(int a, int b){
		System.out.println("I am called from pakage: day3HandsOnExcercise");
		return a+b; 
	   }
	public static void main(String[] args) {
		Calculator cal =new Calculator();
		System.out.println(cal.add(4, 3));
		}
}
