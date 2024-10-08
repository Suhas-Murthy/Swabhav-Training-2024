package com.aurionpro.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class AccountDb {
	Connection connection;
	Statement statement;
	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb","root","sql@2019");
			System.out.println("Connection Successfull");
			statement = connection.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addNewAccount(int accountNumber, int customerID) throws SQLException {
		System.out.println(accountNumber+customerID);
        String query = "INSERT INTO accounts (accountNumber, customerID, accountBalance) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, accountNumber);
            preparedStatement.setInt(2, customerID);
            preparedStatement.setDouble(3, 0); // Initial balance
            preparedStatement.executeUpdate();
        }
    }
	
	public int generateAccountNumber() {
        Random random = new Random();
        int accountNumber = 100000000 + random.nextInt(90000000);
        return accountNumber;
    }
	
	
}
