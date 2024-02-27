import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omkar Sawant\\Desktop\\BD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[@for=\"departure\"]")).click();
		Thread.sleep(5000);
		
		while(!driver.findElement(By.xpath("(//div[@class=\"DayPicker-Caption\"])[1]")).getText().contains("September"))
		{
			driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
		}
		
		
		List <WebElement> dates = driver.findElements(By.xpath("//div[@class=\"DayPicker-Day\"]//p[1]"));
		
//		
		for(int i = 0;i<dates.size();i++)
		{   
			
			if(dates.get(i).getText().contains("11")){
				
				dates.get(i).click();
				break;
				
				
//				
//				
//				
		}
		}
		

	}

}
