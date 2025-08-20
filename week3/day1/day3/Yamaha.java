package week3.day3;

public class Yamaha extends Bike {
	
	
	
	
	
	
	public void sportsMode() {
		System.out.println("Yamaha sports mode activated");
	}
	
	public void cruiseControl() {
		System.out.println("Yamaha cruise control enabled");
	}
	public void antiLockBraking() {
		System.out.println("Yamaha anti-lock braking system engaged");
	}
	public void bluetoothConnectivity() {
		System.out.println("Yamaha Bluetooth connectivity established");
	}
	
	public static void main(String[] args) {
		
		Yamaha yamaha = new Yamaha();
		yamaha.start();
		yamaha.kickStart();
		yamaha.sportsMode();
		yamaha.cruiseControl();
		yamaha.antiLockBraking();
		yamaha.bluetoothConnectivity();
		yamaha.drive();
		yamaha.stop();
		yamaha.refuel();
		System.out.println("Yamaha operations completed successfully.");
		System.out.println("Yamaha bike is ready for a thrilling ride!");
	}

}
