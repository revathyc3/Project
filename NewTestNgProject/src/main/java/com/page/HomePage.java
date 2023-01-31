package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class HomePage extends TestBase {
	
	Wrapper objWrapper = new Wrapper();
	
	String pTextData = "Welcome Diyababy";
	
	@FindBy(id = "signin2")
    WebElement pSignUpButton;
	
	@FindBy(id = "login2")
	WebElement pLogInButton;
	
	@FindBy (xpath = "(//input[@type='text'])[4]")
	WebElement pLoginUserName;
	
	@FindBy (xpath = "(//input[@type='password'])[2]")
	WebElement pLogInPassword;
	
	@FindBy (xpath = "(//button[@type='button'])[9]")
	WebElement pClickLogIn;
	
	@FindBy (xpath = "(//*[text()='Close'])[3]")
	WebElement pcloseButton;
	
	@FindBy (xpath = "(//button[@type='button'])[5]")
	WebElement pSignUpCloseButton;
	
	@FindBy (xpath = "(//button[@type='button'])[8]")
    WebElement pLogInCloseButton;
	
	@FindBy (xpath = "(//a[@class='nav-link'])[3]")
	WebElement pAboutUsButton;
	
	@FindBy (xpath = "(//button[@type='button'])[25]")
	WebElement pAboutUsCloseButton;
	
	@FindBy (xpath = "(//a[@class='nav-link'])[2]")
	WebElement pContactButton;
	
	@FindBy (id = "recipient-email")
	WebElement pContactEmail;
	
	@FindBy (id ="recipient-name")
	WebElement pContactName;
	
	@FindBy (id ="message-text")
	WebElement pContactMessage;
	
	@FindBy (xpath = "(//button[@type='button'])[3]")
	WebElement pSendMessage;
	
	@FindBy (id = "sign-username")
	WebElement pSignUpUserName;
	
	@FindBy (id = "sign-password")
	WebElement pSignUpPassword;
	
	@FindBy (xpath = "(//button[@type='button'])[6]")
	WebElement pSignUp;
	
	@FindBy (xpath = "(//a[@class='nav-link'])[1]")
	WebElement pHome;
	
	@FindBy (xpath= "(//a[@class='hrefch'])[1]")
	WebElement pSamsung;
	
	@FindBy (xpath = "//a[@onclick='addToCart(1)']")
	WebElement pAddCart;
	
	@FindBy (id = "logout2")
	WebElement pLogout;
	
	@FindBy (xpath ="(//label[@class='ng-tns-c8-3'])[1]" )
	WebElement pFrom;
	
	@FindBy (xpath = "//ul[@id='list']")
	WebElement pChennai;
	
	
	
	
	
	
	
	
	
	public void clickFrom() {
		objWrapper.waitForElement(driver, pFrom);
		pFrom.click();
	}
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickChennai() {
		objWrapper.waitForElement(driver, pChennai);
		pChennai.click();
	}
	public void clickSignUpButton() {
		pSignUpButton.click();
	}
	
	public void clickLogInButton() {
		pLogInButton.click();
	}
	
	public void logInUserNameEnterText (String pValue) {
		objWrapper.enterText(driver, pLoginUserName, "Diyababy");
	}
	
	public void logInPasswordEnterText (String pValue) {
		objWrapper.enterText(driver, pLogInPassword, "diyababy123");
		
	}
	
	public void clickLogIn () {
		objWrapper.waitForElement(driver, pClickLogIn);
		pClickLogIn.click();
		objWrapper.waitForAlert(driver);
		objWrapper.dismissAlert(driver, pClickLogIn);	
	}
	
    public void logInClearText () {
    	objWrapper.clearText(driver, pLoginUserName);
    }
    
    public void logInClearText1 () {
    	objWrapper.clearText(driver, pLogInPassword);
    }
	
	public void clickLogInCloseButton() {
		objWrapper.waitForElement(driver, pLogInCloseButton);
		pLogInCloseButton.click();
	}
	
	public void clickSignUpCloseButton() {
		objWrapper.waitForElement(driver, pSignUpCloseButton);
		pSignUpCloseButton.click();
	}
	
	public void clickAboutUsButton() {
		objWrapper.waitForElement(driver, pAboutUsButton);
		pAboutUsButton.click();
	}
	
	public void clickAboutUsCloseButton() {
		objWrapper.waitForElement(driver, pAboutUsCloseButton);
		pAboutUsCloseButton.click();
	}
	
	public void clickContactButton() {
		objWrapper.waitForElement(driver, pContactButton);
		pContactButton.click();
	}
	
	public void contactEmailEnterText (String pValue) {
		objWrapper.enterText(driver, pContactEmail, pValue);
		}
	
	public void contactNameEnterText (String pValue) {
	objWrapper.enterText(driver, pContactName, pValue);
	}
	
	public void contactMessageEnterText (String pValue) {
		objWrapper.enterText(driver, pContactMessage, pValue);
		}
	
	public void clickSendMessage() {
		objWrapper.waitForElement(driver, pSendMessage);
		pSendMessage.click();
	}
	
	public void  signUpUserNameEnterText (String pValue) {
		objWrapper.enterText(driver, pSignUpUserName, "Diyababy");
	}
	
	public void signUpPasswordEnterText (String pValue) {
		objWrapper.enterText(driver, pSignUpPassword, "diyababy123");
	}
	
	public void clickSignUp() {
		objWrapper.waitForElement(driver, pSignUp);
		pSignUp.click();
		objWrapper.waitForAlert(driver);
		objWrapper.dismissAlert(driver, pSignUp);
	}
	
	public void signUpUsernameClearText() {
		objWrapper.clearText(driver, pSignUpUserName);
	}
	
	public void signUpPasswordClearText() {
		objWrapper.clearText(driver, pSignUpPassword);
	}
	
	public void clickHome() {
		pHome.click();
	}
	public void clickProduct() {
		objWrapper.waitForElementProduct(driver, pSamsung);
		pSamsung.click();
	}
	
	public void clickAddToCart() {
	   pAddCart.click();
	}
	
	public void clickSignUp1() {
		objWrapper.waitForElement(driver, pSignUp);
		pSignUp.click();
		objWrapper.waitForAlert(driver);
		objWrapper.dismissAlert(driver, pSignUp);
}

	public void clickLogIn1 () {
		objWrapper.waitForElement(driver, pClickLogIn);
		pClickLogIn.click();
		objWrapper.waitForAlert(driver);
		objWrapper.dismissAlert(driver, pClickLogIn);	
	}
	
	public void String() {
		objWrapper.waitForElement(driver, pTextData);
		pTextData.split("Welcome Diyababy");
	}
	
	public void logOut() {
		objWrapper.waitForElement(driver, pLogout);
		pLogout.click();
	}
	
	
}