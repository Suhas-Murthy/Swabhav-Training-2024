package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnection {
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement;// parameterrised queries are excecuted
	private Scanner scanner = new Scanner(System.in);

	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "sql@2019");
			statement = connection.createStatement();
			System.out.println("Connection Success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getEmployeeDetails() {
		try {
			ResultSet dbEmployeeData = statement.executeQuery("select * from employee");
			while (dbEmployeeData.next()) {
				System.out.println(dbEmployeeData.getInt(1) + "\t" + dbEmployeeData.getString(2) + "\t"
						+ dbEmployeeData.getDouble("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void addEmployee() {

		System.out.println("Enter Employee ID: ");
		int empid = scanner.nextInt();
		System.out.println("Enter Name: ");
		String name = scanner.next();
		System.out.println("Enter Salary: ");
		double salary = scanner.nextDouble();

		try {
			// ? are parameters
			preparedStatement = connection.prepareStatement("insert into employee values(?,?,?)");
			preparedStatement.setInt(1, empid);
			preparedStatement.setString(2, name);
			preparedStatement.setDouble(3, salary);
			preparedStatement.executeUpdate();
			System.out.println("Record Added");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateEmployeeSalary() {
		System.out.println("Enter new Salary: ");
		double salary = scanner.nextDouble();
		System.out.println("Enter Employee ID : ");
		int empid = scanner.nextInt();
		try {
			preparedStatement = connection.prepareStatement("update employee set salary= ? where empid= ?");
			preparedStatement.setDouble(1, salary);
			preparedStatement.setInt(2, empid);
			preparedStatement.executeUpdate();
			System.out.println("Employee Salary update successfully.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateEmployeeName() {
		System.out.println("Enter Name to be updated: ");
		String name = scanner.next();
		System.out.println("Enter Employee ID : ");
		int empid = scanner.nextInt();
		try {
			preparedStatement = connection.prepareStatement("update employee set name= ? where empid= ?");
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, empid);
			preparedStatement.executeUpdate();
			System.out.println("Employee Name updated successfully.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteEmployee() {
		System.out.println("Enter Employee ID to delete:");
		int empid = scanner.nextInt();

		try {

			preparedStatement = connection.prepareStatement("DELETE FROM employee WHERE empid = ?");
			preparedStatement.setInt(1, empid);
			preparedStatement.executeUpdate();

			System.out.println("Employee deleted successfully.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
