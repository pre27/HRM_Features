package com.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library {
	
	
//	git try 
	WebDriver driver;

	public void LaunchApplication(String browser, String url) {

		try {
			if (browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "C:\\Tools\\Selenium\\New folder\\chromedriver.exe");
				driver = new ChromeDriver();

			}
			else if (browser.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver", "C:\\Tools\\Selenium\\geckodriver\\geckodriver.exe");
				driver = new FirefoxDriver();
			}

		}

		catch (WebDriverException e) {
			System.out.println("Browser not found");


		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);

	}
	
	public void close() {
		
		driver.quit();
	}


}



