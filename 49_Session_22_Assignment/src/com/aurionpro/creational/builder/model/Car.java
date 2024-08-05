package com.aurionpro.creational.builder.model;

public class Car {
	// Required parameters
	private final String engine;
	private final String transmission;

	// Optional parameters
	private final boolean airbags;
	private final boolean sunroof;

	private Car(CarBuilder builder) {
		this.engine = builder.engine;
		this.transmission = builder.transmission;
		this.airbags = builder.airbags;
		this.sunroof = builder.sunroof;
	}

	public String getEngine() {
		return engine;
	}

	public String getTransmission() {
		return transmission;
	}

	public boolean hasAirbags() {
		return airbags;
	}

	public boolean hasSunroof() {
		return sunroof;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", transmission=" + transmission + ", airbags=" + airbags + ", sunroof="
				+ sunroof + "]";
	}

	public static class CarBuilder {
		// Required parameters
		private final String engine;
		private final String transmission;

		// Optional parameters
		private boolean airbags;
		private boolean sunroof;

		public CarBuilder(String engine, String transmission) {
			this.engine = engine;
			this.transmission = transmission;
		}

		public CarBuilder setAirbags(boolean airbags) {
			this.airbags = airbags;
			return this;
		}

		public CarBuilder setSunroof(boolean sunroof) {
			this.sunroof = sunroof;
			return this;
		}

		public Car build() {
			return new Car(this);
		}
	}
}
