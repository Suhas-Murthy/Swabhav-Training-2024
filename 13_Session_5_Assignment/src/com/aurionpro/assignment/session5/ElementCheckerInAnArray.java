package com.aurionpro.assignment.session5;

import java.util.Scanner;

public class ElementCheckerInAnArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter length of an array: ");
		int length = sc.nextInt();
		
		int arrayOfNumbers[];
		arrayOfNumbers = new int[length];
		
		
		System.out.println("Enter input: ");
		
		for (int i = 0; i<length; i ++) {
			arrayOfNumbers[i] = sc.nextInt();
		}
		
		System.out.print("Array is ");
		for (int i = 0; i<length; i++) {
			System.out.print(arrayOfNumbers[i]+" ");		
		}
		System.out.println();
		
		System.out.print("Enter the element which is to be found: ");
		int findNumber = sc.nextInt();
		for (int i = 0; i<length; i++) {
			if (findNumber == arrayOfNumbers[i]) {
				System.out.println("Number "+ findNumber+" found at location "+ (i+1) + "th in the array [indexing from 1]");
			}
		}
		if (findNumber == 0) {
		System.out.println("Number not found");
		}
		
		
}}
