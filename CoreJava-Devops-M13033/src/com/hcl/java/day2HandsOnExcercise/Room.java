package com.hcl.java.day2HandsOnExcercise;

public class Room {

	int roomNo;
	char roomType;
	float roomArea; //meter square
	String ACMachine;
	
	Room() {
		roomNo =-1;
		roomType = '\0';
		roomArea=-1;
		ACMachine=null;
	}
	void SetData(int roomNo, char roomType, float roomArea, String ACMachine) {
		this.roomNo =roomNo;
		this.roomType = roomType;
		this.roomArea= roomArea;
		this.ACMachine= ACMachine;
	}	
	void DisplayData() {
		System.out.println("Room Number: "+roomNo);
		System.out.println("Room Type: "+roomType);
		System.out.println("Room Area: "+roomArea);
		System.out.println("AC Machine: "+ACMachine);		
	}
	public static void main(String[] args) {
	
		Room r1=new Room();
		r1.SetData(1, 'A', 65.4f, "Voltas");
		r1.DisplayData();
	}
}
