package com.aurionpro.assignment.session2;

import java.util.Scanner;

public class MinutesToHoursAndMinutesCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter time in minutes: ");
		int totalMinutes = sc.nextInt();
		int hours = totalMinutes / 60;
		int remainingMinutes = totalMinutes % 60;

		System.out.print(totalMinutes + " minutes is equal to " + hours + " hours and " + remainingMinutes + " minutes.");

	}
}
