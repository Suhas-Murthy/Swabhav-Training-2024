package com.aurionpro.test;

import java.util.Scanner;

public class MatrixTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matrix[][] = new int[3][3];

		System.out.println("Enter elements :");
		createRows(matrix, sc);

		System.out.println("Print Matrix: ");
		printMatrix(matrix);

	}

	// -----------------------------------------------------------------------------------------------------------
	private static void createRows(int matrix[][], Scanner sc) {
		for (int rows = 0; rows < 3; rows++) {
			rowElementInput(matrix, rows, sc);
		}
	}

	private static void rowElementInput(int matrix[][], int rows, Scanner sc) {
		for (int col = 0; col < 3; col++) {
			matrix[rows][col] = sc.nextInt();
		}
	}

	private static void printRows(int matrix[][], int rows) {
		for (int col = 0; col < 3; col++) {
			System.out.print(matrix[rows][col] + "\t");
		}
	}

	private static void printMatrix(int matrix[][]) {
		for (int rows = 0; rows < 3; rows++) {
			printRows(matrix, rows);
			System.out.println();
		}
	}
}
