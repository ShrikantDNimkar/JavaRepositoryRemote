package com.hcl.java.fundamentals;

public class Operators {
	
	public static void main(String[] args) {
		
		//declare variables(properties) and initialize
		int value1=10;
		int value2=20;
		
		System.out.println("-----------------------");
		System.out.println("Arithematic operator");
		System.out.println("-----------------------");
		
		//Arithmetic Operators
		int addResult= value1+value2;
		int subResult= value1-value2;
		int mulResult= value1*value2;
		int divResult= value1/value2;
		int modResult= value1%value2;
		
		//display the result
		System.out.println("Add: "+ addResult);
		System.out.println("Substraction: "+ subResult);
		System.out.println("Multiplication: "+ mulResult);
		System.out.println("Division: "+ divResult);
		System.out.println("Modulus: "+ modResult);
		
		System.out.println("\n");
		System.out.println("-----------------------");
		System.out.println("Incrementor and Decrementor operator");
		System.out.println("-----------------------");
		
		int preInc=++value1;
		System.out.println("Pre Increment: " + preInc);
		System.out.println("Value1: "+value1);
		
		int postInc=value1++;
		System.out.println("Post Increment: " + postInc);
		System.out.println("Value1: "+value1);
				
		int preDec=--value2;
		System.out.println("Pre Decrement: " + preDec);
		System.out.println("Value1: "+value2);
		
		int postDec=value2--;
		System.out.println("Post Decrement: " + postDec);
		System.out.println("Value1: "+value2);
		
		System.out.println("\n");
		System.out.println("-----------------------");
		System.out.println("Relational operator");
		System.out.println("-----------------------");
		
		// boolean result=(value1>=value2);
		
		System.out.println("<: "+(value1<value2));
		System.out.println("<=: "+(value1<=value2));
		System.out.println(">: "+(value1>value2));
		System.out.println(">=: "+(value1>=value2));
		System.out.println("==: "+(value1==value2));
		System.out.println("!=: "+(value1!=value2));
		System.out.println();
		System.out.println();
	}

}
