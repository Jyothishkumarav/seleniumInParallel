package com.test.validatepage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FlighPageTest {
	
	@Test
	public void elementsDisplayedTest() {

		System.out.println("in Flight Page element Displayed:"
				+ getClass().getSimpleName().toString() + "Thread :"
				+ Thread.currentThread().getId());
	}
	
	@Test
	public void testNavigateToHome(){
		
		System.out.println("in Flight Page Naviagte to Home"
				+ getClass().getSimpleName().toString() + "Thread :"
				+ Thread.currentThread().getId());
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before flight class Thread :"
				+ Thread.currentThread().getId());	}

	@AfterClass
	public void afterClass() {
		
		System.out.println("After flight class Thread :"
				+ Thread.currentThread().getId());
	}

}
