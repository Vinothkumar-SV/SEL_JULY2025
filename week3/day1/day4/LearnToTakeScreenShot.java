package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToTakeScreenShot {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// take Screenshot

		// Step1
		File sorce = driver.getScreenshotAs(OutputType.FILE);

		// Step2
		File destination = new File("./screenShot/image.png");

		// Step3
		FileUtils.copyFile(sorce, destination);

	}

}
