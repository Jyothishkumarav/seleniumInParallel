package com.seleniumparallel.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	
	// change this implementation if you are using server
	public static WebDriver createDriverInstance(String browserName){
		
		WebDriver driver = null;
		
		if (browserName.toLowerCase().contains("firefox")) {
			driver = new FirefoxDriver();
			return driver;
			}
			if (browserName.toLowerCase().contains("internet")) {
			driver = new InternetExplorerDriver();
			return driver;
			}
			if (browserName.toLowerCase().contains("chrome")) {
			driver = new ChromeDriver();
			return driver;
		}
				
		return driver;
	}

}
