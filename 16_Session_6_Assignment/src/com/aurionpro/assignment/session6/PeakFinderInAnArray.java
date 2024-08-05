package com.aurionpro.assignment.session6;

import java.util.Scanner;

public class PeakFinderInAnArray {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of the array: ");
		int size = scanner.nextInt();

		int array[] = new int[size];

		System.out.println("Enter the elements : ");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.print("Original Array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
int count = 0;
		for (int i = 1; i < size - 1; i++) {
			if (array[i - 1] < array[i] && array[i] > array[i + 1]) {
				count++;
				System.out.println(array[i]+" is the peak element in an array at location "+i+".");
			}
			
		}
		System.out.println("So, their are total "+ count + " peak elements");
scanner.close();
	}
}
