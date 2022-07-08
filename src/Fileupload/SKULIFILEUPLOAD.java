package Fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SKULIFILEUPLOAD {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver", "D:\\vanay_jarfiles\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		By demo_registration_locator=By.xpath("//input[@id='imagesrc']");
		WebElement demo_registration_locator_element=driver.findElement(demo_registration_locator);
		demo_registration_locator_element.click();
		
		
		String imagesFilepath="E:\\images\\Filename.png\\";
		String inputFilepath="E:\\images\\Files.png.png\\";
		
		Screen s=new Screen();
		Pattern fileInputTextbox=new Pattern(imagesFilepath+"Files.PNG");
		Pattern openButton=new Pattern(imagesFilepath+"OpenButton.PNG");
		Thread.sleep(3000);
		
		
		s.wait(fileInputTextbox,20);
		s.type(fileInputTextbox,inputFilepath+"apple.jpg.jpg");
		s.click(openButton);

	}

}
