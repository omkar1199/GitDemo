import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GreenKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Omkar Sawant\\Desktop\\BD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] addToCartVeg = { "Brocolli", "Cucumber", "Tomato", "Potato" };
		System.out.println(addToCartVeg.length);
		GreenKart k = new GreenKart();
		k.additems(driver, addToCartVeg);
		driver.findElement(By.xpath("//a[@class=\"cart-icon\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"PROCEED TO CHECKOUT\"]")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class=\"promoInfo\"]")).getText());
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
		
		Assert.assertEquals(driver.findElement(By.xpath("//span[@class=\"promoInfo\"]")).getText(), "Code applied ..!");
		driver.findElement(By.xpath("//button[text()=\"Place Order\"]")).click();
		
		WebElement staticdropDown = driver.findElement(By.xpath("//div[@class=\"wrapperTwo\"] //select"));
		
		Select dropdown = new Select(staticdropDown);
		
		dropdown.selectByVisibleText("India");
		driver.findElement(By.cssSelector("input[class=\"chkAgree\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"Proceed\"]")).click();

	}

	public void additems(WebDriver driver, String[] addToCartVeg)

	{
		List<WebElement> names = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < names.size(); i++) {
			String[] editname = names.get(i).getText().split("-");
			String finalname = editname[0].trim();
			System.out.println(finalname);
			

			List<String> actualveg = Arrays.asList(addToCartVeg);

			if (actualveg.contains(finalname)) {

				driver.findElements(By.xpath("//div[@class='product'] //button")).get(i).click();

			}
		}
	}

}
