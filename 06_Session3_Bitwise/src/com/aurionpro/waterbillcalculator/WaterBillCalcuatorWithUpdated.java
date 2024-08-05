package com.aurionpro.waterbillcalculator;

import java.util.Scanner;

public class WaterBillCalcuatorWithUpdated {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Water Bill Calculator-----");
		System.out.print(" Enter Number of Units Consumed: ");
		int unitsConsumed = sc.nextInt();
		final int meterCharge = 75;
		float charge = 0;
		float totalWaterBill = 0;
		int number1 = 0;
		

			if (unitsConsumed <= 100) {
				charge = unitsConsumed * 5;
				totalWaterBill = charge + meterCharge;
			} else if (unitsConsumed <= 250) {
				charge = 100*5 + unitsConsumed -100 * 10;
				totalWaterBill = charge + meterCharge;
			} else {
				charge = 100*5 + unitsConsumed-100 * 20;
				totalWaterBill = charge + meterCharge;
			}

		System.out.println("Your Total Water Bill : " + totalWaterBill);
	}
}
