package com.aurionpro.srp.violation.test;

import com.aurionpro.srp.violation.model.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(1, "Mobile", 15000, 10);
		invoice.print();
	}

}
