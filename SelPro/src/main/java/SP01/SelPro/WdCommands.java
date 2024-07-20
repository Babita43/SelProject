package SP01.SelPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WdCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();

		driver.get("https://www.flipkart.com/");

		String str = driver.getTitle(); // getTitle method is used to get the title of the current webpage
		System.out.println("The title of the page is :" + str);

		String str1 = driver.getCurrentUrl();// getCurrentUrl is used to retrieve the url of current webpage
		System.out.println("Current url is: " + str1);

		String str2 = driver.findElement(By.id("jsonLD")).getAttribute("type"); // getAttribute() Used to retrieve the
																				// value stored in the specified
																				// attribute value of the html element
		System.out.println("Attribute of this id is " + str2);

		boolean bool = driver.findElement(By.className("_1XjE3T")).isDisplayed(); // isDisplayed method is used to check
																					// the element is visible or not
																					// (there are 3 tyoes viisbity
																					// Visible and enabled , visible and
																					// disabled and hiddem
		System.out.println("the text Mobile is Visible: " + bool);

		// navigate.to("url") use to go to given url, navigate.back use to go back to
		// previous url, navigate refresh refreshes the page
		driver.navigate().to(
				"https://www.flipkart.com/security-software/pr?sid=6bo%2C5hp%2Clwb&p%5B%5D=facets.discount_range_v1%255B%255D%3D80%2525%2Bor%2Bmore&param=345678&hpid=0WeKvZLUIVi-EiBgerbI9ap7_Hsxr70nj65vMAAFKlc%3D&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InZhbHVlQ2FsbG91dCI6eyJtdWx0aVZhbHVlZEF0dHJpYnV0ZSI6eyJrZXkiOiJ2YWx1ZUNhbGxvdXQiLCJpbmZlcmVuY2VUeXBlIjoiVkFMVUVfQ0FMTE9VVCIsInZhbHVlcyI6WyJGcm9tIOKCuTI5Il0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fSwiaGVyb1BpZCI6eyJzaW5nbGVWYWx1ZUF0dHJpYnV0ZSI6eyJrZXkiOiJoZXJvUGlkIiwiaW5mZXJlbmNlVHlwZSI6IlBJRCIsInZhbHVlIjoiU0VDRlVNWVlNRVczSkpaSCIsInZhbHVlVHlwZSI6IlNJTkdMRV9WQUxVRUQifX0sInRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIkJlc3QgU2VsbGluZyBTZWN1cml0eSBTb2Z0d2FyZSJdLCJ2YWx1ZVR5cGUiOiJNVUxUSV9WQUxVRUQifX19fX0%3D");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.getPageSource();

		driver.navigate().refresh();
		Thread.sleep(2000);

		driver.quit();
	}

}
