package com.aurionpro.model;

import java.util.Scanner;

public class DebuggerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int number1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int number2 = sc.nextInt();

		int result = addition(number1, number2);
		System.out.println("Sum : " + result);
		int result1 = subtraction(number1, number2);
		System.out.println("Sum : " + result1);
		int result2 = multiplication(number1, number2);
		System.out.println("Sum : " + result2);
		int result3 = division(number1, number2);
		System.out.println("Sum : " + result3);
	}

	private static int division(int number1, int number2) {
		return number1 / number2;
	}

	private static int multiplication(int number1, int number2) {
		return number1 * number2;
	}

	private static int subtraction(int number1, int number2) {
		return number1 - number2;
	}

	private static int addition(int number1, int number2) {
		return number1 + number2;

	}
}
