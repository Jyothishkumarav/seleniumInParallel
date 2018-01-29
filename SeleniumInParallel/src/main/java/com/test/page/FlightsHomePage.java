package com.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FlightsHomePage extends BasePage {

	private String title = "";
	

	public FlightsHomePage(WebDriver driver) {

		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(how = How.CSS, using = "#flights-origin-prepop-whitelabel_en")
	private WebElement origin;
	@FindBy(how = How.CSS, using = "#flights-destination-prepop-whitelabel_en")
	private WebElement destination;
	@FindBy(how = How.CSS, using = "#flights-dates-depart-prepop-whitelabel_en")
	private WebElement departDate;
	@FindBy(how = How.CSS, using = "#flights-dates-return-prepop-whitelabel_en")
	private WebElement returnDate;
	@FindBy(how = How.CSS, using = ".mewtwo-flights-trip_class-wrapper")
	private WebElement passengerClass;

	public boolean verifyAllItemsBookingFieldsDisplayed() {
		
		boolean isAllItemsAreDisplayed = origin.isDisplayed()
				&& destination.isDisplayed() && departDate.isDisplayed()
				&& returnDate.isDisplayed() && passengerClass.isDisplayed();
		Assert.assertEquals(true, isAllItemsAreDisplayed);
		return isAllItemsAreDisplayed;
	}

}
