package com.seleniumparallel.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	
	private static WebDriver driver;

	public static WebDriver getDriver() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\geckodriver-v0.16.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		return driver;
	}

}
