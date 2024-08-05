package com.aurionpro.assignment.session5;

import java.util.Scanner;

public class ArrayElementsSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of an array: ");
		int length = sc.nextInt();
		int arrayOfNumbers[];
		arrayOfNumbers = new int[length];
		int sum = 0;
		
		System.out.println("Enter input: ");
		
		for (int i = 0; i < length; i++) {
			int input = sc.nextInt();
			arrayOfNumbers[i] = input;
		}
		System.out.print("Array of length "+ length +" is [ ");
		for (int i = 0; i < length; i++) {
			System.out.print(arrayOfNumbers[i]+" ");
		}
		System.out.print("]");
		System.out.println();
		for (int i = 0; i < length; i++) {
			sum += arrayOfNumbers[i];
		}
		System.out.println("Sum of the Array is : "+ sum);
		

		sc.close();
	}
}
