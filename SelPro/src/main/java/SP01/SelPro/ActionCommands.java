package SP01.SelPro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = WebDriverManager.chromedriver().create();
driver.get("https://www.flipkart.com/");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//Action is predefined class of selenium webdriver, it is used to stimulate keyboard and mouse 

Actions a = new Actions(driver);
a.moveToElement(driver.findElement(By.xpath("//a/span[text()='Login']"))).perform();
Thread.sleep(1000);
a.moveToElement(driver.findElement(By.className("_1jKL3b"))).click().perform();
Thread.sleep(1000);


driver.get("https://www.amazon.in/");
Actions a1= new Actions(driver);

WebElement ele=driver.findElement(By.xpath("//html[@data-platform='Win32']"));
a1.moveToElement(ele).perform();
Thread.sleep(1000);

a1.moveToElement(ele, 0, 250).perform();
Thread.sleep(1000);

	}

	
}
