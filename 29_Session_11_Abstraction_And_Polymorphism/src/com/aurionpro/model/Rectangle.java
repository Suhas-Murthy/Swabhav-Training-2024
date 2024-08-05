package com.aurionpro.model;

public class Rectangle extends Shape{
int length;
int breadth;


public Rectangle(int length, int breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}


@Override
void area() {
System.out.println("Area of Rectangle is : "+ (length * breadth));	
}

}
