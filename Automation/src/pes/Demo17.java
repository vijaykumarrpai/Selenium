package pes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo17 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///D:/Study/4th%20Sem/Eclipse/sample7.html");
		WebElement hotelList = driver.findElement(By.id("empire"));
		
		Select sel = new Select(hotelList);
		
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		
		// To get first selected option
		WebElement option = sel.getFirstSelectedOption();
		
		// To print first selected option
		String text = option.getText();
		System.out.println(text);
		
		Thread.sleep(1000);
		driver.close();
	}
}