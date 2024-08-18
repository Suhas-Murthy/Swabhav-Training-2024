package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.DatabaseMetaData;

public class DbConnection {

	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement;// parameterrised queries are excecuted
	private Scanner scannner = new Scanner(System.in);

	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "sql@2019");
			statement = connection.createStatement();
			System.out.println("Connection Success");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getStudentDetails() {
		try {
			ResultSet dbStudentData = statement.executeQuery("select * from students");
			while (dbStudentData.next()) {
				System.out.println(dbStudentData.getInt(1) + "\t" + dbStudentData.getString(2) + "\t"
						+ dbStudentData.getInt("age") + "\t" + dbStudentData.getDouble(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addStudent() {

		System.out.println("Enter Roll Number: ");
		int rollNumber = scannner.nextInt();
		System.out.println("Enter Name: ");
		String name = scannner.next();
		System.out.println("Enter Age: ");
		int age = scannner.nextInt();
		System.out.println("Enter Percentage: ");
		double percentage = scannner.nextDouble();

		try {
			// ? are parameters
			preparedStatement = connection.prepareStatement("insert into students values(?,?,?,?)");
			preparedStatement.setInt(1, rollNumber);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, age);
			preparedStatement.setDouble(4, percentage);
			preparedStatement.executeUpdate();
			System.out.println("Record Added");

			// insert the value
			// this is not a good option as we may miss some , or '
			// statement.executeUpdate("insert into students
			// values("+rollNumber+",'"+name+"',"+age+","+percentage+")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateStudent() {
		System.out.println("Enter new Percentage: ");
		// System.out.println("roll_number, name, age, percentage type as it is ");
		double percentage = scannner.nextDouble();
		System.out.println("Enter RollNumber : ");
		int rollNo = scannner.nextInt();
		try {
			preparedStatement = connection.prepareStatement("update students set percentage= ? where roll_number= ?");
			preparedStatement.setDouble(1, percentage);
			preparedStatement.setInt(2, rollNo);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteStudent() {
		// System.out.println("Enter new Percentage: ");
		// System.out.println("roll_number, name, age, percentage type as it is ");
		// double percentage = scannner.nextDouble();
		System.out.println("Enter RollNumber which you want to delete : ");
		int rollNo = scannner.nextInt();
		try {
			preparedStatement = connection.prepareStatement("delete from students where roll_number= ?");
			// preparedStatement.setDouble(1,percentage);
			preparedStatement.setInt(1, rollNo);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	public void countColumns() {
//		try {
//			DatabaseMetaData metaData = connection.getMetaData();
//			// Specify the database, schema, and table String catalog = null; // Use null or
//			// the catalog name if applicable
//			String schemaPattern = null; // Use null or the schema name if applicable String tableNamePattern =
//											// "students"; // Table name
//			// Retrieve column metadata
//			ResultSet columns = metaData.getColumns(catalog, schemaPattern, tableNamePattern, null);
//			// Count the number of columns int columnCount = 0;
//			while (columns.next()) {
//				columnCount++;
//			}
//			System.out.println("Number of columns in table '" + tableNamePattern + "': " + columnCount);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

//	public void printColumnDataTypes() {
//		try {
//			DatabaseMetaData metaData = connection.getMetaData();
//			// Specify the database, schema, and table
//			String catalog = null; // Use null or the catalog name if applicable String schemaPattern = null; //
//									// Use null or the schema name if applicable
//			String tableNamePattern = "students"; // Table name
//			// Retrieve column metadata ResultSet columns = metaData.getColumns(catalog,
//			// schemaPattern, tableNamePattern, null);
//			// Print column data types
//			System.out.println("Column Data Types for table '" + tableNamePattern + "':");
//			while (columns.next()) {
//				String columnName = columns.getString("COLUMN_NAME");
//				String columnType = columns.getString("TYPE_NAME");
//				int columnSize = columns.getInt("COLUMN_SIZE");
//				System.out.println("Column Name: " + columnName);
//				System.out.println("Data Type: " + columnType);
//				System.out.println("Column Size: " + columnSize);
//				System.out.println();
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
}
