package SP01.SelPro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleIframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver  driver =WebDriverManager.chromedriver().create();
driver.get("https://www.amazon.in/");
Thread.sleep(1000);
driver.manage().window().maximize();

//to find the no of frames used in page  //here we use element to find through the multiple elements 
System.out.println(driver.findElements(By.tagName("iframe")).size()); 


driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//Find the frame id and switch to frames

WebElement ele = driver.findElement(By.id("ape_Gateway_right-2_desktop_iframe"));
driver.switchTo().frame(ele);
Thread.sleep(1000);

driver.findElement(By.xpath("a[@class='clickthrough']")).click();
Thread.sleep(1000);

//after workign on iframes to go back in main page switch to default page
driver.switchTo().defaultContent();
	}

}
