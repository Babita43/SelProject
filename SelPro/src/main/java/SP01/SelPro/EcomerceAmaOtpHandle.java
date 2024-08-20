package SP01.SelPro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonOtpHandle {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//		// Create new Account
		driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Thread.sleep(1000);
		driver.findElement(By.linkText("Start here.")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_email_login")).sendKeys("25132");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
		Thread.sleep(1000);
		ele.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@role='listbox']/li/a[@id='claim-input-dropdown-select-element_244']"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.className("a-button-input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-labelledby='intention-submit-button-announce']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@placeholder='First and last name']")).sendKeys("Park Jimin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(1000);

		

	}

	
}
