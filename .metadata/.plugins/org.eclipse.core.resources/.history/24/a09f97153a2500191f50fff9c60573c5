package pes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args) {
		//To open the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// To enter the URL
		driver.get("https://www.google.com");
		
		// To get the title of current web page
		String title = driver.getTitle();
		System.out.println("Title : "+title);
		
		//To get the URL of current web page
		String url = driver.getCurrentUrl();
		System.out.println("URL :"+url);
		
		// To get the source code of current web page
//		String pageSrc = driver.getPageSource();
//		System.out.println("Page URL :"+pageSrc);
		
		// To close the browser
		driver.close();
	}
}
