package com.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BasePage {

	private final String pageTitle = "";

	public HomePage(WebDriver driver) {
		super(driver);
		waitForPageToLoad();
		PageFactory.initElements(this.driver, HomePage.class);
	}

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Flights")
	private WebElement flightsLink;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Hotels")
	private WebElement hotelLink;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Tours")
	private WebElement toursLink;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Offers")
	private WebElement offersLink;

	public boolean isLinksDisplayed() {
		
		boolean isLinkdiplayed = flightsLink.isDisplayed()
				&& hotelLink.isDisplayed() && toursLink.isDisplayed()
				&& offersLink.isDisplayed();
		return isLinkdiplayed;
	}

	public FlightsHomePage navigateToFlightsPage() {
		this.flightsLink.click();
		return new FlightsHomePage(driver);
	}

	public HotelsHomePage navigateHotelHome() {
		this.hotelLink.click();
		return new HotelsHomePage(driver);
	}
	
	}
