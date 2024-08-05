package com.aurionpro.conditionalstructure;

import java.util.Scanner;

public class MaxMinOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number1 = sc.nextInt();
		int number2 = sc.nextInt();

		if (number1 > number2)
			System.out.println(number1 + " is greater than " + number2);
		else
			System.out.println(number2 + " is greater than " + number1);
	}
}
