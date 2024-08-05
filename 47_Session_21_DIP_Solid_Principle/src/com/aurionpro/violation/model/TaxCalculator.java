package com.aurionpro.violation.model;

public class TaxCalculator {
private DBLogger dblogger;

public TaxCalculator(DBLogger dblogger) {
	super();
	this.setDblogger(dblogger);
}

public int calculateTax(int amount, int rate) {
	int tax=0;
	try {
		tax = amount/rate;
		System.out.println(tax);
	}catch(Exception e) {
		new DBLogger().log("Divide by Zero");
	}
	return rate;
	
}

public DBLogger getDblogger() {
	return dblogger;
}

public void setDblogger(DBLogger dblogger) {
	this.dblogger = dblogger;
}
}
