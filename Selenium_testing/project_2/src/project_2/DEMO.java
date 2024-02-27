package project_2;

import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.techopedia.com/definition/13520/windows-defender");

	}

}
