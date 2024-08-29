package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());

driver.close(); // it only closes the first open browser window of browser but full browser does not close and webdriver session remains open
driver.quit();// it closes all browsers and end the webdriver session 
	}

}
