package week3.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	public static void main(String[] args) {
	
		

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Find all links on the page
		
	List<WebElement> elements = driver.findElements(By.tagName("a"));
	
	
	for (int i = 0; i <elements.size(); i++) {
		
		String text = elements.get(i).getText();
		
		System.out.println(text);
		
	}
	
		
		
		
		
	
	}
	
}
