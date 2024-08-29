package SP01.SelPro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		Actions a = new Actions(driver);

		
		//Program for copy and paste using keys
		
		// Entered the user name

		WebElement ele = driver.findElement(By.xpath("//form[@name='form1']//input[@type='text']"));
		ele.sendKeys("Babes");
		a.doubleClick(ele).perform(); // selected the username using double click
		Thread.sleep(1000);
		ele.sendKeys(Keys.chord(Keys.CONTROL, "c")); // copy the username
		driver.findElement(By.xpath("//form[@name='form1']//input[@type='password']"))
				.sendKeys(Keys.chord(Keys.CONTROL, "v")); // pasted the username
		Thread.sleep(2000);
		a.sendKeys(Keys.TAB); // clicked the tab key to Login button
		Thread.sleep(2000);

		driver.findElement(By.xpath("//form[@name='form1']//button[@value='LogIn']")).click();
		Thread.sleep(2000);

	}

}
