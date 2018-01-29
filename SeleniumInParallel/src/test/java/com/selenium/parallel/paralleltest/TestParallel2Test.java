package com.selenium.parallel.paralleltest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.seleniumparallel.configuration.DriverManager;

public class TestParallel2Test {

	public WebDriver driver;

	@Test
	public void testGmail() {
		
		System.out.println("Executing First TEst Thread : "
				+ Thread.currentThread().getId());
		driver.get("https://gmail.com");
		System.out.println("Page Title is :" + driver.getTitle());

	}

	@BeforeTest
	public void initaliseDriver() {

		driver = DriverManager.getDriver();
		if (driver == null) {
			System.out.println("Driver is Null !!!!!!!!!!!!!!!!!!!!!!!!");
		}

	}

	@AfterTest
	public void quitDriver() {
		driver.quit();
		 driver.close();

	}

}
