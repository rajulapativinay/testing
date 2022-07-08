package SeleniumVinay123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators123 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\vanay_jarfiles\\msedgedriver.exe\\");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		/*By redbusticket_locator=By.xpath("a#redBus");
		WebElement redbusticket_element=driver.findElement(redbusticket_locator);
		redbusticket_element.click();*/
		
		
		
		By redbus_fromlocator=By.xpath("//input[@id='src']");
		WebElement redbus_fromelement=driver.findElement(redbus_fromlocator);
		redbus_fromelement.sendKeys("Vijayawada");
		
		
		By redbus_tolocator=By.xpath("//input[@id='dest']");
		WebElement redbus_toelement=driver.findElement(redbus_tolocator);
		redbus_toelement.sendKeys("Hyderabad");
		
		By searchbtn_locator=By.xpath("//button[@id='search_btn']");
		WebElement searchbtn_element=driver.findElement(searchbtn_locator);
		searchbtn_element.click();
		
		
		
	}

}
