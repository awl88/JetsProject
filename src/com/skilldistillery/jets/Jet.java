package com.skilldistillery.jets;

public abstract class Jet {
	// Create fields for Jet
	protected String model;
	protected double speed;
	protected double range;
	protected double price;
	
	// No args constructor 
	public Jet() {}
	
	// Constructor to set all the details of the Jets
	public Jet(String model, double speed, double range, double price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	//Method to calculate how long a Jet can be in the air for and print it out
	public void fly() {
		Double timeInAir = range / speed;
		System.out.println(timeInAir);
	}
	
	// toString method
	public String toString() {
		return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}
	
	// Getters & Setters
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getRange() {
		return range;
	}
	public void setRange(double range) {
		this.range = range;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
