package activities;

public class Activity1 {
	public static void main(String[] args) {

		Car carName = new Car();
		carName.make = 2014;
		carName.color = "Black";
		carName.transmission = "Manual";

		carName.displayCharacteristics();
		carName.accelerate();
		carName.brake();
	}

}

class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;

	Car() {
		tyres = 4;
		doors = 4;
	}

	public void displayCharacteristics() {
		System.out.println("color of the car:" + color);
		System.out.println("Make of the Car:" + make);
		System.out.println("Transmission of the car:" + transmission);
		System.out.println("Number of doors on the car: " + doors);
		System.out.println("Number of tyres on the car: " + tyres);
	}

	public void accelerate() {
		System.out.println("Car is Moving.");
	}

	public void brake() {
		System.out.println("Car has stopped.");
	}

}
