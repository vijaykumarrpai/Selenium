package pes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Study/4th%20Sem/Eclipse/sample5.html");
		
		// To get address of all links
		List<WebElement> allLinks = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		
		// To count number of links
		int count = allLinks.size();
		System.out.println(count);
		
		// To print all the links
		for(int i = 0; i < count; i++) {
			WebElement link = allLinks.get(i);
			link.click();
			Thread.sleep(1000);
		}
		driver.close();
	}

}
