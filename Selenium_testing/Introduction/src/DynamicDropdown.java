import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\Omkar Sawant\\\\Desktop\\\\BD\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value=\"BOM\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value=\"PNQ\"])[2]")).click();
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"PNQ\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"ui-state-default ui-state-highlight ui-state-active\"]")).click();
		
		
		
		
		
		
	}

}
