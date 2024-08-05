package com.aurionpro.srp.solution.model;

public class InvoicePrinter {
Invoice invoice;
TaxCalculator taxCalculator;


public InvoicePrinter(Invoice invoice, TaxCalculator taxCalculator) {
	super();
	this.invoice = invoice;
	this.taxCalculator = taxCalculator;
}


public void print() {
	System.out.println("ID : "+invoice.getId());
	System.out.println("Description : "+invoice.getDescription());
	System.out.println("Amount : "+invoice.getAmount());
	System.out.println("Tax : "+invoice.getTax());
	System.out.println("Tax Amount : "+taxCalculator.calculateTax());
	System.out.println("Total Amount  with Tax : "+ (invoice.getAmount()+taxCalculator.calculateTax()));
	
}
}
