package com.aurionpro.model;

public class Circle extends Shape {
	int radius;
	final double PI = 3.14;

	@Override
	void area() {
		System.out.println("Radius of Circle is : "+(radius * radius * PI));

	}

}
