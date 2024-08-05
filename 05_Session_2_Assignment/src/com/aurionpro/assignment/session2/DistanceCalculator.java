package com.aurionpro.assignment.session2;

import java.util.Scanner;

public class DistanceCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of 1st cordinate : ");

		System.out.print("Enter value of x1 : ");
		int x1 = sc.nextInt();

		System.out.print("Enter value of y1 : ");
		int y1 = sc.nextInt();

		System.out.println("Enter values of 2nd cordinate : ");

		System.out.print("Enter value of x2 : ");
		int x2 = sc.nextInt();

		System.out.print("Enter value of y2 : ");
		int y2 = sc.nextInt();
		
		int x = x2 - x1;
		int y = y2 - y1;
		double distanceBetweenPoints = Math.sqrt((x*x)+(y*y));
		
		System.out.println("Distance between the cordinates ("+ x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") : " + distanceBetweenPoints);

	}
}
