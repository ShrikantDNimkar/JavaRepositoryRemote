package com.hcl.java.fundamentals;

public class LoopingStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----while loop----");
		// initialize the value
		int i=1;
		while(i<=5)
		{
			//result
			System.out.println("Value: "+i);
			//increment/decrement
			i++;
		} 
		
		System.out.println();
		System.out.println("----do while loop----");
		// initialization
		int x=1;
		do {
			System.out.println("Value: "+x);
			x++;
		}while(x<=5);
		
		System.out.println();
		System.out.println("----for loop----");
		for(int y=1;y<=5;y++) 
		{
			System.out.println("Value: "+y);
		}
		System.out.println("\n");
		for(int y=1;y<=5;y++) 
		{
			System.out.println("Value: "+y);
			if(y>2) 
				continue;
			System.out.println("This line will be printed when'continue' not excuted");
		}

	}
}	
