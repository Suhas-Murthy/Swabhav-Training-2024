package com.aurionpro.test;

import com.aurionpro.model.DbConnection;

public class TestDb {
	public static void main(String[] args) {
		DbConnection connection = new DbConnection();
		connection.connectToDb();
		connection.getEmployeeDetails();
	}
	
}
