package com.hcl.java.objectclass;
class Complex{
	
	//declare variable/properties
	private double x;
	private double y;
	
	//constructor with parameters
	public Complex(double x,double y) {
		this.x=x;
		this.y=y;
	}
	//equals method
	public boolean equals(Object o) { // overriding from Object
		
		Complex c =(Complex) o;
		if(Double.compare(x, c.x) == 0 && Double.compare(y, c.y) == 0)
			return true;
		
		return false;
	}
	
}
public class MainequalsMethod {

	public static void main(String[] args) {
		Complex cObj1 = new Complex(10, 20);
		Complex cObj2 = new Complex(10, 20);
		
		//compare objects using equals() methods
		if (cObj1.equals(cObj2)){
			System.out.println("Equal");
			
		}else {
			System.out.println("Not Equal");
		}

	}

}
