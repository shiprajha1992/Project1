package com.qa.testCases;

import java.io.IOException;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class TestCase1 extends TestBase{
	
	public TestCase1()
	{
		super();
	}
	
	@Test
	public void test1() throws IOException, InterruptedException
	{
		super.initializtion();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
