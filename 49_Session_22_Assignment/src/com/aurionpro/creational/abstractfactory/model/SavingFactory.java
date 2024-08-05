package com.aurionpro.creational.abstractfactory.model;

public class SavingFactory implements IAccountFactory{

	@Override
	public IAccount getAccount(int accountNumber, String name, int balance) {
		// TODO Auto-generated method stub
		return new SavingAccount(accountNumber, name, balance);
	}



}
