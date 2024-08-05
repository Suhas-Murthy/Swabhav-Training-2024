package com.aurionpro.array;

import java.util.Scanner;

public class EvenNumberPrinterArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
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
//	int updated[] = new int[]; 
	int count = 0;
	System.out.print("Even numbers: " );
	for (int i = 0; i< length; i++) {
		
		if(arrayOfNumbers[i] % 2 == 0) {
			System.out.print( arrayOfNumbers[i] + " ");
			count++;
		}
	}System.out.println();
	System.out.println("Count: " + count);
}
}
