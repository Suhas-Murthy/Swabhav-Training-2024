package com.aurionpro.solution.model;

public class TaxCalculator {
private DbLogger dbLogger;
private FileLogger fileLogger;




public TaxCalculator(DbLogger dbLogger, FileLogger fileLogger) {
	super();
	this.dbLogger = dbLogger;
	this.fileLogger = fileLogger;
}









public DbLogger getDbLogger() {
	return dbLogger;
}









public void setDbLogger(DbLogger dbLogger) {
	this.dbLogger = dbLogger;
}









public FileLogger getFileLogger() {
	return fileLogger;
}









public void setFileLogger(FileLogger fileLogger) {
	this.fileLogger = fileLogger;
}









public int calculateTax(int amount, int rate) {
	int tax=0;
	try {
		tax = amount/rate;
		System.out.println(tax);
	}catch(Exception e) {
	new DbLogger().log("Divide by Zero");
}
	return rate;
	
}
}
