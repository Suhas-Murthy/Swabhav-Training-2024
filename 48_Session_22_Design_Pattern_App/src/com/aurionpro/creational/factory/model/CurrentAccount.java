package com.aurionpro.creational.factory.model;

public class CurrentAccount implements IAccount {
	private int accountNumber;
	private String name;
	private int balance = 25000;
	private int overDraft;
	private AccountType accountType = AccountType.CURRENT;
	

	public CurrentAccount(int accountNumber, String name, int overDraft) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.overDraft = overDraft;
	}

	@Override
	public void credit(int deposit) {
		this.balance += deposit;
		System.out.println("Deposit Successful. New Balance : " + this.balance);
	}

	@Override
	public void debit(int withdraw) {
		this.balance -= withdraw;
		System.out.println("Withdraw Successful");
		
	}

}
