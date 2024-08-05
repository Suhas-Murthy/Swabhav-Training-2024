package com.aurionpro.assignment.session5;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfElementsOfAnArrayDifferentType {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of elements in the array:");
		int n = scanner.nextInt();

		int[] array = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		int[] result = productExceptSelf(array);
		System.out.println("The product array is: " + Arrays.toString(result));
	}

	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] prod = new int[n];

		Arrays.fill(prod, 1);

		int prefix = 1;
		for (int i = 0; i < n; i++) {
			prod[i] *= prefix;
			prefix *= nums[i];
		}
		int suffix = 1;
		for (int i = n - 1; i >= 0; i--) {
			prod[i] *= suffix;
			suffix *= nums[i];
		}
		return prod;
	}
}
