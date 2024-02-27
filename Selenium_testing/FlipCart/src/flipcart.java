import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Omkar Sawant\\Desktop\\BD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		// TODO Auto-generated method stub

	}

}
