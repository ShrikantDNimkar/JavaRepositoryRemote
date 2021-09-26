package com.hcl.java.day2HandsOnExcercise;

class Cycle{ 
    String define_me(){
        return "a vehicle with pedals.";
    } 
} 

class Bike extends Cycle{
    String define_me(){
        return "a cycle with an engine."; 
    }
    Bike(){
        System.out.println("Hello I am a motorcycle, I am "+ this.define_me());
        String temp=super.define_me();
        System.out.println("My ancestor is a cycle who is "+ temp );
    } 
}

public class InheritenceExample_7 {

	public static void main(String[] args) {
		 Bike M=new Bike();

	}

}
