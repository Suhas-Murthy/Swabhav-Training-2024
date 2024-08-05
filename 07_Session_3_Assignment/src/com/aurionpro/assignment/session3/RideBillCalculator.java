package com.aurionpro.assignment.session3;

import java.util.Scanner;

public class RideBillCalculator {

	public static void WantPhotos(int amount) {
		System.out.println("Do you want photos? For Yes enter -> '1' and For No enter -> '0' ");
		Scanner sc = new Scanner(System.in);
		int wantphotos = sc.nextInt();
		int finalAmount = 0;
		if (wantphotos == 1) {
			finalAmount = amount + 3;
			System.out.println("Your Ride Bill is $" + (finalAmount));
		} else {
			finalAmount = amount + 0;
			System.out.println("Your Ride Bill is $" + finalAmount);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Height : ");
		int height = sc.nextInt();
		int amount = 0;

		if (height > 120) {
			System.out.println("You Can Ride");

			System.out.print("Enter your age: ");
			int age = sc.nextInt();

			if (age < 12) {
				amount = 5;
				WantPhotos(amount);
			} else if (age >= 12 && age <= 18) {
				amount = 7;
				WantPhotos(amount);
			} else if (age > 18 && age < 45) {
				amount = 12;
				WantPhotos(amount);
			} else if (age >= 45 && age <= 55) {
				amount = 0;
				WantPhotos(amount);
			} else {
				System.out.println("You cannot Ride");
			}
		} else {
			System.out.println("Cannot Ride");
		}
	}
}
