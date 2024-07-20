package SP01.SelPro;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WaitingMechanism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		// Implicit waits for globally (dynamically) call it global wait because it applies for all the elements 
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//there are 100 elements , but assume there is some element that takes 30 secs to appear element or if due to some issue element did not found then 
       // the it will take 30secs to show the error that element not found or if time is less it will show " Unable to locate element"
		
		
		//it will take 0sec to appear this element
		driver.findElement(By.className("dropbtn")).click();
		
		//From dropdownlist it takes 3 minutes to show so I will be using thread.sleep() method of java
		
	/*	try {
			Thread.sleep(10000); // but I have mentioned 10 secs so it wasted 7 mins more to overcome this we used implicit wait
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
		// it takes 3 seconds to appear element
	//	driver.findElement(By.linkText("Facebook")).click();
		long startTime = System.currentTimeMillis();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook"))).click();
		long endTime = System.currentTimeMillis();
		long totalTimeTaken = endTime-startTime/1000;
		System.out.println(totalTimeTaken);
		driver.quit();
	}

}
