package com.test.validatepage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.test.testsetup.TestBase;

public class HomePageTest extends TestBase {
	
  @Test
  public void linkDisplayTest() {
	  System.out.println("Test in Linked Display Test :" + Thread.currentThread().getId());
  }
  @Test
  public void hotelLinkNavigationTest() {
	  System.out.println("Test in Linked Hotel  Test :" + Thread.currentThread().getId());
  }
 
  @Test
  public void flightLinkNavigationTest() {
	  System.out.println("Test in Linked Flight Test :" + Thread.currentThread().getId());
  }
  
}
