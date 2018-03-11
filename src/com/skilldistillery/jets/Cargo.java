package com.skilldistillery.jets;

public class Cargo extends Jet{

	public Cargo() {
	}
	
	public Cargo(String model, double speed, double range, double price) {
		super(model, speed, range, price);
	}

	public void loadCargo() {
		System.out.println("Loading the plane with goods...");
	}

}
