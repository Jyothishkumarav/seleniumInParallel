package com.selenium.parallel.paralleltest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.seleniumparallel.configuration.DriverManager;

public class TestParallel1Test {

	private WebDriver driver;

	@BeforeTest
	public void initialiseDriver() {
		DriverManager.initialiseDriver("chrome");
		driver = DriverManager.getDriver();

	}

	@Test
	public void firstTestMethod() {

		System.out.println("Executing First TEst Thread : "
				+ Thread.currentThread().getId());
		driver.get("https://facebook.com");
		System.out.println("Page Title is :" + driver.getTitle());
	}
	
	@Test
	public void testUserName(){
		
		List<WebElement> userLabels = driver.findElements(By.cssSelector(".html7magic>label"));
		String userNameTxt = userLabels.get(0).getText();
		Assert.assertEquals(userNameTxt, "Email or Phone");
	}
	
	@Test
	public void testTitle(){
		
		String title = driver.getTitle();
		Assert.assertEquals(true, title.contains("Facebook"));
		
	}

	@AfterClass
	public void endTest() {
		driver.quit();
		driver.close();
	}
}
