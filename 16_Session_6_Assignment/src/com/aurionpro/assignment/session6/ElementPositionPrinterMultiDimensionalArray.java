package com.aurionpro.assignment.session6;

import java.util.Scanner;

public class ElementPositionPrinterMultiDimensionalArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter number of rows: ");
	int rows = sc.nextInt();
	
	System.out.print("Enter number of columns: ");
	int columns= sc.nextInt();
	System.out.println();
	
	int matrix[][] = new int[rows][columns];
	
	System.out.println("Enter the values: ");
	for (int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
			matrix[i][j]=sc.nextInt();
		}
	}
	for(int i = 0; i<rows; i++) {
		for(int j = 0; j<columns; j++) {
			System.out.print(matrix[i][j]+"\t");
		}
		System.out.println();
	}  
	
	System.out.println("Enter the element which you want to search for from the 2D array : ");
	int findNumber = sc.nextInt();
	
	boolean istrue = false;
	for (int i=0;i<rows;i++) {
		for(int j=0;j<columns;j++) {
			if (findNumber == matrix[i][j]) {
				System.out.println("The element "+findNumber+" is present at location ("+i+","+j+")");
				istrue = true;
			}
		}
	}if(!istrue) {
		System.out.println("Element " +findNumber+" not present");
	}
	
}
}
