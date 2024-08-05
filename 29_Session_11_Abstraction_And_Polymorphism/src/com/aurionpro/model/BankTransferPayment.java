package com.aurionpro.model;

public class BankTransferPayment extends Payment {

	@Override
	public void payBill() {
		System.out.println("Bill Payed through Bank Transfer");		
	}

	@Override
	public	void redeem() {
		System.out.println("Redeemed through Bank Transfer");			
	}
	
	
}
