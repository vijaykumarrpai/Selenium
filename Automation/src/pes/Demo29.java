package pes;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo29 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com");
		
		// To get address of all the windows
		Set<String> allWH = driver.getWindowHandles();
		
		// To count number of windows
		int count = allWH.size();
		System.out.println(count);
		
		for(String wh : allWH) {
			// To switch into another window
			driver.switchTo().window(wh);
			
			// To close the current window
			driver.close();
			Thread.sleep(1000);
		}
	}
}