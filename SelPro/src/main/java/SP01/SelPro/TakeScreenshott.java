package SP01.SelPro;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshott {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = WebDriverManager.chromedriver().create();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Capture Screenshot of fullscreen

		TakesScreenshot tc = ((TakesScreenshot) driver); // Takesscreenshot is interface so is driver ,so we typecasted
															// the takesscreenshot
		File src = tc.getScreenshotAs(OutputType.FILE);
		File location = new File(".\\Screenshots\\Homepage.png");
		FileUtils.copyFile(src, location);

		// OR SHORT LIINES FOR SCREENSHOT
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File(".\\Screenshots\\test.png"));

		// Capture screenshot of particular section of screen{LOGO}

		WebElement logo = driver.findElement(By.xpath("//img[@title='Flipkart']"));
		File src1 = logo.getScreenshotAs(OutputType.FILE);
		File location1 = new File(".\\Screenshots\\logo.jpeg");
		FileUtils.copyFile(src1, location1);

		// capture login section

		driver.findElement(By.xpath("//a[@class='_1jKL3b']")).click();
		WebElement LoginScrn = driver.findElement(By.xpath("//div[@class='Sm1-5F col col-3-5']"));
		File src3 = LoginScrn.getScreenshotAs(OutputType.FILE);
		File location3 = new File(".\\Screenshots\\LoginScrn.jpeg");
		FileUtils.copyFile(src3, location3);

//		// Capture screenshot of particular section of screen{LOGO}
//		Actions a = new Actions(driver);
//
//		a.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Login']"))).perform();
//
//		WebElement sec = driver.findElement(By.xpath("//li[normalize-space()='My Profile']"));
//
//		a.moveToElement(sec).perform();
//		File src2 = sec.getScreenshotAs(OutputType.FILE);
//		File location2 = new File(".\\Screenshots\\sec.jpeg");
//		FileUtils.copyFile(src2, location2);

	}

}
