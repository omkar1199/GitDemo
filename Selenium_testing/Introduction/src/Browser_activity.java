import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_activity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Omkar Sawant\\Desktop\\BD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.navigate().to("https://tcs.com");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();

	}

}
