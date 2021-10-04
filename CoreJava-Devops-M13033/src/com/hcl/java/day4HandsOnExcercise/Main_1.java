package com.hcl.java.day4HandsOnExcercise;

import java.util.Scanner;

//-----------------------Shape (Abstract) class ---------------------------------------
abstract class Shape {

	private String name;

	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract float calculateArea();

}

//-----------------------Circle class ---------------------------------------
class Circle extends Shape {

	private int radius;
	final float pi = 3.14f;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	float calculateArea() {

		return pi * radius * radius;
	}

}

//-----------------------Square class ---------------------------------------
class Square extends Shape {

	private int side;

	public Square(String name, int side) {
		super(name);
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	float calculateArea() {

		return side * side;
	}

}

//-----------------------Rectangle class ---------------------------------------
class Rectangle extends Shape {

	private int length;
	private int breadth;

	public Rectangle(String name, int length, int breadth) {
		super(name);
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	float calculateArea() {

		return length * breadth;
	}

}

//-----------------------Main class ---------------------------------------
public class Main_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.err.println("Circle ");
		System.err.println("Square ");
		System.err.println("Rectangle ");

		System.out.println("Enter the shape name: ");
		String shapeName = scan.nextLine();

		if (shapeName.equals("Circle")) {
			System.out.println("Enter the radius: ");
			int radius = scan.nextInt();
			Circle c = new Circle("Circle", radius);

			System.out.println("Area of Circle is " + String.format("%.2f", c.calculateArea()));

		} else if (shapeName.equals("Square")) {
			System.out.println("Enter the side: ");
			int side = scan.nextInt();
			Square s = new Square("Square", side);

			System.out.println("Area of Square is " + String.format("%.2f", s.calculateArea()));

		} else {
			System.out.println("Enter the length and breadth: ");
			int length = scan.nextInt();
			int breadth = scan.nextInt();
			Rectangle r = new Rectangle("Rectangle", length, breadth);

			System.out.println("Area of Rectangle is " + String.format("%.2f", r.calculateArea()));
		}

		scan.close();
	}

}
