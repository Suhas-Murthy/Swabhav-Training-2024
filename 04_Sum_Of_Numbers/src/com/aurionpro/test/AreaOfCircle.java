package com.aurionpro.test;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		final double pi = 3.14; // constant pi ---> use final

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius of the Circle: ");
		int radius = sc.nextInt();

		System.out.println("Area of Circle : " + pi * radius * radius);
		sc.close();
	}
}
