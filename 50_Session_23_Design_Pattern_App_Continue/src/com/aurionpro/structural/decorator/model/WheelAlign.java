package com.aurionpro.structural.decorator.model;

public class WheelAlign extends CarDecorator{

	public WheelAlign(ICarService carService) {
		super(carService);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 1500+carService.getCost();
	}

}
