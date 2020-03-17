package com.qa.testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
	}
	
	public void initializtion() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Shipra Jha\\eclipse-workspace\\MavenProject1\\my.properties");
		prop = new Properties();
		prop.load(fis);
		String browser = prop.getProperty("browser");//This needs to come from Jenkins / Maven
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shipra Jha\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get("https://www.google.com/"); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
}
