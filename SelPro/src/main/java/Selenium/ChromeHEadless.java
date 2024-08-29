package Selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHEadless {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--start-maximized");
		op.addArguments("-incognito");

		// op.addArguments("--window-size=800,200");

		// op.addArguments("--headless");
		
		// headless means it does not UI and perform the program , due to UI does not
		// show its performance is fast
		// drawback of headless is we can not do UI testing with it

		// op.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		// Set Load stategy is of 3 types
		// 1. Normal (it waits for all the resources eg. the logo, images to load,
		// 2. Eager will wait for element to interact with
		// None will wait see element and interact

		WebDriver driver = new ChromeDriver(op);
		Thread.sleep(2000);
		System.out.println("HI");
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();

	}

}
