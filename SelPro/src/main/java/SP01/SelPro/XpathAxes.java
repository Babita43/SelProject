package SP01.SelPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);

//Descendant axes

		driver.findElement(By.xpath("//div[@id='container']/descendant::a[@class='_1jKL3b']")).click();
//driver.findElement(By.xpath("//div[@id='container']/descendant::a[@class='_1krdK5 vbCXhM']")).click();

		Thread.sleep(2000);

//		// Create new Account
////child axes
//		driver.findElement(By.xpath("//div[@class='ZJ3AS1']/child::a[@class='azBkHf']")).click(); // create new account
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//div[@class='I-qZ4M vLRlQb']/child::input[@class='r4vIwl BV+Dqf']"))
//				.sendKeys("912086213307");
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).submit();
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("123456");
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
		
		
	//	Login using phone no
		
		driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("9149950051");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='EpHS0A']/following-sibling::div[@class='LSOAQH']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='r4vIwl IX3CMV']")).sendKeys("677117");
		Thread.sleep(2000);

				driver.findElement(By.xpath("//button[@class='QqFHMw llMuju M5XAsp']")).click();
				Thread.sleep(5000);

//	driver.findElement(By.xpath("//div[@id='container']/descendant::input[@class='Pke_EE']")).sendKeys("Mobile");
//	Thread.sleep(3000);
//	
//
//	//Child xpath use
//	driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']/child::a[1]")).click();
//	Thread.sleep(3000);
//	
//	//parent xpath use
//	driver.findElement(By.xpath("//img[@title='Flipkart']/parent::a")).click();
//	
////	//following xpath - come after 
////	driver.findElement(By.xpath("//head/following::img[@alt='Top Offer']")).click();
////	Thread.sleep(3000);
//
////	//preceeding come before
////	driver.findElement(By.xpath("//a[@title='Login'][1]/preceding::head")).click();
//	
//	
//	//following sibling
//	// //div/div/following-sibling::a[@title='Login']
//	
//	//preceding sibling
//	////div/a/preceding-sibling::div[@class='_3jeYYh']
//	

	}
}
