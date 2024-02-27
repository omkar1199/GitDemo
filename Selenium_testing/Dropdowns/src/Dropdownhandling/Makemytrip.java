package Dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Omkar Sawant\\Desktop\\BD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/hotels/hotel-listing/?checkin=04292023&city=CTGOI&checkout=04302023&roomStayQualifier=2e0e&locusId=CTGOI&country=IN&locusType=city&searchText=Goa&regionNearByExp=3");
		driver.findElement(By.id("city")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Enter City / Hotel / Area / Landmark\"]")).sendKeys("Pune");
		Thread.sleep(2000);
		List<WebElement> hotels = driver.findElements(By.xpath("//div[@class=\"react-autosuggest__section-container react-autosuggest__section-container--first\"] //p[@class=\"appendBottom5\"]"));
		Thread.sleep(2000);
		for(WebElement hotel:hotels)
		{
			if(hotel.getText().equalsIgnoreCase("Wadgaon, Maharashtra, India"))
			{
				hotel.click();
				
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@aria-label='Sun Apr 30 2023'])[1]")).click();

	}

}
