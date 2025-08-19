package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateLead2 {

	/*
	 * Assignment 1:Create Lead 1. Launch URL
	 * "http://leaftaps.com/opentaps/control/login"
	 * 
	 * 
	 * 
	 * 2. Enter UserName and Password Using Id Locator
	 * 
	 * 3. Click on Login Button using Class Locator
	 * 
	 * 4. Click on CRM/SFA Link
	 * 
	 * 5. Click on Leads Button
	 * 
	 * 6. Click on create Lead Button
	 * 
	 * 7. Enter CompanyName using id Locator
	 * 
	 * 8. Enter FirstName using id Locator
	 * 
	 * 9. Enter LastName using id Locator
	 * 
	 * 10. Select value as Employee in Source Using SelectbyVisible text
	 * 
	 * 11. Select value as Pay Per Click Advertising in MarketingCampaignId Using
	 * SelectbyValue
	 * 
	 * 
	 * 13. Select value as Corporation in OwnerShip field Using SelectbyIndex
	 * 
	 * 14. Select value as India in Country Field Using SelectbyVisibletext
	 * 
	 * 15. Click on create Lead Button Using name Locator
	 * 
	 * 16. Get the Title of the resulting Page
	 */

	//implicit wait -- 
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//it is a global wait
	//it will applicable both FindElement and  FindElements in the page
	//if the element is not found within the time, 
	//it will throw NoSuchElementException
	// if the element is found before the time,
	//it will skips the remaining time and proceed with the next step
	
	
	
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");//30 -1  Skips  -29
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");//30
		driver.findElement(By.className("decorativeSubmit")).click();//30
		driver.findElement(By.partialLinkText("CRM")).click();//30
		Thread.sleep(1000); // Sleep for 1 second to ensure the page loads completely
		
		
		
		driver.findElement(By.linkText("Leads")).click();//30
		WebElement element2 = driver.findElement(By.linkText("Create Lead"));
		//Actions action = new Actions(driver);
		//action.click(element2).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element2));
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		element2.click();
		
		
		
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Leaf");
		
		//Fluent Wait
		//FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		//.withTimeout(Duration.ofSeconds(30))
		//.pollingEvery(Duration.ofSeconds(5))
		//.ignoring(NoSuchElementException.class);
		//WebElement source = wait.until(ExpectedConditions.elementToBeClickable(By.id("createLeadForm_dataSourceId")));
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		source.click();
		
		
		WebElement element = driver.findElement(By.name("submitButton"));
		element.click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TestLeaf")) {
			System.out.println("Lead created successfully with company name: " + text);
		} else {
			System.out.println("Lead creation failed or company name mismatch.");

		}

		driver.quit();

	}

}
