package com.aurionpro.model1;

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
	private Scanner scannner = new Scanner(System.in);

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
}
