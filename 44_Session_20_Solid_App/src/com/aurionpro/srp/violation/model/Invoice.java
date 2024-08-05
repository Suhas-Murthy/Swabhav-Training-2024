package com.aurionpro.srp.violation.model;

public class Invoice {
	private int id;
	private String description;
	private double amount;
	private double tax = 0.18;

	public Invoice(int id, String description, double amount, double tax) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", description=" + description + ", amount=" + amount + ", tax=" + tax + "]";
	}

	public double calculateTax() {
		return amount * tax / 100;
	}

public void print() {
	System.out.println("ID : "+id);
	System.out.println("Description : "+description);
	System.out.println("Amount : "+amount);
	System.out.println("Tax : "+tax);
	System.out.println("Tax Amount : "+calculateTax());
	System.out.println("Total Amount  with Tax : "+ (amount+calculateTax()));
	
}
}
