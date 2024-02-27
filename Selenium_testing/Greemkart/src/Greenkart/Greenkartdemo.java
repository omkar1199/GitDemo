package Greenkart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenkartdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public void addelem() {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Omkar Sawant\\Desktop\\BD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] vegitables = { "Cucumber", "Brocolli", "Tomato" };
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String editedname = name[0].trim();
			System.out.println(editedname);
			List<String> vegita = Arrays.asList(vegitables);

			if (vegita.contains(editedname)) {
				driver.findElements(By.xpath("//div[@class='product'] //button")).get(i).click();

			}
		}
	}

}
