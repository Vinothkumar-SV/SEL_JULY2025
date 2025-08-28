package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	// popup alert (javascript alert
	// popup or message from the application to the user
	// it has two types
	// Modal dialog (html alert
	// non model dialog (html alert

	// model dialog (html alert

	// simple alert
	// it has only ok button

	// confirm alert

	// prompt alert

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/alert.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//h5[contains(text(),'Simple Dialog')]//following::span")).click();
		// simple alert
		// it has only ok button
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		String text = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text);

		
		
		// confirm alert
		driver.findElement(By.xpath("//h5[contains(text(),'Confirm Dialog')]//following::span")).click();

		System.out.println(alert.getText());

		alert.dismiss();
		String text2 = driver.findElement(By.id("result")).getText();
		System.out.println(text2);
		
		
		
		
		
		driver.findElement(By.xpath("//h5[contains(text(),'Prompt Dialog')]//following::span")).click();

		System.out.println(alert.getText());
		
		alert.sendKeys("Testleaf");

		alert.accept();
		String text3 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text3);

		
		//sweet Alert
		
		
		driver.findElement(By.xpath("//h5[contains(text(),'Sweet Alert (Simple Dialog)')]//following::span")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		
		
		
		
	}
}