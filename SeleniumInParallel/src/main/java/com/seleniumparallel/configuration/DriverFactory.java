package com.seleniumparallel.configuration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {

	// change this implementation if you are using server
	public static WebDriver createDriverInstance(String browserName) {

		WebDriver driver = null;
		
		if (browserName.toLowerCase().contains("firefox")) {
			driver = new FirefoxDriver(getDesiredCapability(browserName));
			return driver;
		}
		if (browserName.toLowerCase().contains("chrome")) {
			driver = new ChromeDriver(getDesiredCapability(browserName));
			return driver;
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		return driver;
	}

	private static DesiredCapabilities getDesiredCapability(String browserName) {

		DesiredCapabilities capabilities = null;

		if (browserName.toLowerCase().contains("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.16.0-win64\\geckodriver.exe" );
			FirefoxProfile profile = new FirefoxProfile();
			capabilities = DesiredCapabilities.firefox();
			profile.setPreference("browser.download.folderList", 2);
			profile.setPreference("browser.download.manager.showWhenStarting",false); 
			profile.setPreference("browser.download.dir", "C:\\Downloads"); 
			profile.setAcceptUntrustedCertificates(true);
			profile.setAssumeUntrustedCertificateIssuer(false);
			capabilities.setCapability(FirefoxDriver.PROFILE, profile);

		}
		if (browserName.toLowerCase().contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			capabilities = DesiredCapabilities.chrome();
			ChromeOptions chromeOptions = new ChromeOptions();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--disable-web-security");
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

		}
		return capabilities;

	}

}
