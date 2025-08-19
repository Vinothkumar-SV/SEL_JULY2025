package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownActivity {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml");

		WebElement element = driver.findElement(By.className("ui-selectonemenu"));

		Select obj = new Select(element);

		obj.selectByVisibleText("Selenium");

		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		List<WebElement> elements = driver.findElements(
				By.xpath("//li[contains(@class,'ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all')]"));
//		
//		System.out.println( elements.get(0).getText());
//		System.out.println( elements.get(0).getText());
//		System.out.println( elements.get(0).getText());
//		System.out.println( elements.get(0).getText());
//		System.out.println( elements.get(0).getText());
		for (int i = 0; i < elements.size(); i++) {
			String text = elements.get(i).getText();
			System.out.println(text);

		}

	}

}
