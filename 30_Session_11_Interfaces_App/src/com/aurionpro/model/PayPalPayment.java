package com.aurionpro.model;

public class PayPalPayment implements Payment{

	@Override
	public void redeem() {
		System.out.println("Redeemed through PayPal");
		
	}

	@Override
	public void paybill() {
		System.out.println("Bill Payed through PayPal");		
		
	}

}
