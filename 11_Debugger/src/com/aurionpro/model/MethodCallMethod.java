package com.aurionpro.model;

import java.util.Scanner;


public class MethodCallMethod {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter First Number : ");
	int number1 = sc.nextInt();
	System.out.println("Enter Second Number : ");
	int number2 = sc.nextInt();
	int result3 = division(number1, number2);
	System.out.println("Sum : " + result3);
	int result2 = multiplication(number1, number2);
	System.out.println("Sum : " + result2);
	
	
}
private static int division(int number1, int number2) {
	int result = addition(number1, number2);
	int result1 = subtraction(result,number2);
	return result1 / number2;
}

private static int multiplication(int number1, int number2) {
	int result = addition(number1, number2);
	return result * number2;
}

private static int subtraction(int number1, int number2) {
	return number1 - number2;
}

private static int addition(int number1, int number2) {
	return number1 + number2;

}
}
