import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar Sawant\\Desktop\\BD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("Omkar");
		driver.findElement(By.name("inputPassword")).sendKeys("Omi115599@");
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String errormsg = driver.findElement(By.xpath("//p[@class=\"error\"]")).getText();
		System.out.println(errormsg);
		driver.findElement(By.linkText("Forgot your password?")).click();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("omkar");
		driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys("omkarsawant1199@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).sendKeys("9623240057");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Reset Login\"]")).click();
		String s = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		System.out.println(s);
		String[] arr = s.split("'");
		String pass = arr[1];
		System.out.println(pass);
		System.out.println(arr[2]);
		driver.findElement(By.xpath("//button[text()=\"Go to Login\"]")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("Omkar");
		driver.findElement(By.name("inputPassword")).sendKeys(pass);
		// sdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

	}

}
