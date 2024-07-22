package SP01.SelPro;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectiveDropdown {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//Lightbox handled
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//label[@for='fromCity']"))).click().perform();

		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune");
		Thread.sleep(2000);
//driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-3']")).click();
		int i = 0;
// Stimulate keyboard key down
		while (i < 4) {
			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.DOWN);
			i++;
		}

////Stimulate keyboard key UP

//int j = 2;
//
		
//while(j>=0) {
//	Thread.sleep(2000);
//
//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.UP);
//i--;
//}

		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src, new File("Screenshots\\AutoSelectiveDropdown.jpeg"));

	}

}
