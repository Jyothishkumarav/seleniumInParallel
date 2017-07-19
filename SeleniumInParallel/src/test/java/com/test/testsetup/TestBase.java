package com.test.testsetup;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.seleniumparallel.configuration.DriverFactory;

public class TestBase {

	WebDriver driver;

	@BeforeClass
	@Parameters(value = { "browserName", "platform" })
	public void setDriversettings(String browserName, String platForm) {
		// Code to initialise the browser
		// driver = DriverFactory.createDriverInstance(browserName);
		System.out.println("Test in Before Class :"
				+ Thread.currentThread().getId());

	}

	@AfterClass
	public void afterClass() {
		System.out.println("Test in After Class :"
				+ Thread.currentThread().getId());
	}

}
