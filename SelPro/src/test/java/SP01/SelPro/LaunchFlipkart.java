package SP01.SelPro;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFlipkart {
	@Test
	public void openFlipkartLink() {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	}

}
