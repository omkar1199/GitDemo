import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\browserdriver\\chromedriver.exe");
		
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		/*driver.findElement(By.id("inputUsername")).sendKeys("omkarsawant11");
		driver.findElement(By.name("inputPassword")).sendKeys("Omi115599@");
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("omkarsawant@");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("omkarswant1199@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9623240057");
		driver.findElement(By.className("reset-pwd-btn")).click();*/
		driver.findElement(By.id("inputUsername")).sendKeys("omkar sawant");
		driver.findElement(By.cssSelector("input[placeholder='Password'")).sendKeys("Omi115599@");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		
		
		
	}

}
