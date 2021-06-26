package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java_Dependencies\\Selenium\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://twitter.com/login");
		
		driver.findElement(By.name("session[username_or_email]")).sendKeys("@gmail.com");
		driver.findElement(By.name("session[password]")).sendKeys("");
		Thread.sleep(2000);
		
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
		Thread.sleep(5000);
		driver.findElement(By.className("nav-search-submit-text")).click();
		Thread.sleep(5000);	
		driver.findElement(By.linkText("English")).click();
		//driver.close();			
		
	}

}
