package com.aurionpro.test;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number to get Factorial : ");
		int number = sc.nextInt();
		int factorial = findFactorial(number);
		if (factorial == -1) {
			System.out.println("Invalid Input");
			return;
		}
		System.out.println("Factorial of the number is " + findFactorial(number));
	}

	public static int findFactorial(int number) {
		if (number == 0) {
			return 1;
		}

		if (number < 0) {
			return -1;
		}

		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;

		}
		return factorial;
	}
}
