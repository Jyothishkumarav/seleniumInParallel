package com.seleniumparallel.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

	private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		
		return webDriver.get();
	}

	private static void setWebDriver(WebDriver driver) {

		webDriver.set(driver);
	}
	
	public static void initialiseDriver(String browserName){
		
		setWebDriver(DriverFactory.createDriverInstance(browserName));
		
	}

}
