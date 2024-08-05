package com.aurionpro.assignment.session4;

import java.util.Scanner;

public class PrimePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();
		int number = 2;
		int i;
		int j;
		int count = 0;

		for (i = 1; i < rows; i++) {
			for (j = 1; j < i; j++) {
				for (int k = 2; k < j; i++) {
					if (number % k == 0) {
						count++;
					}
					k++;
				}
				if (count == 0)
					System.out.println("Prime");
				else
					System.out.print("");

				System.out.print(i);
				count++;
			}
			System.out.println();
		}
		i++;
	}
}
