package com.Generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	FileLibrary f = new FileLibrary();

	@BeforeClass
	public void LaunchBrowser() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String url = f.ReadDataFromProperty("Amazon");
		driver.get(url);
	}
	
	@AfterClass
	public void CloseBrowser() {
		driver.close();
		Reporter.log("Browser Closed" , true);
	}
}
