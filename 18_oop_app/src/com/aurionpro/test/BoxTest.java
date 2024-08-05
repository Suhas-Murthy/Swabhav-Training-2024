package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Box;

public class BoxTest {

	public static void main(String[] args) {
		Box box1 = new Box();
		// Box box2 = new Box();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of width : ");
		int width = sc.nextInt();
		box1.setWidth(width);

		System.out.println("Enter the value of height : ");
		int height = sc.nextInt();
		box1.setHeight(height);

		System.out.println("Enter the value of depth : ");
		int depth = sc.nextInt();
		box1.setDepth(depth);

		System.out.println("Area of box1: " + box1.calculateArea());
		sc.close();
	}

}
