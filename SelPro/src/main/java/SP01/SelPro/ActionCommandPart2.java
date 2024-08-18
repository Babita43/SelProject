package SP01.SelPro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionCommandPart2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		Actions a = new Actions(driver);

		// KeyCommand to open link in different tab (we use ctrl key and than click link
		// to open in new browser, for this we use actions

		WebElement e1 = driver.findElement(By.linkText("compendiumdev"));
		a.keyDown(Keys.CONTROL).click(e1).perform();

		// double click command     
//Check this code again ******
		WebElement ele = driver.findElement(By.xpath("//form[@name='form1']//input[@type='text']"));
		Thread.sleep(2000);

		ele.sendKeys("Babes");
		Thread.sleep(2000);

		a.doubleClick(ele).perform();
		Thread.sleep(1000);

//		Use of tab key and Enter key
		// double click command

		driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("Jin");
		a.sendKeys(Keys.TAB).perform();
		driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys("546");
		Thread.sleep(2000);
		a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
// Press 2 keys together
		WebElement c =driver.findElement(By.xpath("//input[@name='textboxn']"));
		c.sendKeys("Hello");
		Thread.sleep(2000);

		a.doubleClick(c);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='textboxn']")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
		Thread.sleep(2000);

		driver.findElement(By.xpath("//form[@name='form1']//input[@type='text']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		Thread.sleep(2000);

		
		// drag and drop command
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		WebElement el1 = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement el2 = driver.findElement(By.xpath("//div[@id='box105']"));

		a.dragAndDrop(el1, el2).perform();
		Thread.sleep(2000);

	}

}
