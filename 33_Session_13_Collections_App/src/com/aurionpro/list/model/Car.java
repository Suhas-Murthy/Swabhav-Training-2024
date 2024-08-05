package com.aurionpro.list.model;

public class Car {
private int carId;
private String carName;
private int carMileage;
public Car(int carId, String carName, int carMileage) {
	super();
	this.carId = carId;
	this.carName = carName;
	this.carMileage = carMileage;
}
public int getCarId() {
	return carId;
}
public void setCarId(int carId) {
	this.carId = carId;
}
public String getCarName() {
	return carName;
}
public void setCarName(String carName) {
	this.carName = carName;
}
public int getCarMileage() {
	return carMileage;
}
public void setCarMileage(int carMileage) {
	this.carMileage = carMileage;
}
@Override
public String toString() {
	return "Car [carId=" + carId + ", carName=" + carName + ", carMileage=" + carMileage + "]";
}


}
