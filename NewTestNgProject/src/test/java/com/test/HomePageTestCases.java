package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.HomePage;

public class HomePageTestCases extends TestBase {

	HomePage homePage;
	
	String pTestData = "Welcome Diyababy";
	//String pTempData = pTestData.split("")[1];
	
	public HomePageTestCases() {
		super();
		
	}
	@BeforeClass
	public void SetUp() {
		initialization();
		homePage = new HomePage();	
	}
	@Test (enabled = false)
	public void clickOnSignUpButton() {
		homePage.clickSignUpButton();
		homePage.signUpUserNameEnterText("text");
		homePage.signUpPasswordEnterText("123");
		homePage.clickSignUp();
	    homePage.signUpUsernameClearText();
	    homePage.signUpPasswordClearText();
	    homePage.clickSignUpCloseButton();
	}
	
	@Test (enabled = false)
	public void clickOnLogInButton() {
	homePage.clickLogInButton();
	homePage.logInUserNameEnterText("revathy");
	homePage.logInPasswordEnterText("text");
	homePage.clickLogIn();
	homePage.logInClearText();
	homePage.logInClearText1();
	homePage.clickLogInCloseButton();
	}
	
	@Test (enabled = false)
	public void clickOnAboutUsButton() {
		homePage.clickAboutUsButton();
		homePage.clickAboutUsCloseButton();
	}
	
	@Test (enabled = false)
	public void clickOnContact() {
		homePage.clickContactButton();
		homePage.contactEmailEnterText("Test email");
		homePage.contactNameEnterText("Revathy");
		homePage.contactMessageEnterText("Hi..");
		homePage.clickSendMessage();
	}
	
	@Test (enabled = false)
	public void clickSignUpButton() {
		homePage.clickSignUpButton();
		homePage.signUpUserNameEnterText("diya");
		homePage.signUpPasswordEnterText("diyadiya123");
		homePage.clickSignUp();
	}
	
	@Test (enabled = false)
	public void clickOnHomeButton() {
		homePage.clickHome();
		homePage.clickProduct();
		homePage.clickAddToCart();

	}

	@Test (enabled = false)
	public void clickSignUpButton1() {
		homePage.clickSignUpButton();
		homePage.signUpUserNameEnterText("Diyababy");
		homePage.signUpPasswordEnterText("diyababy123");
		homePage.clickSignUp();
		homePage.signUpUsernameClearText();
		homePage.signUpPasswordClearText();
		homePage.clickSignUpCloseButton();
	}
	
	@Test 
	public void clickOnLogInButton1() {
	homePage.clickLogInButton();
	homePage.logInUserNameEnterText("Diyababy");
	homePage.logInPasswordEnterText("diyababy123");
	homePage.clickLogIn();
	}
	
	@Test (enabled = false)
	public void Assert() {
		org.testng.Assert.assertEquals(	pTestData, "Diyababy", "Case passed");
		//org.testng.Assert.assertEquals("Diyababy", "Diyababy");
	}
	
	@Test (enabled = false)
	public void clickLogOut() {
		homePage.logOut();
	}
}

