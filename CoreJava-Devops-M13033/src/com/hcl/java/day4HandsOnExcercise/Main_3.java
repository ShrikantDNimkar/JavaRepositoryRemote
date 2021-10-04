package com.hcl.java.day4HandsOnExcercise;

import java.util.Scanner;
import java.util.StringTokenizer;

//-----------------------Card (Abstract) class ---------------------------------------
abstract class Card {

	protected String holderName;
	protected String cardNumber;
	protected String expiryDate;

	public Card() {

	}

	public Card(String holderName, String cardNumber, String expiryDate) {
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

}

//-----------------------MembershipCard class ---------------------------------------
class MembershipCard extends Card {

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public MembershipCard(String holderName, String cardNumber, String expiryDate, int rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}

	private int rating;

}

//-----------------------PaybackCard class ---------------------------------------
class PaybackCard extends Card {

	public int getPointsEarned() {
		return pointsEarned;
	}

	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public PaybackCard(String holderName, String cardNumber, String expiryDate, int pointsEarned, double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}

	private int pointsEarned;
	private double totalAmount;

}

//-----------------------Main_3 class ---------------------------------------

public class Main_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 

		System.out.println("Select the Card \r\n" + " 1.Payback Card \r\n" + " 2.Membership Card \r\n" + " ");

		System.out.println("Enter a choice number:");
		int choice = scan.nextInt();

		switch (choice) {
		case 1:
			PaybackCard pc= new PaybackCard(null, null, null, 0, 0);	
			System.out.println("Enter the Card Details :");
			System.out.println("Name|Card number|Expiry Date");
			String garbage1=scan.nextLine();
			String details1= scan.nextLine();
			
			StringTokenizer strToken1=new  StringTokenizer(details1, "|");
			pc.setHolderName((String)strToken1.nextElement());
			pc.setCardNumber((String)strToken1.nextElement());
			pc.setExpiryDate((String)strToken1.nextElement());
			System.out.println("Enter points in card: ");
			pc.setPointsEarned(scan.nextInt());
			System.out.println("Enter Amount in card: ");
			pc.setTotalAmount(scan.nextDouble());
			System.out.println();
			System.out.println(pc.getHolderName()+ "'s MembershipCard details:");
			System.out.println(" Card Number: "+pc.getCardNumber());
			System.out.println(" Expiry date: "+pc.getExpiryDate());
			System.out.println(" Points Earned: "+pc.getPointsEarned());
			System.out.println(" Points Earned: "+pc.getTotalAmount());
			
			break;

		case 2:
			MembershipCard	mc= new MembershipCard(null, null, null, 0);		
			System.out.println("Enter the Card Details :");
			System.out.println("Name|Card number|Expiry Date");
			String garbage2=scan.nextLine();
			String details2= scan.nextLine();
			StringTokenizer strToken2=new  StringTokenizer(details2, "|");
			mc.setHolderName((String)strToken2.nextElement());
			mc.setCardNumber((String)strToken2.nextElement());
			mc.setExpiryDate((String)strToken2.nextElement());
			System.out.println("Enter points in card ");
			mc.setRating(scan.nextInt());
			System.out.println();
			System.out.println(mc.getHolderName()+ "'s MembershipCard details:");
			System.out.println(" Card Number: "+mc.getCardNumber());
			System.out.println(" Expiry date: "+mc.getExpiryDate());
			System.out.println(" Points Earned: "+mc.getRating());
						
			break;

		default:
			System.out.println("Please a enter valid choice");;
		}

		scan.close();
	}

}
