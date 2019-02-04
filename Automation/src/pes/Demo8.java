package pes;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///D:/Study/4th%20Sem/Eclipse/sample3.html");
	
	WebElement link = driver.findElement(By.id("g"));
	String text = link.getText();
	System.out.println(text);
	
	driver.close();
	}
}