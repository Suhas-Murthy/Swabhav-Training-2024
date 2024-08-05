package com.aurionpro.assignment.session5;

import java.util.Scanner;

public class MaxOfArray {
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
	
	int max = 0;
	
	for (int i = 0; i<length; i++) {
		if (arrayOfNumbers[i]>max) {
			max = arrayOfNumbers[i];
		}
	}
	System.out.println("Max from Array is "+ max);
	
	
}
}
