package com.aurionpro.assignment.session5;

import java.util.Scanner;

public class DuplicateFinderFromArray {
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
		
		for(int i = 0; i<length; i++) {
			for(int j = i+1; i<length)
		}
}}
