package com.aurionpro.model;

public class Triangle extends Shape {
int base;
int height;


public Triangle(int base, int height) {
	super();
	this.base = base;
	this.height = height;
}


@Override
public void area() {
	System.out.println(0.5*base*height);
}


}
