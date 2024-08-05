package com.aurionpro.assignment.session2;

import java.util.Scanner;

public class BodyMassIndexCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your Weight in kilograms: ");
		float weight = sc.nextFloat();

		System.out.print("Enter your Height in meters: ");
		float height = sc.nextFloat();

		double bodyMassIndex = weight / (height * height);

		System.out.println("Your Body Mass Index (BMI) : " + bodyMassIndex);
	}
}
