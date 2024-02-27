package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javastring {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Omkar Sawant\\Desktop\\BD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String name = "karan";
		String pass = getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(pass);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}
	//to get password from this Please use temporary password 'rahulshettyacademy' to Login. string

	public static String getpassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String passwordtext = driver.findElement(By.className("infoMsg")).getText();
		String[] passarray = passwordtext.split("'");
		String[] passarray2 = passarray[1].split("'");
		String password =passarray2[0];
		return password;
		

		
	}

}
