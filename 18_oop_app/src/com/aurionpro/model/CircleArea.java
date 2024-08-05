package com.aurionpro.model;

public class CircleArea {
	double radius;

	public CircleArea(int r) {
		this.radius = r;

	}

	public void initialize(int r) {
		this.radius = r;
	}

	public void display() {
		System.out.println("Radius of the Circle is: " + radius);
	}

	public double areaCalculate() {
		double area = 3.14 * this.radius * this.radius;
		return area;
	}
}
