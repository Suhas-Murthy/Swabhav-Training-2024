package com.aurionpro.assignment.session2;

import java.util.Scanner;

public class ProofOfConceptArithmeticOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 1st number : ");
		float number1 = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		float number2 = sc.nextInt();

		System.out.println("Addition of " + number1 + " and " + number2 + " : " + (number1 + number2));
		System.out.println("Subtraction of " + number1 + " and " + number2 + " : " + (number1 - number2));
		System.out.println("Multiplication of " + number1 + " and " + number2 + " : " + (number1 * number2));
		System.out.println("Division of " + number1 + " and " + number2 + " : " + (number1 / number2));
		System.out.println("Modulas of " + number1 + " and " + number2 + " : " + (number1 % number2));

	}
}
