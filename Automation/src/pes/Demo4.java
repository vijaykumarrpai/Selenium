package pes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	public static void main(String[] args) {
		//To open the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// To maximize the window
		driver.manage().window().maximize();
		
		// To delete the cookies
		driver.manage().deleteAllCookies();
		
		// To enter the URL
		driver.get("http://seleniumhq.org/download");
		
		// To enter the URL
		driver.navigate().to("https://www.google.com");
		
		// To navigate to previous page
		driver.navigate().back();
		
		// To navigate to next page
		driver.navigate().forward();
		
		// To refresh the current web page
		driver.navigate().refresh();
		
		driver.get("https://www.naukri.com");
		
		// To close all the browsers
		driver.quit();
	}
}
