package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Shape;
import com.aurionpro.model.Triangle;

public class ShapeTest {
	public static void main(String[] args) {
		
		Shape shape;
		shape = new Rectangle(2, 2);
		shape.area();
		shape = new Circle(2);
		shape.area();
		shape = new Triangle(2, 2);
		shape.area();
	}
}
