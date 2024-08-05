package com.aurionpro.test;

import java.util.Scanner;

public class SimpleInterestCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal Amount: ");
		int principalAmt = sc.nextInt();

		System.out.print("Enter Rate of Interest: ");
		float rateOfInterest = sc.nextFloat();

		System.out.print("Enter no of years: ");
		int noOfYears = sc.nextInt();

		double simpleInterest = (principalAmt * rateOfInterest * noOfYears) / 100;
		System.out.println("Simple Interest: " + simpleInterest);
		sc.close();
	}
}
