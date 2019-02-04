package pes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	public static void main(String[] args) {
		//To open the browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("file:///D:/Study/4th%20Sem/Eclipse/sample.html");
				
				// By using id
				driver.findElement(By.id("fp")).click();
				driver.navigate().back();
				
				// By using name
				driver.findElement(By.name("pass")).click();
				driver.navigate().back();
				
				//By using className
				driver.findElement(By.className("forgot")).click();
				driver.navigate().back();
				
				// By using tagName
				driver.findElement(By.tagName("a")).click();
				driver.navigate().back();
				
				// By using linkText
				driver.findElement(By.linkText("Forgot Password?")).click();
				driver.navigate().back();
				
				// By using partialLinkText
				driver.findElement(By.partialLinkText("Inbox")).click();
				
				driver.close();
	}
}