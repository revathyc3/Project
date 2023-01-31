package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.HomePage;

public class AkbarTravels extends TestBase {

	HomePage homePage;
	
	public AkbarTravels() {
		super();
		
	}
	@BeforeClass
	public void SetUp() {
		initialization();
		homePage = new HomePage();	
	}
	@Test
	public void clickOnFromButton() {
		homePage.clickFrom();
		
	}
}
