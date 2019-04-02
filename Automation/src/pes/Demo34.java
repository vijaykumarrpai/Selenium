package pes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo34 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		
		WebElement helpCenter = driver.findElement(By.xpath("html/head/body/div[1]/ul[@class = 'main-menu__ul']/a[. = 'Help Center']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		
		// To move the cursor to helpCenter
		act.moveToElement(helpCenter).perform();
		Thread.sleep(1000);
		
		// To click on Contact Support
		driver.findElement(By.xpath("html/head/body/div[1]/a[. = 'Contact Support']")).click();
		
		driver.close();
	}
}