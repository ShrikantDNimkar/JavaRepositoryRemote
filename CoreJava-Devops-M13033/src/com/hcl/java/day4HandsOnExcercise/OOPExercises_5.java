package com.hcl.java.day4HandsOnExcercise;
/*Referencing from the example 4th (previous)*/
import com.hcl.java.day4HandsOnExcercise.FirstClass; /*Optional*/
import com.hcl.java.day4HandsOnExcercise.SecondClass; /*Optional*/
public class OOPExercises_5 {
	public static void main(String[] args) {
		FirstClass objA = new FirstClass();
		SecondClass objB = new SecondClass();
		System.out.println("in main(): ");
		System.out.println("objA.a = " + objA.getFirstClass());
		System.out.println("objB.b = " + objB.getSecondClass());
		objA.setFirstClass(222);
		objB.setSecondClass(333.33);
		System.out.println("objA.a = " + objA.getFirstClass());
		System.out.println("objB.b = " + objB.getSecondClass());
	}

}
