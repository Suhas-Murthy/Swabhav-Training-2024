package com.aurionpro.model;

public class Circle implements Shape{
private int radius;
private double PI = 3.14;

	public Circle(int radius) {
	super();
	this.radius = radius;
}

	@Override
	public void area() {
		System.out.println("Radius of Circle is : "+(radius * radius * PI));
		
	}

}
