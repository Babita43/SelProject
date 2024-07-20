package SP01.SelPro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartOtpHandle {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.flipkart.com/");
		
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		// Create new Account
driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']/child::a[@class='_1TOQfO']")).click(); 

//child axes
	driver.findElement(By.xpath("//div[@class='ZJ3AS1']/child::a[@class='azBkHf']")).click(); 
		Thread.sleep(2000);

	driver.findElement(By.xpath("//div[@class='I-qZ4M vLRlQb']/child::input[@class='r4vIwl BV+Dqf']"))
			.sendKeys("2513256217");       // enter phone no
	Thread.sleep(2000);

driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).submit();    // continue button
	Thread.sleep(2000);


	}
	
	}


