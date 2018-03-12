package com.skilldistillery.jets;

public class Cargo extends Jet implements CargoCarrier{

	public Cargo() {
	}
	
	public Cargo(String model, double speed, double range, double price) {
		super(model, speed, range, price);
	}

	public void loadCargo() {
		System.out.println(super.getModel() +  " is loading the plane with goods...");
		System.out.println();
	}

}
