package com.aurionpro.assignment.session2;

import java.util.Scanner;

public class AreaOfTrapezoidCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value of 1st base: ");
		int base1 = sc.nextInt();

		System.out.print("Enter value of 2nd base: ");
		int base2 = sc.nextInt();

		System.out.print("Enter value of height: ");
		int height = sc.nextInt();

		float areaOfTrapezoid = ((base1 + base2) * height) / 2;

		System.out.println("Area of Trapezoid : " + areaOfTrapezoid);
	}
}
