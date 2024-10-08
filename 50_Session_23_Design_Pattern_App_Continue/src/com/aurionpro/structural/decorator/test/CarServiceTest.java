package com.aurionpro.structural.decorator.test;

import com.aurionpro.structural.decorator.model.CarInspection;
import com.aurionpro.structural.decorator.model.ICarService;
import com.aurionpro.structural.decorator.model.OilChange;
import com.aurionpro.structural.decorator.model.WheelAlign;

public class CarServiceTest {

	public static void main(String[] args) {
		ICarService car = new CarInspection();
		OilChange oilChange = new OilChange(car);
		WheelAlign wheelAllign = new WheelAlign(oilChange);
		
		System.out.println(wheelAllign.getCost());

	}

}
