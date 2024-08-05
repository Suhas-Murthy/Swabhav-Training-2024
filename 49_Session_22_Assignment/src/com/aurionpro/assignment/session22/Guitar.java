package com.aurionpro.assignment.session22;

public class Guitar {
	private String serialNumber, builder, model, type, backlond, topWood;
	private double price;
	
	public Guitar(String serialNumber, String builder, String model, String type, String backlond, String topWood,
			double price) {
		super();
		this.serialNumber = serialNumber;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backlond = backlond;
		this.topWood = topWood;
		this.price = price;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBuilder() {
		return builder;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBacklond() {
		return backlond;
	}

	public void setBacklond(String backlond) {
		this.backlond = backlond;
	}

	public String getTopWood() {
		return topWood;
	}

	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
