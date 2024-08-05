package com.aurionpro.test;

import com.aurionpro.model.CircleArea;

public class CircleTest {
	public static void main(String[] args) {
		

		
		CircleArea circle1 = new CircleArea(10);
		circle1.display();
//		circle1.initialize(3);
		System.out.println("Area of the Circle : "+circle1.areaCalculate());;
		
	}

}
