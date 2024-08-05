package com.aurionpro.model;

public class CreditCardPayment implements Payment{

	@Override
	public void redeem() {
		System.out.println("Redeemed through Credit Card");
		
	}

	@Override
	public void paybill() {
		System.out.println("Bill Payed through Credit Card");
		
	}

}
