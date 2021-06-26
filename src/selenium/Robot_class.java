package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_class {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:8080/apex/f?p=4550:1:325279487821173");
		String title=driver.getTitle();
		System.out.println("Print successfull :"+title);
		//Thread.sleep(5000);
		driver.findElement(By.id("F4550_P1_COMPANY")).sendKeys("dbuser");
		driver.findElement(By.id("F4550_P1_USERNAME")).sendKeys("dbuser");
		driver.findElement(By.id("F4550_P1_PASSWORD")).sendKeys("ODB123");
		//Thread.sleep(3000);
		Robot robot = new Robot();
		robot.mouseMove(700,347);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
	}

}
