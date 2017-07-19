package com.test.page;

import org.junit.rules.Timeout;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;
	WebDriverWait wait;
	public BasePage(WebDriver driver){
		this.driver = driver;
		waitForPageToLoad();
		wait = new WebDriverWait(driver,5);
	}
	public boolean waitForPageToLoad() {
		 
		boolean isPageLoadDone = ((JavascriptExecutor) driver).executeScript(
				"return document.readyState").equals("complete");
		
		return isPageLoadDone;
	}

}
