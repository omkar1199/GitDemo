package Dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Autosuggestive_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Omkar Sawant\\Desktop\\BD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> items =  driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]//a"));
		for(WebElement item:items)
		{
			if(item.getText().equalsIgnoreCase("India"))
			{
				item.click();
				break;
			}
		}
		driver.findElement(By.cssSelector("input[name*=\"friendsandfamily\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[name*=\"friendsandfamily\"]")).isSelected());
		
		//driver.findElement(By.cssSelector("input[type='checkbox']")).getSize();
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Thread.sleep(2000);
		
			

	}

}
