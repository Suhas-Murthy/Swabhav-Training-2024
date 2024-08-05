package com.aurionpro.model;

public class BankAccount {

	private long accountNumber;
	private String accountHolderName;
	private int accountBalance;
//	private int accountHolderPin;

	public BankAccount(int accNumber, String accHolderName,int accBalance ) {
		this.accountNumber = accNumber;
		this.accountHolderName = accHolderName;
		this.accountBalance = accBalance;
	}
	
	public BankAccount() {
		
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return accountHolderName;
	}

	public int getBalance() {
		return accountBalance;
	}
	
//	public int getAccountPin() {
//		return accountHolderPin;
//	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
//	public void setAccountPin(int pin) {
//		accountHolderPin = pin;
//	}

	public void amountDeposit(int deposit) {
		this.accountBalance += deposit;
		System.out.println("Deposit Successful. New Balance : " + accountBalance);
	}

	public void amountWithdraw(int withdraw) {
		if (withdraw > 0 && withdraw <= accountBalance) {
			accountBalance -= withdraw;
			System.out.println("Withdraw Successful. Remaining Balance : " + accountBalance);
		}else {
			System.out.println("Withdraw Failed. Insufficient Balance.");
			System.out.print("Your Balance is " + accountBalance);
		}
	}
	
	public void Menu() {
		 System.out.println("ATM Menu:");
		 System.out.println("1. Check Balance");
		 System.out.println("2. Deposit Money");
		 System.out.println("3. Withdraw Money");
		 System.out.println("4. Exit");
		
		 System.out.println("Please choose an option: ");
	}


}
