package SeleniumVinay123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiffrenttypesLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\vanay_jarfiles\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	
	
	By ebaysearchbox_locator=By.xpath("//input[@type='text']");
	WebElement captcha_element=driver.findElement(ebaysearchbox_locator);
	captcha_element.sendKeys("craft");
	
	By ebayregisterbox_locator=By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a");
	WebElement ebayregisterbox_element=driver.findElement(ebayregisterbox_locator);
	ebayregisterbox_element.click();
	
	By ebaycamera_locator=By.xpath("//span[text()='Cameras & Photo']");
	WebElement ebaycamera_element=driver.findElement(ebaycamera_locator);
	ebaycamera_element.click();
	
	}

}
