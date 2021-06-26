package Experiment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vote24 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Start");
		int vote=0,fail=0;
		for(int i=1;i<=50;i++) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java_Dependencies\\Selenium\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://24newsnet.com/2021/02/23/chief-minister");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			js.executeScript("window.scrollBy(0,900)");
			driver.findElement(By.id("answer[133]")).click();
			//Thread.sleep(2000);
			driver.findElement(By.linkText("Vote")).click();
			Thread.sleep(5000);	
			System.out.println("Voted run: "+i+"; Vote no"+vote);
			vote++;
		}
		catch (Exception e) {
			System.out.println("Exception at run: "+ i+"; Failure no: "+fail+"; Exception"+ e.getMessage());
			fail++;
		}
		finally {
			driver.close();
			System.out.println("Driver closed");
			}
		}
		System.out.println("Completed \nVotes:"+vote+"\n Exceptions:"+fail);
	}
}
