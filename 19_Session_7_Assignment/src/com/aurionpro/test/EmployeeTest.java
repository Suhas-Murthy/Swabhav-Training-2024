package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		System.out.println("Employee 1");
		System.out.println("Enter Employee ID: ");
		emp1.setEmployeeID(sc.nextInt());

		System.out.println("Enter Employee Name: ");
		emp1.setEmployeeName(sc.next());

		System.out.println("Enter Employee Salary: ");
		emp1.setEmployeeSalary(sc.nextInt());

		System.out.println("Employee 2");
		System.out.println("Enter Employee ID: ");
		emp2.setEmployeeID(sc.nextInt());

		System.out.println("Enter Employee Name: ");
		emp2.setEmployeeName(sc.next());

		System.out.println("Enter Employee Salary: ");
		emp2.setEmployeeSalary(sc.nextInt());

		System.out.println("The Employee ID of " + emp1.getEmployeeName() + " is " + emp1.getEmployeeID()
				+ " and Salary is " + emp1.getEmployeeSalary());
		System.out.println("The Employee ID of " + emp2.getEmployeeName() + " is " + emp2.getEmployeeID()
				+ " and Salary is " + emp2.getEmployeeSalary());
		sc.close();
	}
}
