package pes;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo32 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com");
		
		// To get address of all the windows
		Set<String> allWH = driver.getWindowHandles();
		
		int count = allWH.size();
		System.out.println(count);
		
		for(String wh : allWH) {
			// To switch into another window
			driver.switchTo().window(wh);
			
			// To get the close a specific window
			String title = driver.getTitle();
			
			if(title.equals("Technosoft")) {
				break;
			}
		}
		driver.manage().window().maximize();
	}
}