package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://facebook.com/");
		
		String text1= driver.findElement(By.id("reg_pages_msg")).getText();
		String text2 =driver.findElement(By.className("_8eso")).getText();
		System.out.println(" Text:  "+text1+"    \n Text:"+text2);
		
		String var1= driver.findElement(By.id("reg_pages_msg")).getTagName();
		String var2 =driver.findElement(By.className("_8eso")).getTagName();
		System.out.println(" Tag:  "+var1+"    \n Tag:"+var2);
		
		Point p1= driver.findElement(By.id("reg_pages_msg")).getLocation();
		Point p2 =driver.findElement(By.className("_8eso")).getLocation();
		System.out.println(" Location:  "+p1+"    \n Location:"+p2);
		
		 Dimension dimension1= driver.findElement(By.id("reg_pages_msg")).getSize();
		 Dimension dimension2 =driver.findElement(By.className("_8eso")).getSize();
		System.out.println(" dimension1:  "+dimension1+"    \n dimension2 :"+dimension2);
		
		
		Thread.sleep(2000);
		

		//driver.close();			

	}

}
