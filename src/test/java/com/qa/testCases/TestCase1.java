package com.qa.testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class TestCase1 extends TestBase{
	
	public TestCase1()
	{
		super();
	}
	
	@BeforeTest
	public void setUp()
	{
		initializtion();
	}
	
	@Test
	public void test1()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
