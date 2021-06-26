package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","\\C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println("Print successfull"+title);
		
		Thread.sleep(5000);
		//check this google search
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Sing me a song");
		//driver.findElement(By.id("//input[@data-ved='0ahUKEwjki7Kx99TtAhWd63MBHVMnADoQ4dUDCAs']")).click();
		driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("j0joJb")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		
		//driver.findElement(By.cssSelector("#identifierId")).sendKeys("alternateemailforlearning@gmail.com");
		//driver.findElement(By.id("identifierId")).sendKeys("alternateemailforlearning@gmail.com");
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("alternateemailforlearning@gmail.com");
		Thread.sleep(5000);
		
		 title=driver.getTitle();
		System.out.println("Print successfull"+title);
	}

}
