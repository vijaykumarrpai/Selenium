package pes;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	public static void main(String[] args) {
		// set the path of driver file
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		// set open the browser
		FirefoxDriver f = new FirefoxDriver();
		
		//To close the browser
		f.close();
	}
}
