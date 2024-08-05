package com.aurionpro.creational.prototype.test;

import com.aurionpro.creational.prototype.model.Car;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car("Sedan", "Red");
		System.out.println("Original car: " + car1);

		Car car2 = (Car) car1.clone();
		System.out.println("Cloned car: " + car2);

		car2.setColor("Blue");
		System.out.println("Modified cloned car: " + car2);
		
//		System.out.println(car1);
	}
}
