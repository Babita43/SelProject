package SP01.SelPro;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleAlertDropdownMultiselection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://omayo.blogspot.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//Method to handle alerts 

driver.findElement(By.id("alert1")).click();
Thread.sleep(1000);
Alert alert = driver.switchTo().alert();  //alert is an interface and getText,accept(),dismiss() are preddefined method i+of it 
Thread.sleep(1000);
String getText = alert.getText();
System.out.println("the text we got is : " + getText);
Thread.sleep(1000);
//alert.accept();
alert.dismiss();

//Handle dropdown 

Thread.sleep(1000);
 WebElement ele = driver.findElement(By.id("drop1"));
 // driver.findElement(By.id("drop1")).sendkeys("drop 2");   *****this code is not correct approach for dropdown
 //SELECT prededined  class used to select from the dropdown 
 
 Select sel = new Select(ele);
//sel.selectByIndex(2);
//sel.selectByVisibleText("doc 3"); 
sel.selectByValue("mno");

Thread.sleep(1000);

//Handle Multiselection

WebElement ele1 = driver.findElement(By.id("multiselect1"));
Select sel1 = new Select(ele1);
Thread.sleep(1000);
sel1.selectByVisibleText("Volvo");
Thread.sleep(1000);
sel1.selectByIndex(3);
Thread.sleep(1000);
sel1.selectByValue("Hyundaix");
Thread.sleep(1000);
sel1.deselectAll();

Thread.sleep(1000);


driver.quit();
	}

}

