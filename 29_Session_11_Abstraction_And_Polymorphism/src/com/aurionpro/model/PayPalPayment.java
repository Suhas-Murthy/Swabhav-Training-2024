package com.aurionpro.model;

public class PayPalPayment extends Payment {
	@Override
	public void payBill() {
		System.out.println("Bill Payed through PayPal");		
	}

	@Override
	public void redeem() {
		System.out.println("Redeemed through PayPal");
		
	}
}
