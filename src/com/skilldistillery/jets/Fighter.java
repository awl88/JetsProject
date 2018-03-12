package com.skilldistillery.jets;

public class Fighter extends Jet{

	public Fighter() {
	}

	public Fighter(String model, double speed, double range, double price) {
		super(model, speed, range, price);
	}
	
	public void fight() {
		System.out.println(super.getModel() + ": Vrooooom...");
		System.out.println(super.getModel() + ": Pew pew pew...");
		System.out.println();
	}
	

}
