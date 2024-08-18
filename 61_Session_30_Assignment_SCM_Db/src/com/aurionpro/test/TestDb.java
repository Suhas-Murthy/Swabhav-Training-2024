package com.aurionpro.test;

import com.aurionpro.model.DbConnection;

public class TestDb {
public static void main(String[] args) {
	DbConnection connection = new DbConnection();
	connection.connectToDb();
//	connection.queryOne();
//	System.out.println();
//	connection.queryTwo();
//	System.out.println();
//	connection.queryThree();
//	System.out.println();
//	connection.queryFour();
//	System.out.println();
//	connection.queryFive();
//	System.out.println();
//	connection.querySix();
	System.out.println();
	connection.querySeven();
	System.out.println();
	connection.queryEight();
//	System.out.println();
	connection.queryNine();
//	System.out.println();
	connection.queryTen();
	
}
}
