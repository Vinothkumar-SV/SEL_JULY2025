package week3.day3;

import java.util.NoSuchElementException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Bike extends Vehicle {

	
	public void kickStart() {
		System.out.println("Bike kick started");
	}
	
	
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.start();
		bike.kickStart();
		bike.drive();
		bike.stop();
		bike.refuel();
		System.out.println("Bike operations completed successfully.");
		
		//inheritance is a relationship where one class (subclass) inherits properties and behaviors from another class (superclass).
		
		//Java example of inheritance
		//NoSuchElementException extends RuntimeException
		
		//Selenium example of inheritance
		 //ChromeDriver extends ChromiumDriver
		
		//Multi-level inheritance example
		//NoSuchElementException extends RuntimeException
		//RuntimeException extends Exception
		
		//Selenium example of multi-level inheritance
		//ChromeDriver extends ChromiumDriver
		//ChromiumDriver extends RemoteWebDriver
		ChromiumDriver driver = new ChromeDriver();
		
		
		
		
	}
	
}
