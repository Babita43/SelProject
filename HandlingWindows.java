package SP01.SelPro;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
//
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Webdriver is an interface
		//Chromedriver is predefined class is selenium
		// Chromedriver is the child casss of webdriver interface\
		// we can not create object of interface so we used chromedriver child class of interface
		//ChromeDriver() is method callinf statement that launches the chrome browser
		WebDriverManager.chromedriver().setup();		
WebDriver driver = new ChromeDriver();
driver.get("https://omayo.blogspot.com/");
driver.manage().window().maximize();
driver.findElement(By.linkText("Open a popup window")).click();
Thread.sleep(2000);
driver.findElement(By.linkText("Blogger")).click();
//WebElement ele = driver.findElement(By.linkText("Login")); // id 
//By is predefined class of web interface
//name(), id() these are predefined static methods of selenium
//to accesss the static mehtods we use class e.g By.id();
//findelement has return type Webelement
//ele.click();
//ele.sendKeys("Koua");
//
//driver.findElement(By.name("pass")).click(); //by name 
//driver.findElement(By.linkText(""));

Set<String> windoids = driver.getWindowHandles();
Iterator<String> itr = windoids.iterator(); //Iterating through all the window ids
//while(itr.hasNext()){  // it will check is there another window id then it will be true and search
//	String win = (String) itr.next();
//	System.out.println(win);
//**************** the above code is sused to iterate teh windows id and to retrive the ids for windowa

//	String mainwin = itr.next();
//	Thread.sleep(2000);
//	String childwin = itr.next();
//	driver.switchTo().window(childwin);
////	driver.findElement(By.linkText("New Window"));
//	Thread.sleep(2000);
//	driver.close(); // if we close the child window main window will not close for this switch to main window 
//	Thread.sleep(2000);
//	driver.switchTo().window(mainwin);// only then it will be closed because the focue will on it
//	Thread.sleep(2000);
//============================================
while(itr.hasNext())
{
String winid	= itr.next();
	driver.switchTo().window(winid);
	if(driver.getTitle().equals("New WindowA"))
	{
		System.out.println("Hi :) ");
	}
	else {
		System.out.println("solly :(");
	}
}



//	driver.close();
	//driver.quit();
//	}
	}

}
