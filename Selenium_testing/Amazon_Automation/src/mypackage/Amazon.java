package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Omkar Sawant\\Desktop\\BD\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/b?node=10591838031");
		driver.findElement(By.className("action-button")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9623240057");
		driver.findElement(By.cssSelector("input.a-button-input")).click();
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Omi115599@");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Puma Shoes");
		List<WebElement> products = driver.findElements(By.xpath("//div[@id=\"nav-flyout-searchAjax\"] //div[@class=\"s-suggestion-container\"]"));
		for(WebElement product:products)
		{
			if(product.getText().equalsIgnoreCase("puma shoes for women"))
			{
				product.click();
				break;
			}
		}
		/*driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.cssSelector("div[class='a-section aok-relative s-image-tall-aspect']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector("span#size_name_0")).click();
		//driver.findElement(By.cssSelector("input[id='buy-now-button']")).click();*/
		

	}

}
