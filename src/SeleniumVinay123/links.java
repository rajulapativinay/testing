package SeleniumVinay123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\vanay_jarfiles\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		By orangeHRMusername_locator=By.xpath("//input[@name='txtUsername']");
		WebElement orangeHRMusername_element=driver.findElement(orangeHRMusername_locator);
		orangeHRMusername_element.sendKeys("admin");

		By orangeHRMpass_locator=By.xpath("//input[@name='txtPassword']");
		WebElement orangeHRMpass_element=driver.findElement(orangeHRMpass_locator);
		orangeHRMpass_element.sendKeys("admin123");
		
		
		By orangeHRMbtn_locator=By.cssSelector("input[type='submit']");
		WebElement orangeHRMbtn_element=driver.findElement(orangeHRMbtn_locator);
		orangeHRMbtn_element.click();

		
		
		By Admin_locator=By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b");
		WebElement Admin_element=driver.findElement(Admin_locator);
		Admin_element.click();
		
		By PIM_locator=By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b");
		WebElement PIM_element=driver.findElement(PIM_locator);
		PIM_element.click();
		
		By PIM_username_locator=By.xpath("//input[@name='empsearch[employee_name][empName]']");
		WebElement PIM_username_element=driver.findElement(PIM_username_locator);
		PIM_username_element.sendKeys("Rajulapati vinay babu");
		
		By PIM_userid_locator=By.xpath("//input[@name='empsearch[id]']");
		WebElement PIM_userid_element=driver.findElement(PIM_userid_locator);
		PIM_userid_element.sendKeys("1024");
		
		
		
		
		
		By PIM_checkbox_locator=By.xpath("//input[@id='ohrmList_chkSelectRecord_54']");
		WebElement PIM_checkbox_element=driver.findElement(PIM_checkbox_locator);
		PIM_checkbox_element.isSelected();
		


	}

}
