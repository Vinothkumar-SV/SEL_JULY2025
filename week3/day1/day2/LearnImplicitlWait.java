package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnImplicitlWait {
	
	
	
	
	//absollute xpath -- /html/body/div[1]/div[2]/div/div[1]/form/div[1]/input
	//relative xpath -- //tagName[@attribute='value']

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
	
	
	//Xpath Basics
	//Attribute Based  --//tagName[@attribute='value'] 
	//index based    -- //tagName[@attribute='value'][index]
	//text based  -- //tagName[text()='value']
	// //a[text()='CRM/SFA']
	//contains based -- //tagName[contains(@attribute,'value')]
	
	
	
	
	
	//Xpath Advanced

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Leaf");
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
