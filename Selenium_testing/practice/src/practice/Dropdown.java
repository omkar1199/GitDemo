package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar Sawant\\Desktop\\BD\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement Staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select Dropdown = new Select(Staticdropdown);
		Dropdown.selectByIndex(2);
		Dropdown.getFirstSelectedOption().getText();
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		
		

	}

}
