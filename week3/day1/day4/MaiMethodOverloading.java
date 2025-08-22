package week3.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaiMethodOverloading {

	
	
	
	public static void main(float[] args) {
System.out.println("float array main method");
	}
	
	
	public static void main(String[] args) {
System.out.println("String array main method");

ChromeDriver driver = new ChromeDriver();
//driver.switchTo().frame();

	}

	public static void main(boolean[] args) {

		System.out.println("boolean array main method");
	}

	public static void main(int[] args) {
System.out.println("int array main method");
	}

	public static void main(char[] args) {
System.out.println("char array main method");
	}



}
