package com.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HotelsHomePage extends BasePage {

	private String title = "";

	public HotelsHomePage(WebDriver driver) {

		super(driver);
		PageFactory.initElements(this.driver, HotelsHomePage.class);
	}
	
	@FindBy(how = How.CSS, using = ".select2-chosen")
	private WebElement location;
	@FindBy(how = How.CSS, using = ".form.input-lg.dpd1")
	private WebElement checkIn;
	@FindBy(how = How.CSS, using = ".form.input-lg.dpd2")
	private WebElement checkOut;
	

	public boolean verifyAllItemsBookingFieldsDisplayed() {
		
		boolean isAllItemsAreDisplayed = location.isDisplayed()
				&& checkIn.isDisplayed() && checkOut.isDisplayed();
						
		return isAllItemsAreDisplayed;
	}

}
