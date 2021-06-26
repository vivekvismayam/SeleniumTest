package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class_Test {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println("Print successfull :"+title);
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(3000);
		Actions builder =new Actions(driver);
		builder.moveToElement(driver.findElement(By.id("day"))).build().perform();

		//WebElement day= driver.findElement(By.id("day"));
		 builder.click().sendKeys("22222222").moveToElement(driver.findElement(By.id("month"))).click().build().perform();
		 driver.navigate().to("https://jqueryui.com/droppable/");
		 driver.switchTo().frame(0);
		 WebElement dragFrom=driver.findElement(By.id("draggable"));
		 WebElement dragTo=driver.findElement(By.id("droppable"));
		 builder.moveToElement(dragFrom).dragAndDrop(dragFrom, dragTo).build().perform();
	}
}
