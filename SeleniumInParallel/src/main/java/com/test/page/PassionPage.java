package com.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PassionPage extends BasePage{
	WebDriver driver;
	public PassionPage(WebDriver driver){
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, BasePage.class);
	}

	@FindBy(how=How.ID,using="")
	private WebElement ourPassionText;
	@FindBy(how=How.ID,using="")
	private WebElement theExpertsText;
}
