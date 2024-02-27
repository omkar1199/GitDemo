import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar Sawant\\Desktop\\newbrowserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

	}

}
