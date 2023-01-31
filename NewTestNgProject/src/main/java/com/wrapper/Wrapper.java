package com.wrapper;

	import java.time.Duration;
import java.util.Set;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Action;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Wrapper {
		
	       /*Select by value
		   public void selectByValue(WebDriver driver, WebElement element, String pValue) {
		   Select selector = new Select(element);
		   selector.selectByValue(pValue);
	        }*/
			
		    /*Select by visible text
			public void selectByVisibleText(WebDriver driver, WebElement element, String pValue) {
		    Select selector = new Select(element);
			selector.selectByVisibleText(pValue);
			}*/
			
			/*Select by Index
			public void selectByIndex(WebDriver driver, WebElement element, String pValue) {
			Select selector = new Select(element);
			selector.selectByIndex(3);
			}*/

		
		    //Action - move to an element
			/*public void moveToElement (WebDriver driver, WebElement element) {
				Actions builder = new Actions (driver);
				Action mveToEle = builder.moveToElement(element).contextClick().build();
				mveToEle.perform();
				
				Action contextClickElement = builder.moveToElement(element).contextClick().build();
				contextClickElement.perform();
			}*/
		
		//Dismiss alert
		/*public void dismissAlert(WebDriver driver, WebElement element ) {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}*/
				
			//Window-Tabs handle
				/*public void windowHandle (WebDriver driver) throws InterruptedException {
					//To get the current window handle
					String currentWindow = driver.getWindowHandle();
					
					//To get all window handles
					Set<String> allwindows = driver.getWindowHandles();
					for (String temp: allwindows) {
					driver.switchTo().window(temp);
					Thread.sleep(5000);
				}
				driver.switchTo().window(currentWindow);
				}*/
				
		
				//iFrames
		     /*public void iFrameHandler (WebDriver driver, WebElement element) {
		    	 driver.switchTo().frame(element);
		     }*/
		
		
		
		
		        //alert
		/*public void alert (WebDriver driver) {
					driver.switchTo().alert();
				}
				
	}*/
		
		
		
		   //scroll
		  /* public void scroll (WebDriver driver, WebElement element) {
			Actions builder = new Actions (driver);
		    Action scrollToElement = builder.scrollToElement(pInteractions).build();
		    scrollToElement.perform();
		}
	}*/
	       
	       //dragAndDrop
		/*public void dragAndDrop (WebDriver driver, WebElement element, WebElement element1) {
			Actions builder = new Actions (driver);
			Action dragAndDrop = builder.dragAndDrop(element, element1).build();
			dragAndDrop.perform();
		}*/

	public void waitForElement (WebDriver driver, WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void enterText (WebDriver driver, WebElement element, String pValue) {
    waitForElement (driver, element);
    element.sendKeys(pValue);
	}
	
	public void waitForAlert (WebDriver driver) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void clearText (WebDriver driver, WebElement element) {
	    waitForElement (driver, element);
	    element.clear();
		}
	
	
	public void dismissAlert(WebDriver driver, WebElement element ) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public void dismissAlertSignUp(WebDriver driver, WebElement element ) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public void waitForElementProduct (WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		}

	public void waitForElement(WebDriver driver, String pTextData) {
		waitForElement (driver,pTextData);
	}
	
	public void waitForElementFrom(WebDriver driver, WebElement pFrom) {
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(pFrom));
		
	}
	
	}

