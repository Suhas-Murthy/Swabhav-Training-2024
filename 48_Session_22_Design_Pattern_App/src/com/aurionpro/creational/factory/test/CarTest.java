package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.CarFactory;
import com.aurionpro.creational.factory.model.CarName;
import com.aurionpro.creational.factory.model.ICar;
import com.aurionpro.creational.factory.model.Mahindra;
import com.aurionpro.creational.factory.model.Maruti;
import com.aurionpro.creational.factory.model.Tata;

public class CarTest {

	public static void main(String[] args) {
//		Maruti maruti = new Maruti();
//		maruti.start();
//		maruti.stop();
//		Tata tata = new Tata();
//		tata.start();
//		tata.stop();
//		Mahindra mahindra = new Mahindra();
//		mahindra.start();
//		mahindra.stop();

		
//		CarFactory carFactory = new CarFactory();
//		ICar car = carFactory.makeCar("Maruti");
//		car.start();
//		car.stop();
		
		//use enum
		CarFactory carFactory = new CarFactory();
		ICar car = carFactory.makeCar(CarName.MARUTI);
		car.start();
		
		
	}

}
