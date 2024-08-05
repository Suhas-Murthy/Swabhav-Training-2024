package com.aurionpro.creational.builder.model;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car.CarBuilder("V6", "Automatic").setAirbags(true).setSunroof(true).build();

		System.out.println(car);
	}
}
