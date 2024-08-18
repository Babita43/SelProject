package SP01.SelPro;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = WebDriverManager.chromedriver().create();
driver.get("https://omayo.blogspot.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.manage().window().maximize();

//Printing all the table head data

List<WebElement> tableHeading = driver.findElements(By.xpath("//thead/tr[1]"));
for(int i=0; i< tableHeading.size();i++)
{
	System.out.println("Table heading data is here : " + tableHeading.get(i).getText());
}
System.out.println("  ");

//print first row first column data
List<WebElement> headFirstData = driver.findElements(By.xpath("//thead/tr[1]/th[1]"));
for(int i=0; i< headFirstData.size();i++)
{
	System.out.println("Data of first row 1X1 : " +headFirstData.get(i).getText());
}

System.out.println("  ");
//Printing the all the table rows data

List<WebElement> rowsdata = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
for(int i=0;i<rowsdata.size();i++)
{
	System.out.println("Data data of all the rows of tbody : "+rowsdata.get(i).getText());
}
System.out.println("  ");

//Printing the second row for 2 X 1

List<WebElement> row = driver.findElements(By.xpath("(//tbody/tr[1]/td)[1]"));
for(int i=0;i<row.size();i++)
{
	System.out.println("Priting the data of 2x1 : "+row.get(i).getText());
}


//program to find the name of the place

List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1']//td[1]"));
String name = "Praveen";

int row2 =0;
for(int i= 1; i<names.size();i++)
{
	if(names.get(i).getText().equals(name))
{
	row2=i;
}
	
}

String place = "//table[@id='table1']//tr["+(row2+1)+"]//td[3]";
System.out.println(driver.findElement(By.xpath(place)).getText());


	}

}

