package com.aurionpro.creational.abstractfactory.test;

import com.aurionpro.creational.abstractfactory.model.CurrentFactory;
import com.aurionpro.creational.abstractfactory.model.IAccount;
import com.aurionpro.creational.abstractfactory.model.IAccountFactory;
import com.aurionpro.creational.abstractfactory.model.SavingAccount;
import com.aurionpro.creational.abstractfactory.model.SavingFactory;

public class AccountTest {
public static void main(String[] args) {
	
	IAccountFactory accountFactory;
	accountFactory = new SavingFactory();
	IAccount savingAccount1 = accountFactory.getAccount(123, "Suhas", 5000);
	savingAccount1.credit(1100);
	
	accountFactory = new CurrentFactory();
	IAccount currentAccount1 = accountFactory.getAccount(234, "Company", 25000);
	currentAccount1.debit(32000);
}
}
