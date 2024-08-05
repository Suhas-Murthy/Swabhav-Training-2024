package com.aurionpro.model;

public class CreditCardPayment extends Payment{
	@Override
	public void payBill() {
		System.out.println("Bill Payed through Credit Card");
		
	}

	@Override
	public void redeem() {
		System.out.println("Redeemed through Credit Card");
		
	}
	
	

}
