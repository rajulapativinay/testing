package SeleniumVinay123;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ebaylocators {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "D:\\vanay_jarfiles\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/n/all-categories");
	driver.manage().window().maximize();
	
	
	By ebay_searchbox_locator=By.xpath("//input[@class='gh-tb ui-autocomplete-input']");
	WebElement ebay_searchbox_element=driver.findElement(ebay_searchbox_locator);
	ebay_searchbox_element.sendKeys("books");
	
	
	By ebay_allcategories_locator=By.xpath("//select[@aria-label='Select a category for search']");
	WebElement ebay_allcategories_element=driver.findElement(ebay_allcategories_locator);
	Thread.sleep(3000);
	
	Select select=new Select(ebay_allcategories_element);
	select.selectByIndex(2);
	Thread.sleep(3000);
	
	
	List<WebElement>alloptiond=select.getOptions();
	for(WebElement webElement : alloptiond) {
		
		String data=webElement.getText();
		
	System.out.println(data);
	if(data.equals("Art"))
		select.selectByVisibleText(data);
	
	
	/*By ebay_motor_locator=By.cssSelector("a[href='#ebay-motors']");
	WebElement ebay_motor_element=driver.findElement(ebay_motor_locator);
	ebay_motor_element.click();
	
	
	By ebay_collectivebles_locator=By.cssSelector("a[href='#collectibles-and-art']");
	WebElement ebay_collectivebles_element=driver.findElement(ebay_collectivebles_locator);
	ebay_collectivebles_element.click();

	By home_garden_locator=By.cssSelector("a[href='#home-and-garden']");
	WebElement home_garden_element=driver.findElement(home_garden_locator);
	home_garden_element.click();
	
	By cloathing_shoe_locator=By.xpath("//a[@href='#clothing-shoes-and-accessories']");
	WebElement cloathing_shoe_element=driver.findElement(cloathing_shoe_locator);
	cloathing_shoe_element.click();
	
	By toys_hobies_locator=By.xpath("//a[@href='#toys-and-hobbies']");
	WebElement toys_hobies_element=driver.findElement(toys_hobies_locator);
	toys_hobies_element.click();
	
	By sports_locator=By.xpath("//a[@href='#sporting-goods']");
	WebElement sports_element=driver.findElement(sports_locator);
	sports_element.click();
	
	By books_movie_locator=By.cssSelector("a[href='#books-movies-and-music']");
	WebElement books_movie_element=driver.findElement(books_movie_locator);
	books_movie_element.click();
	
	By health_beauty_locator=By.cssSelector("a[href='#health-and-beauty']");
	WebElement health_beauty_element=driver.findElement(health_beauty_locator);
	health_beauty_element.click();
	
	By books_locator=By.xpath("//a[@href='#books-movies-and-music']");
	WebElement books_element=driver.findElement(books_locator);
	books_element.click();
	
	By business_industrial_locator=By.xpath("//a[@href='#business-and-industrial']");
	WebElement business_industrial_element=driver.findElement(business_industrial_locator);
	business_industrial_element.click();
	
	
	By holiday_session_locator=By.xpath("//*[@id=\"home-and-garden\"]/div/div[14]/div/ul/li[7]/a");
	WebElement holiday_session_element=driver.findElement(holiday_session_locator);
	business_industrial_element.click();
	
	
	By homedecore_locator=By.xpath("//*[@id=\"home-and-garden\"]/div/div[1]/div/ul/li[7]/a");
	WebElement homedecore_element=driver.findElement(homedecore_locator);
	homedecore_element.click();
	
	
	
	By valentines_locator=By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[6]/div[2]");
	WebElement valentines_element=driver.findElement(valentines_locator);
	valentines_element.click();*/
	
	
	}

}
}
