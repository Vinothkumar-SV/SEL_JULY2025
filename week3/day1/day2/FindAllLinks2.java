package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindAllLinks2 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Create new account")).click();
		// How wil you handle the dropDown in Selenium?

		// 1. Using Select class

		// 2. Using WebElement and click on the options

		// Using Select class

		// Step 1--locate the Element and convert as webelement
		WebElement element = driver.findElement(By.id("day"));
		// Step 2--Create an object for Select class
		Select obj = new Select(element);
		// Step 3--Select the value using selectByVisibleText, selectByValue,
		// selectByIndex
		obj.selectByIndex(17);

		// selecting Month using Select class
		WebElement month = driver.findElement(By.id("month"));
		Select monthObj = new Select(month);
		monthObj.selectByValue("3");

		// selecting Year using Select class
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		
		Select yearObj = new Select(year);
		yearObj.selectByVisibleText("1995");
		
		
		List<WebElement> options = yearObj.getOptions();
		
		for (int i = 0; i <options.size(); i++) {
			
			System.out.println(options.get(i).getText());
			
		}
		
		
		
		
		
		
		
		
		
		

//List<WebElement> elements = driver.findElements(By.tagName("a"));
//
//for (int i = 0; i < elements.size(); i++) {
//	
//	String text = elements.get(i).getText();
//	System.out.println(text);
//	
//}
//

	}

}
