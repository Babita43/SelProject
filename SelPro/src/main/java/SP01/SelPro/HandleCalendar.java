package SP01.SelPro;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCalendar {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//Lightbox handled
		
		
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

//Select the month 
		
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//input[@id='departure']"))).click().perform();
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
		System.out.println(text);
		while (!text.contains("September")) {
			Thread.sleep(1000);

			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			break;
		}
		Thread.sleep(1000);
		System.out.println("Hurray! Found September");
		
		

//		//Select the date directly by xpath
//		
//	    //	List<WebElement> lists = 
//				driver.findElement(By.xpath("(//div[@class='dateInnerCell']/p[contains(text(),'21')])[2]")).click();
//				Thread.sleep(3000);

		
		
		// loop to find date
		List<WebElement> date = driver.findElements(By.xpath("//div[@class='dateInnerCell']/p[1]"));

		for (int i = 32; i < date.size(); i++) {
			if (date.get(i).getText().equalsIgnoreCase("21")) {

				date.get(i).click();
				Thread.sleep(3000);
				break;
			}

		}

		driver.quit();

	}

}
