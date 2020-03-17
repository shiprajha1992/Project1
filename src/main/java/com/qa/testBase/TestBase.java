package com.qa.testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
	}
	
	@SuppressWarnings("deprecation")
	public void initializtion() throws IOException
	{
		FileInputStream fis = new FileInputStream("./my.properties");
		prop = new Properties();
		prop.load(fis);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shipra Jha\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shipra Jha\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Shipra Jha\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability("ignoreZoomSetting", true);
			driver = new InternetExplorerDriver(caps);
		}
		
		driver.get("https://www.google.com/"); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
}
