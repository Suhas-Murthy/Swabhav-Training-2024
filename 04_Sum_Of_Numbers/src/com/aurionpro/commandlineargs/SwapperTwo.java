package com.aurionpro.commandlineargs;

public class SwapperTwo {
	public static void main(String[] args) {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		System.out.println("Entered numbers are " + number1 + " & " + number2);

		number2 = number1 + number2;
		number1 = number2 - number1;
		number2 = number2 - number1;

		System.out.println("Swapped numbers are " + number1 + " & " + number2);

	}
}
