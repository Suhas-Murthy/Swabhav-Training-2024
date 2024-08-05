package com.aurionpro.array.model;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		int array[];

		array = new int[size];

		System.out.println("Enter Array Elements: ");

		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Array is : ");

		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}
