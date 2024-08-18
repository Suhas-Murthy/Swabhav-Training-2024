package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.model.DbConnection;

public class TestDb {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DbConnection connection = new DbConnection();
		connection.connectToDb();
		connection.getEmployeeDetails();

		System.out.println("Employee Management Portal:");
		System.out.println("1. Get Employee Table");
		System.out.println("2. Enroll an Employee");
		System.out.println("3. Update Employee Name");
		System.out.println("4. Update Employee Salary");
		System.out.println("5. Delete an Employee");
		System.out.println("6. Exit");

		System.out.println("Please choose an option: ");
		System.out.println("Enter choice: ");
		int choice = scanner.nextInt();
		while (choice != 6) {
			switch (choice) {
			case 1: {
				connection.getEmployeeDetails();
				break;
			}
			case 2: {
				connection.addEmployee();
				break;
			}
			case 3: {
connection.updateEmployeeName();
				break;
			}
			case 4: {
				connection.updateEmployeeSalary();
				break;
			}
			case 5:{
				connection.deleteEmployee();
			}
			}
			System.out.println("Employee Management Portal:");
			System.out.println("1. Get Employee Table");
			System.out.println("2. Enroll an Employee");
			System.out.println("3. Update Employee Name");
			System.out.println("4. Update Employee Salary");
			System.out.println("5. Delete an Employee");
			System.out.println("6. Exit");

			System.out.println("Please choose an option: ");
			System.out.println("Enter choice: ");
			choice = scanner.nextInt();
		}
		System.out.println("Thank you for visiting Employee Management Portal......");
	}

}
