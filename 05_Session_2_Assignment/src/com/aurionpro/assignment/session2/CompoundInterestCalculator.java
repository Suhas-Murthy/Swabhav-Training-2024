package com.aurionpro.assignment.session2;

import java.util.Scanner;

public class CompoundInterestCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Principal Amount: ");
		int principalAmount = sc.nextInt();

		System.out.print("Enter the Rate of Interest: ");
		float rateOfInterest = sc.nextInt();

		System.out.print("Enter number of years: ");
		int numberOfYears = sc.nextInt();

		double compoundInterest = (principalAmount * Math.pow((1 + (rateOfInterest / 100)), numberOfYears))
				- principalAmount;

		System.out.println("Compound Interest : " + compoundInterest);
	}
}
