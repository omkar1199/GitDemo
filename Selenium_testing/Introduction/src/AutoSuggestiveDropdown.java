import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","C:\\\\Users\\\\Omkar Sawant\\\\Desktop\\\\BD\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"] //a"));
		// List<WebElement> options
		// =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		//System.out.println(options);
		for (int i = 0; i < options.size(); i++)
		// for(WebElement option :options)

		{
			
			if (options.get(i).getText().equalsIgnoreCase("india"))
			// if(option.getText().equalsIgnoreCase("india"))
			{
				options.get(i).click();
				// option.click();
			}
		}
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']"))
				.isSelected());

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']"))
				.isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());

		// driver.findElement(By.id("view_fulldate_id_2")).isEnabled();
		System.out.println(driver.findElement(By.id("view_fulldate_id_2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("view_fulldate_id_2")).isDisplayed());
	}

}
