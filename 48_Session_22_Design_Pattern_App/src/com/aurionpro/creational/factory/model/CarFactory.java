package com.aurionpro.creational.factory.model;

public class CarFactory {

	ICar car = null;

	// public ICar makeCar(String carName) {
	// if(carName == "Maruti")
	// car = new Maruti();
	// if(carName == "Tata")
	// car = new Tata();
	// if(carName == "Mahindra")
	// car = new Mahindra();
	// return car;

	// using enum:

	public ICar makeCar(CarName carName) {
		if (carName.equals(CarName.MARUTI))
			car = new Maruti();
		if (carName.equals(CarName.TATA))
			car = new Tata();
		if (carName.equals(CarName.MAHINDRA))
			car = new Mahindra();
		return car;

	}
}
