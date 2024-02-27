import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Iterators;

public class DriverScope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Omkar Sawant\\Desktop\\BD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qaclickacademy.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.id("footer-part"));
		//footerdriver.findElements(By.tagName("a")).size();
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		for(int i = 0; i<footerdriver.findElements(By.tagName("a")).size(); i++) {
			
			String clickl = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerdriver.findElements(By.tagName("a")).get(i).sendKeys(clickl);
			Thread.sleep(5000);
			
			
		}
		
		Set<String>s = driver.getWindowHandles();
		Iterator<String> w1 = s.iterator();
		
		while(w1.hasNext()){
			
			driver.switchTo().window(w1.next());
			System.out.println(driver.getTitle());
			
		}
		
		
		
	}

}
