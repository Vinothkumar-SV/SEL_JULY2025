package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintSecondLargest {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile", Keys.ENTER);

		List<Integer> emt = new ArrayList<Integer>();
		
		
		List<WebElement> elements = driver.findElements(By.className("a-price-whole"));
		for (int i = 0; i < elements.size(); i++) {
			String text = elements.get(i).getText().replaceAll(",", "");
			String replaceAll = text.replaceAll("\\s", "");

			int int1 = Integer.parseInt(replaceAll);
			// remove Spaces

			
			emt.add(int1);
			
			Collections.sort(emt);
			
			
			// Collections.reverse(emt);
		}
		System.out.println(emt);

	}

}
