package SeleniumVinay123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\vanay_jarfiles\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/signin/chrome/sync/identifier?ssp=1&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifDesktopChromeSync");
	By facebookloginbtn_locator=By.xpath("//input[@autocomplete='username']");
	WebElement facebookloginbtn_element=driver.findElement(facebookloginbtn_locator);
	facebookloginbtn_element.sendKeys("rajulapativinaybabu@gmail.com");
	
	By facebookforgotemail_locator=By.xpath("//button[@jsname='Cuz2Ue']");
	WebElement facebookforgotemail_element=driver.findElement(facebookforgotemail_locator);
	facebookforgotemail_element.click();
	
	By facebookbackground_locator=By.xpath("//iframe[@id='backgroundImage']");
	WebElement facebookbackground_element=driver.findElement(facebookbackground_locator);
	
	}

}
