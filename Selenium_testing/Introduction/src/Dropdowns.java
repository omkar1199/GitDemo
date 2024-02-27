import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\Omkar Sawant\\\\Desktop\\\\BD\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//dropdown with select tag is static dropdown
		//in selenium there is a select class to handle the static dropdowns
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(2);
		Thread.sleep(2000);
		//dropdown.selectByIndex(3);
        dropdown.getFirstSelectedOption().getText();
        System.out.println( dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("USD");
        
        
        
        /////Select pasanger dropdown
        
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        int i = 1 ;
        while(i < 5) {
        driver.findElement(By.id("hrefIncAdt")).click();
        i++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();    
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        
	}

}
