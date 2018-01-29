package com.test.validatepage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.test.page.HomePage;
import com.test.testsetup.TestBase;

public class HomePageTest extends TestBase {
	
	HomePage homePage ;
	
  @Test
  public void linkDisplayTest() {
	  
	  homePage.isLinksDisplayed();
  }
  @Test
  public void hotelLinkNavigationTest() {
	 
	  homePage.navigateHotelHome();
  }
 
  @Test
  public void flightLinkNavigationTest() {
	  
	  homePage.navigateToFlightsPage();
  }
  
  @BeforeClass
  public void setHomePage(){
	  
	  homePage = new HomePage(driver);
	  
  }
  
}
