package pes;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username : ");
		String un = sc.nextLine();
		System.out.println("Enter password : ");
		String pwd = sc.nextLine();
		
		// 1. Open the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 2. Enter the url
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		// 3. Enter the valid username
		driver.findElement(By.id("txtUsername")).sendKeys(un);
		// 4. Enter the valid password
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		// 5. Click on login
		driver.findElement(By.id("btnLogin")).click();
		
		driver.close();
		}
	}