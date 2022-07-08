package SeleniumVinay123;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotProgram {
	 
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\vanay_jarfiles\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        takeScreenShot("orangeHRM_LoginPage");
		
	}
public static void takeScreenShot(String fileName) throws IOException {
{
	//1.take screenshot and store it as a file format
File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//2.now copy the screenshot to desired location using copy file method
Files.copy(source,new File("C:\\Users\\Rajulapati VinayBabu\\eclipse-workspace\\BasicPrograms\\"
		+ "src\\SeleniumVinay123"+fileName+".jpg"));
}
}
}
