package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;

public class AccountTest {

public static void main(String[] args) {
	Account account1 = new Account(101, "Suhas", 450000, AccountType.SAVINGS);
	
	System.out.println(account1);
}
}
