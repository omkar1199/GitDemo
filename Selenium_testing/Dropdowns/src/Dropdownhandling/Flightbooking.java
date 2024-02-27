package Dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Flightbooking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Wbdriver.chrome.driver","C:\\Users\\Omkar Sawant\\Desktop\\BD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Dropdown with select tang = static  dropdown
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);  //select is class to select static dropdown
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"USD");
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"AED");
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"INR");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		for(int i= 0;i<=1;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		//driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		////a[@value="MAA"]
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_originStation1_CTNR\"] //a[@value=\"BLR\"]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"MAA\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='ui-state-active']")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first'] //a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
		
		
		
		
		
		
		
		
		
		

	}

}
