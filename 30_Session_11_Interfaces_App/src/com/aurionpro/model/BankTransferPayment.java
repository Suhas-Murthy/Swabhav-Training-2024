package com.aurionpro.model;

public class BankTransferPayment implements Payment{

	@Override
	public void redeem() {
		System.out.println("Redeemed through Bank Transfer");			
		
	}

	@Override
	public void paybill() {
		System.out.println("Bill Payed through Bank Transfer");			
	}

}
