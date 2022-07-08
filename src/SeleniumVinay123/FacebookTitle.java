package SeleniumVinay123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\vanay_jarfiles\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        By facebookusername_locator= By.xpath("//*[@id=\"email\"]");
        WebElement facebookusername_element=driver.findElement(facebookusername_locator);
        facebookusername_element.sendKeys("rajulapativinaybabu@gmail.com");
        
        
        By facebookpassword_locator= By.xpath("//*[@id=\"pass\"]");
        WebElement facebookpassword_element=driver.findElement(facebookpassword_locator);
        facebookpassword_element.sendKeys("vinay439");
        
        By facebookloginbtn_locator= By.xpath("//*[@id=\"u_0_d_U6\"]");
        WebElement facebookloginbtn_element=driver.findElement(facebookloginbtn_locator);
        facebookloginbtn_element.click();
        
        driver.close();
        }
}
