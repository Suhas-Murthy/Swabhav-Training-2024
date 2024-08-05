package com.aurionpro.assignment.session6;

import java.util.Arrays;
import java.util.Scanner;

public class SquareOfArray {

	private static void squareArray(int array[], int size) {
		int array1[] = new int[size];
		for (int i = 0; i < size; i++) {
			array1[i] = (int) Math.pow(array[i], 2);
		}
		System.out.println("Squared Elements of the array : " + Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.print("Sorted Array after sqauring : ");
		for (int i = 0; i < size; i++) {
			System.out.print(array1[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of the array: ");
		int size = scanner.nextInt();

		int array[] = new int[size];

		System.out.println("Enter the elements in the sorted form: ");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.print("Original Array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		Arrays.sort(array);

		System.out.print("Sorted Array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
		
		squareArray(array, size);
		scanner.close();
	}
}
