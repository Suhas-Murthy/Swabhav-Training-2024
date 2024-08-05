package com.aurionpro.behavioural.observer.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.behavioural.observer.model.Account;
import com.aurionpro.behavioural.observer.model.INotifier;
import com.aurionpro.behavioural.observer.model.InsufficientBalanceException;
import com.aurionpro.behavioural.observer.model.SMSNotifer;
import com.aurionpro.behavioural.observer.model.WhatsappNotifier;


public class AccountNotifierTest {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Account account;
	INotifier notification = new SMSNotifer();
	
	List<INotifier> notifiers = new ArrayList<INotifier>();
	notifiers.add(notification);
//	notification = new WhatsappNotifier();
//	notifiers.add(notification);
	
	account = new Account(123, "Suhas", 10000, notifiers);
	account.deposit(100);
	try {
		account.withdraw(120002);
	}catch(InsufficientBalanceException exception) {
		System.out.println("Displaing on ATM Screen: "+exception.getMessage());
	}

//	account.notify();
}
}
