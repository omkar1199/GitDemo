import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\Omkar Sawant\\\\Desktop\\\\BD\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
		driver.findElement(By.id("draggable")).click();
		Actions a = new Actions(driver);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement atrget = driver.findElement(By.id("droppable"));
		a.dragAndDrop(src, atrget).build().perform();
	}

}
