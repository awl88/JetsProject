package com.skilldistillery.jets;

import java.util.Scanner;

public class AirField {
	static Scanner kb = new Scanner(System.in);

	private Jet[] planes = new Jet[6];

	public void run() {
		airField();
		System.out.println("===Welcome to Jets===");
		System.out.println();
		while (true) {
			System.out.println("Please choose an option from the following list:");
			System.out.println("\t1. List Fleet");
			System.out.println("\t2. Fly all Jets");
			System.out.println("\t3. View Fastest Jet");
			System.out.println("\t4. See which Jet has the Furthest Range");
			System.out.println("\t5. Load Cargo Planes");
			System.out.println("\t6. Dog Fight!");
			System.out.println("\t7. Add a Jet to the Fleet");
			System.out.println("\t8. Quit");
			int choice = kb.nextInt();
			System.out.println();

			switch (choice) {
			case 1:
				listFleet();
				System.out.println();
				break;
			case 2:
				fly();
				System.out.println();
				break;
			case 3:
				getFastest();
				System.out.println();
				break;
			case 4:
				getFurthest();
				System.out.println();
				break;
			case 5:
				getCargo();
				System.out.println();
				break;
			case 6:
				getFighter();
				System.out.println();
				break;
			case 7:
				addJet();
				System.out.println();
				break;
			case 8:
				System.out.println("Goodbye");
				System.out.println();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input, try again.");
				System.out.println();
			}
		}
	}

	public void airField() {

		Cargo c1 = new Cargo("AirBus 1000", 360, 2500, 2594000);
		Cargo c2 = new Cargo("Airbus 2000", 450, 3500, 2780000);
		Fighter f1 = new Fighter("SuperFighter", 1500, 1200, 2250000);
		Fighter f2 = new Fighter("Red Barron", 88, 500, 51000);
		Fighter f3 = new Fighter("FastBoy", 1760, 1750, 3000000);
		Cargo c3 = new Cargo();
		Fighter f4 = new Fighter();
		JetImpl j1 = new JetImpl();

		planes[0] = c1;
		planes[1] = c2;
		planes[2] = f1;
		planes[3] = f2;
		planes[4] = f3;

	}

	public void addJet() {
		System.out.println("===Add Plane===");
		System.out.println("1. Cargo\n2.Fighter\n3.Basic Jet");
		int choice = kb.nextInt();
		if (choice == 1) {
			System.out.print("Model: ");
			String model = kb.next();
			System.out.print("Speed: ");
			double speed = kb.nextInt();
			System.out.print("Range: ");
			double range = kb.nextInt();
			System.out.print("Price: ");
			double price = kb.nextInt();

			Jet c3 = new Cargo(model, speed, range, price);
			for (int i = 0; i < planes.length; i++) {
				if (planes[i] == null) {
					planes[i] = c3;
				}

			}

		}
		if (choice == 2) {
			System.out.print("Model: ");
			String model = kb.next();
			System.out.print("Speed: ");
			double speed = kb.nextInt();
			System.out.print("Range: ");
			double range = kb.nextInt();
			System.out.print("Price: ");
			double price = kb.nextInt();

			Jet f4 = new Cargo(model, speed, range, price);
			for (int i = 0; i < planes.length; i++) {
				if (planes[i] == null) {
					planes[i] = f4;
				}

			}

		}
		if (choice == 3) {
			System.out.print("Model: ");
			String model = kb.next();
			System.out.print("Speed: ");
			double speed = kb.nextInt();
			System.out.print("Range: ");
			double range = kb.nextInt();
			System.out.print("Price: ");
			double price = kb.nextInt();

			Jet j1 = new Cargo(model, speed, range, price);
			for (int i = 0; i < planes.length; i++) {
				if (planes[i] == null) {
					planes[i] = j1;
				}

			}

		}

	}

	public void listFleet() {
		for (int i = 0; i < planes.length; i++) {
			if (planes[i] != null) {
				System.out.println("Model: " + planes[i].getModel() + " Speed: " + planes[i].getSpeed() + " MPH Range: "
						+ planes[i].getRange() + " Miles Price: $" + planes[i].getPrice());
				;
			}
		}
	}

	public void fly() {
		for (int i = 0; i < planes.length; i++) {
			if (planes[i] != null) {
				planes[i].fly();
			}
		}
	}

	public void getFastest() {
		Jet fastest = planes[0];
		for (int i = 0; i < planes.length; i++) {
			if (planes[i] != null) {
				if (planes[i].getSpeed() > fastest.getSpeed()) {
					fastest = planes[i];
				}
			}
		}
		System.out.println(
				fastest.getModel() + " is the fastest jet in the fleet with a speed of " + fastest.getSpeed() + " MPH");
	}

	public void getFurthest() {
		Jet furthest = planes[0];
		for (int i = 0; i < planes.length; i++) {
			if (planes[i] != null) {
				if (planes[i].getRange() > furthest.getRange()) {
					furthest = planes[i];
				}
			}
		}
		System.out.println(
				furthest.getModel() + " can go the furthest with a range of " + furthest.getRange() + " miles");
	}

	public void getCargo() {
		Cargo cargo = new Cargo();
		for (int i = 0; i < planes.length; i++) {
			if (planes[i] != null) {
				if (planes[i].getClass() == Cargo.class) {
					cargo = (Cargo) planes[i];
					cargo.loadCargo();
				}
			}
		}
	}

	public void getFighter() {
		Fighter fighter = new Fighter();
		for (int i = 0; i < planes.length; i++) {
			if (planes[i] != null) {
				if (planes[i].getClass() == Fighter.class) {
					fighter = (Fighter) planes[i];
					fighter.fight();
				}
			}
		}
	}

	public Jet[] getPlanes() {
		return planes;
	}

	public void setPlanes(Jet[] planes) {
		this.planes = planes;
	}
}
