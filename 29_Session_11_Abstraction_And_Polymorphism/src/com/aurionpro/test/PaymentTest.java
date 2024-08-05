package com.aurionpro.test;

import com.aurionpro.model.BankTransferPayment;
import com.aurionpro.model.CreditCardPayment;
import com.aurionpro.model.PayPalPayment;
import com.aurionpro.model.Payment;

public class PaymentTest {
	public static void main(String[] args) {
		Payment payment;
		payment = new CreditCardPayment();
		payment.payBill();
		payment.redeem();
		
		System.out.println();
		
		payment = new PayPalPayment();
		payment.payBill();
		payment.redeem();
		
		System.out.println();
		
		payment = new BankTransferPayment();
		payment.payBill();
		payment.redeem();
	}
}
