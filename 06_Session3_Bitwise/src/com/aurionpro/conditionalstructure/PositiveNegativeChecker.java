package com.aurionpro.conditionalstructure;
import java.util.Scanner;


public class PositiveNegativeChecker {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a number to check if it is positive or negative: ");
	int number = sc.nextInt();
	
	if (number > 0)
		System.out.println(number + " is a positive number.");
	else if (number < 0)
		System.out.println(number + " is a negative number.");
	else
		System.out.println(number + " is zero, neither positive nor negative.");
}
}
