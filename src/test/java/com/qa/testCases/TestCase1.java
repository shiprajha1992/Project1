package com.qa.testCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class TestCase1 extends TestBase{
	
	public TestCase1()
	{
		super();
	}
	
	
	
	@Test
	public void test1() throws IOException
	{
		super.initializtion();
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("garbage");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
