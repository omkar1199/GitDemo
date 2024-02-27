import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Omkar Sawant\\Desktop\\BD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("omkar");
		Thread.sleep(5000);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		// driver.switchTo().alert().getText();

		driver.findElement(By.id("name")).sendKeys("kunal");
		Thread.sleep(5000);
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
