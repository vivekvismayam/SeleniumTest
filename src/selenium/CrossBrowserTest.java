package selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class CrossBrowserTest {

	public static void main(String[] args) throws InterruptedException, AWTException {
				//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
				//WebDriver driver = new ChromeDriver();
				System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Drivers\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				//System.setProperty("webdriver.ie.driver","C:\\Selenium\\Drivers\\IEDriverServer.exe");//FB dont work in ie browser
				//WebDriver driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://facebook.com");
				String title=driver.getTitle();
				System.out.println("Print successfull :"+title);
//				driver.findElement(By.id("u_0_2")).click();
//				Thread.sleep(3000);
//				Actions builder =new Actions(driver);
//				builder.moveToElement(driver.findElement(By.id("day"))).click().build().perform();
//				Robot robot = new Robot();
//				robot.keyPress(KeyEvent.VK_UP);
//				Thread.sleep(3000);
//				robot.keyRelease(KeyEvent.VK_UP);
//				Thread.sleep(3000);
//				robot.keyPress(KeyEvent.VK_UP);
//				robot.keyRelease(KeyEvent.VK_UP);
//				Thread.sleep(3000);
//				robot.keyPress(KeyEvent.VK_UP);
//				robot.keyRelease(KeyEvent.VK_UP);
//				Thread.sleep(3000);
//				robot.keyPress(KeyEvent.VK_ENTER);
//				robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
