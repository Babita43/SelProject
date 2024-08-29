package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAndGet {
public static void main(String []args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	driver.navigate().to("https://www.amazon.in/");

	driver.navigate().back();
	

driver.navigate().refresh();


	driver.navigate().forward();
	

	driver.quit();
}
}
