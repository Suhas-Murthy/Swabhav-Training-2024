package com.aurionpro.assignment.session3;

import java.util.Scanner;

public class CurrencyDenomination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Currency Denomination");
		System.out.print("Enter the amount for denomination in mutiple of 100's : ");
		int amount = sc.nextInt();
		// amount 3000
		if (amount <= 50000) {
			if (amount % 100 == 0) {

				if (amount >= 2000) {
					int cash = amount / 2000;
					amount = amount - (cash * 2000);
					System.out.println("Two Thousand " + cash);
				}
				if (amount >= 500) {
					int cash = amount / 500;
					amount = amount - (cash * 500);
					System.out.println("Five Hundred : " + cash);
				}
				if (amount >= 200) {
					int cash = amount / 200;
					amount = amount - (cash * 200);
					System.out.println("Two Hundred : " + cash);
				}
				if (amount >= 100) {
					int cash = amount / 100;
					amount = amount - (cash * 100);
					System.out.println("Hundred : " + cash);
				}

			} else {
				System.out.println("Amount should be in multiples of 100");
			}
		} else {
			System.out.println("Amount exceeds withdrwal limit of 50000");
		}
	}
}