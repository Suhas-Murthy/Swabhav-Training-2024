package com.aurionpro.multidimensionalarray;

import java.util.Scanner;

public class MultiDimensionalArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of rows: ");
	int rows = sc.nextInt();
	
	System.out.println("Enter number of columns: ");
	int columns = sc.nextInt();
	
	int matrix[][] = new int[rows][columns];
	
	for(int i = 0; i<rows; i++) {
		for(int j = 0; j<columns; j++) {
			matrix[i][j] = sc.nextInt();
		}
	}
	for(int i = 0; i<rows; i++) {
		for(int j = 0; j<columns; j++) {
			System.out.print(matrix[i][j]+"\t");
		}
		System.out.println();
	}
}
}
