package com.aurionpro.creational.abstractfactory.test;

import com.aurionpro.creational.abstractfactory.model.ICarFactory;
import com.aurionpro.creational.abstractfactory.model.ICars;
import com.aurionpro.creational.abstractfactory.model.MahindraFactory;
import com.aurionpro.creational.abstractfactory.model.MarutiFactory;

public class CarTest {
public static void main(String[] args) {
	ICarFactory carFactory;
	ICars car;
	carFactory= new MarutiFactory();
	car = carFactory.makeCar();
	car.start();
	car.stop();
	carFactory = new MahindraFactory();
	
	car = carFactory.makeCar();
	car.start();
	car.stop();
}
}
