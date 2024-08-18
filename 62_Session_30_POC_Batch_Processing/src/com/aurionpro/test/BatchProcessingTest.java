package com.aurionpro.test;

import com.aurionpro.model.BatchProcessing;;

public class BatchProcessingTest {
public static void main(String[] args) {
	BatchProcessing connection = new BatchProcessing();
	connection.connectToDb();
	connection.batchAddSuppliers();
}
}
