package com.aurionpro.test;

public class SwapperTwo {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		System.out.println("Entered numbers are " + number1 + " " + number2);

		number2 = number1 + number2;
		number1 = number2 - number1;
		number2 = number2 - number1;

		System.out.print("Swapped numbers are: " + number1 + " " + number2);
	}
}
