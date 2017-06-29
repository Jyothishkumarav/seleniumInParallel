package com.selenium.parallel.paralleltest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.seleniumparallel.configuration.DriverManager;

public class TestParallel1Test {

	private WebDriver driver;

	@BeforeTest
	public void initialiseDriver() {

		driver = DriverManager.getDriver();

	}

	@Test
	public void firstTestMethod() {

		System.out.println("Executing First TEst Thread : "
				+ Thread.currentThread().getId());
		driver.get("https://facebook.com");
		System.out.println("Page Title is :" + driver.getTitle());
	}

	@AfterTest
	public void endTest() {
		//driver.quit();
		// driver.close();
	}
}
