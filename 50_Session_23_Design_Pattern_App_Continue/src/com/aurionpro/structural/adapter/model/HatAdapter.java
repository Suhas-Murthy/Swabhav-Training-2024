package com.aurionpro.structural.adapter.model;

public class HatAdapter implements IItems{
Hat hat;

public HatAdapter(Hat hat) {
	super();
	this.hat = hat;
}

@Override
public String getItemName() {
	// TODO Auto-generated method stub
	return (hat.getShortName()+" "+hat.getShortName());
}

@Override
public double getItemPrice() {
	return hat.getBasicPrice()+hat.getTax();
}
}
