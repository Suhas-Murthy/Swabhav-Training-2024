package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Car;

public class CarTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Car> cars = new ArrayList<Car>();
		System.out.println("Enter number of cars: ");
		int number = scanner.nextInt();

		for (int i = 0; i < number; i++) {
			System.out.println("Enter Car ID: ");
			int carId = scanner.nextInt();
			System.out.println("Enter Car's Company Name: ");
			String carName = scanner.next();
			System.out.println("Enter Car's Mileage: ");
			int carMileage = scanner.nextInt();

			cars.add(new Car(carId, carName, carMileage));
		}

		for (Car car : cars) {
			System.out.println(car);
		}
		highestMileage(cars, number);
	}
	static int max = 0;
	static int k =0;
	private static void highestMileage(List<Car> cars,int number) {
		for(int i = 0; i<number; i++) {
			cars.get(i).getCarMileage();
			k = i;
			max= cars.get(i).getCarMileage();
			for(int j = 0;j<number;j++) {
				if(cars.get(i).getCarMileage() < cars.get(j).getCarMileage()) {
					max = cars.get(j).getCarMileage();
					k = j;
				}
			}
		}System.out.println("Max Avg Car : ");
		System.out.println(cars.get(k));
	}
}
