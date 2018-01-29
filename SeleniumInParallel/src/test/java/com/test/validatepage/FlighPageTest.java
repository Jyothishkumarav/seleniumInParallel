package com.test.validatepage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.test.page.FlightsHomePage;
import com.test.testsetup.TestBase;

public class FlighPageTest extends TestBase {

	FlightsHomePage flightHomepage;

	@Test
	public void elementsDisplayedTest() {

		flightHomepage.verifyAllItemsBookingFieldsDisplayed();
	}

	@BeforeClass
	public void beforeClass() {

		flightHomepage = new FlightsHomePage(driver);
		driver.navigate().to("http://www.phptravels.net/flight");
	}

}
