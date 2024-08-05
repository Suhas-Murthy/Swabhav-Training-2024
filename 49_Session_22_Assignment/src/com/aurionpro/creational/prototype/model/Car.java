package com.aurionpro.creational.prototype.model;

public class Car implements IPrototype{
private String model;
private String color;

public Car(String model, String color) {
	super();
	this.model = model;
	this.color = color;
}
public IPrototype clone() {
	return new Car(this.model, this.color);
	
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Override
public String toString() {
	return "Car [model=" + model + ", color=" + color + "]";
}


}
