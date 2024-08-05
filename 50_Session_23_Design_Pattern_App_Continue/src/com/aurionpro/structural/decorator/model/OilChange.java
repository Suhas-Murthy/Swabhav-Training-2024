package com.aurionpro.structural.decorator.model;

public class OilChange extends CarDecorator{

	public OilChange(ICarService carService) {
		super(carService);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 500+carService.getCost();
	}

}
