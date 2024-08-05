package com.aurionpro.creational.prototype.test.violation;

import com.aurionpro.creational.prototype.model.violation.Car;

public class CarTest {
    public static void main(String[] args) {
        // Create Car objects using constructors
        Car car1 = new Car("Sedan", "Red");
        System.out.println("Car 1: " + car1);

        Car car2 = new Car("SUV", "Blue");
        System.out.println("Car 2: " + car2);
    }
}

