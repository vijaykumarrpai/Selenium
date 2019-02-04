package pes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo14 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///D:/Study/4th%20Sem/Eclipse/sample7.html");
		WebElement hotelList = driver.findElement(By.id("empire"));
		
		Select sel = new Select(hotelList);
		Thread.sleep(1000);
		
		sel.selectByIndex(1);
		Thread.sleep(1000);
		
		sel.selectByValue("p");
		Thread.sleep(1000);
		
		sel.selectByVisibleText("Fish");
		Thread.sleep(1000);
		
		sel.deselectByIndex(1);
		Thread.sleep(1000);
		
		sel.deselectByValue("p");
		Thread.sleep(1000);
		
		sel.deselectByVisibleText("Fish");
		
	}

}
