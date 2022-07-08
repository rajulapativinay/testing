package SeleniumVinay123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBOOKlogin {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\vanay_jarfiles\\chromedriver.exe\\");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.facebook.com/");

By facebook_locator=By.xpath("//input[@type='text']");
WebElement facebook_element=driver.findElement(facebook_locator);
facebook_element.sendKeys("vinaybabu093");



By facebook_passlocator=By.xpath("//input[@type='password']");
WebElement facebook_passelement=driver.findElement(facebook_passlocator);
facebook_passelement.sendKeys("vinay439");


By facebook_btnlocator=By.xpath("//button[@value='1']");
WebElement facebook_btnelement=driver.findElement(facebook_btnlocator);
facebook_btnelement.click();
	}

}
