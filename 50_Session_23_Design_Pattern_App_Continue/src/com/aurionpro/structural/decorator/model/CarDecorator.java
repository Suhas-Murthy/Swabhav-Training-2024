package com.aurionpro.structural.decorator.model;

public abstract class CarDecorator implements ICarService {
	ICarService carService;

	public CarDecorator(ICarService carService) {
		super();
		this.carService = carService;
	}



}
