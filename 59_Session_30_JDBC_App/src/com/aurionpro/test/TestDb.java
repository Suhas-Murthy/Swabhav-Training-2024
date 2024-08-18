package com.aurionpro.test;

import com.aurionpro.model.DbConnection;

public class TestDb {
public static void main(String[] args) {
	DbConnection connection = new DbConnection();
	connection.connectToDb();
	connection.getStudentDetails();
//	connection.addStudent();
	connection.getStudentDetails();
//	connection.updateStudent();
	connection.getStudentDetails();
	connection.deleteStudent();
	connection.getStudentDetails();
}
}
