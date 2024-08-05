package com.aurionpro.assignment.session6;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows for matrix A: ");
		int rowsA = sc.nextInt();
		System.out.println("Enter number of columns for matrix A: ");
		int columnsA = sc.nextInt();

		System.out.println("Enter number of rows for matrix B: ");
		int rowsB = sc.nextInt();
		System.out.println("Enter number of columns for matrix B: ");
		int columnsB = sc.nextInt();

		if (columnsA != rowsB) {
			System.out.println("Matrix multiplication is not possible with these dimensions.");
			return;
		}
		int matrixA[][] = new int[rowsA][columnsA];
		int matrixB[][] = new int[rowsB][columnsB];

		System.out.println("Enter elements for matrix A - (" + rowsA + "x" + columnsA + ") :");
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < columnsA; j++) {
				matrixA[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter elements for matrix B - (" + rowsB + "x" + columnsB + ") : ");
		for (int i = 0; i < rowsB; i++) {
			for (int j = 0; j < columnsB; j++) {
				matrixB[i][j] = sc.nextInt();
			}
		}
		int matrixans[][] = new int[rowsA][columnsB];

		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < columnsB; j++) {
				for (int k = 0; k < columnsA; k++) {
					matrixans[i][j] += matrixA[i][k] * matrixB[k][j];

				}
			}
		}
		System.out.println(Arrays.deepToString(matrixans));
	}
}
