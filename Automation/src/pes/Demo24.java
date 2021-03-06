package pes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo24 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://plus2net.com/javascript_tutorial/ondblclick-demo.php");
		
		WebElement box = driver.findElement(By.id("box"));
		
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		
		// To perform double click action
		act.doubleClick(box).perform();
		Thread.sleep(1000);
		driver.close();
	}
}