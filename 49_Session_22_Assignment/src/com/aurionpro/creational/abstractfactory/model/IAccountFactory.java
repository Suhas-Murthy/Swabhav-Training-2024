package com.aurionpro.creational.abstractfactory.model;

public interface IAccountFactory {
public IAccount getAccount(int accountNumber, String name, int balance);
}
