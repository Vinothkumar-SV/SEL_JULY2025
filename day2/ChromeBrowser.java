package week1.day2;

public class ChromeBrowser {

	// Learn DataTypes
	// Primitive Data Types: int, float, double, char, boolean

	String carName = "BMW";
	int noOfWheels = 4;
	float engineCapacity = 3.0f; // 'f' is used to denote float literal
	double price = 50000.99;
	long vinNumber = 12345678901234567L; // 'L' is used to denote long literal
	char symbol = 'B'; // single quotes for char
	boolean isAcOn = false; // true or false for boolean

	public void carData() {
		System.out.println("Car Name: " + carName);
		System.out.println("Car Name: " + noOfWheels);
		System.out.println("Car Name: " + engineCapacity);
		System.out.println("Car Name: " + price);
		System.out.println("Car Name: " + vinNumber);
		System.out.println("Car Name: " + symbol);
		System.out.println("Car Name: " + isAcOn);

		System.out.println("-------------------------Print using Single sysout-------------------------");
		System.out.println(carName + "\n" + noOfWheels + "\n" + engineCapacity + "\n" + price + "\n" + vinNumber + "\n"
				+ symbol + "\n" + isAcOn);
	}

	public static void main(String[] args) {
		ChromeBrowser obj = new ChromeBrowser();

		obj.carData();

	}
}
