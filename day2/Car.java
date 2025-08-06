package week1.day2;

public class Car {
	// syntax for method declaration
	// AccessModifiers returnType methodName(){
	// }

	// Static:
	// staticis a keyword in Java that is used to
	// indicate that a particular member (variable or method) belongs to the class
	// itself,
	// rather than to instances of the class.

	public void applyBrake() {
		System.out.println("Apply Brake");
	}

	public void soundHorn() {
		System.out.println("Sound Horn");
	}

	public void applyGear() {
		System.out.println("Apply Gear");
	}

	public void switchOnAc() {
		System.out.println("Switch on AC");
	}

	public void applyAccelerator() {
		System.out.println("Apply Accelerator");
	}

	public void applyClutch() {
		System.out.println("Apply Clutch");
	}

	public void switchOffAc() {
		System.out.println("Switch off AC");
	}

	public void switchOffEngine() {
		System.out.println("Switch off Engine");
	}

	public void switchOnEngine() {
		System.out.println("Switch on Engine");
	}

	public void openDoor() {
		System.out.println("Open Door");
	}

	public void closeDoor() {
		System.out.println("Close Door");
	}

	public void startCar() {
		System.out.println("Start Car");
	}

	public void stopCar() {
		System.out.println("Stop Car");
	}

	public void driveCar() {
		System.out.println("Drive Car");
	}

	public void parkCar() {
		System.out.println("Park Car");
	}

	public void turnOnHeadlights() {
		System.out.println("Turn on Headlights");
	}

	public void turnOffHeadlights() {
		System.out.println("Turn off Headlights");
	}

	public void openTrunk() {
		System.out.println("Open Trunk");
	}

	public void closeTrunk() {
		System.out.println("Close Trunk");
	}

	public void adjustMirrors() {
		System.out.println("Adjust Mirrors");
	}

	public void checkTirePressure() {
		System.out.println("Check Tire Pressure");
	}

	public void refuel() {
		System.out.println("Refuel the car");
	}

	public static void main(String[] args) {

		TestLa.autoPilot();

		BMW bmw = new BMW();
		bmw.engineSpeed();

		Car car = new Car();

		car.openDoor();
		car.closeDoor();
		car.switchOnEngine();
		car.applyGear();
		car.startCar();
		car.driveCar();
		car.applyAccelerator();
		car.applyBrake();
		car.stopCar();
		car.switchOffEngine();
		car.closeDoor();

		System.out.println("Car operations completed successfully.");

		// Additional operations
		car.turnOnHeadlights();
		car.adjustMirrors();
		car.checkTirePressure();
		car.refuel();

		System.out.println("All car operations executed.");
	}
}
