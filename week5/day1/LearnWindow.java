package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags", Keys.ENTER);
		driver.findElement(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']"))
				.click();

		String windowHandle = driver.getWindowHandle();

		System.out.println(windowHandle);


		Set<String> windowHandles = driver.getWindowHandles();

		List<String> listHandles = new ArrayList<String>(windowHandles);

		driver.switchTo().window(listHandles.get(1));

		String text = driver.findElement(By.id("productTitle")).getText();

		System.out.println(text);

	}

}
