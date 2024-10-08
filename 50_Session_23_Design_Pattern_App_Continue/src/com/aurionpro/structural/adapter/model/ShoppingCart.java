package com.aurionpro.structural.adapter.model;

import java.util.List;

public class ShoppingCart {
List<IItems> cartItems;

public ShoppingCart(List<IItems> cartItems) {
	super();
	this.cartItems = cartItems;
}

public List<IItems> getCartItems() {
	return cartItems;
}



public void addItemtoCart(IItems item) {
	cartItems.add(item);	
}

public double getCartPrice() {
	return cartItems.stream()
			.map((item)->item.getItemPrice())
			.reduce(0.0, (number1,number2)->number1+number2);
}






}
