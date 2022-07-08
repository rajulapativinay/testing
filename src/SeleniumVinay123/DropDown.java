package SeleniumVinay123;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\vanay_jarfiles\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
       By  AMAZONsearchbox_locator=By.cssSelector("select#searchDropdownBox");
		WebElement AMAZONsearchbox_element=driver.findElement(AMAZONsearchbox_locator);
		
		
		Select select=new Select(AMAZONsearchbox_element);
		select.selectByIndex(2);
		Thread.sleep(3000);

		select.selectByValue("search-alias=amazon-devices");
		Thread.sleep(3000);

		select.selectByVisibleText("Amazon Devices");
		Thread.sleep(3000);
List<WebElement>alloptiond=select.getOptions();
for(WebElement webElement : alloptiond) {
	
	String data=webElement.getText();
	
System.out.println(data);
if(data.equals("prime video"))
	select.deselectByVisibleText(data);
}
}
	
	

	

		
	}


