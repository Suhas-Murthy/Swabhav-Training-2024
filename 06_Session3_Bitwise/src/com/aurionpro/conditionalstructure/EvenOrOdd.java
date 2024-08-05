package com.aurionpro.conditionalstructure;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to check if it is even or odd: ");
		int number = sc.nextInt();
		
		if (number%2 == 0)
			System.out.println(number+ " is an even number.");
		else
			System.out.println(number+ " is a odd number.");
	}
}
