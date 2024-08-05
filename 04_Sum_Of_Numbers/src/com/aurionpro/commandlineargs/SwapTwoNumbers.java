package com.aurionpro.commandlineargs;

public class SwapTwoNumbers {
public static void main(String[] args) {
	int number1 = Integer.parseInt(args[0]);
	int number2 = Integer.parseInt(args[1]);
	System.out.println("Entered numbers are "+number1 +" & " + number2);
	int temp = number1;
	number1 = number2; 
	number2 = temp;
	
	System.out.println("Swapped numbers are "+number1 +" & " + number2);
}
}
