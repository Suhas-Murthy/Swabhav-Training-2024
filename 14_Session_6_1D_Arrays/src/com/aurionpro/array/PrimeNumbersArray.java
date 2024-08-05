package com.aurionpro.array;

import java.util.Scanner;

public class PrimeNumbersArray {
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
		
		for (int i = 0; i < length; i++) {
			int j = 2;
			int count = 0;
			while (j <= arrayOfNumbers[i]) {
				if (arrayOfNumbers[i] % j == 0) {
//					System.out.println(arrayOfNumbers[i]);
					count++;
				} 
				j++;
				if (count==0)
					System.out.println(arrayOfNumbers[i]);
			}
		}
		
	}
}
