package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProgramKeyControl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//a[@class='_1jKL3b']")).click();
Actions a = new Actions(driver);
WebElement src =driver.findElement(By.xpath("//a[@class='wsejfv']"));
WebElement des =driver.findElement(By.xpath("//a[@class='yFCbwN']"));
a.dragAndDrop(src, des).build().perform();



Thread.sleep(1000);

driver.quit();
	}

}
