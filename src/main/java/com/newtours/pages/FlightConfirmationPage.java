package com.newtours.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightConfirmationPage {
	
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public FlightConfirmationPage(WebDriver driver){
		this.driver=driver;
		wait=new WebDriverWait(this.driver,30);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//font[contains(text(),'Flight Confirmation')]")
	 private WebElement FlightItineraryPagetext;
	
	@FindBy(xpath="//font[contains(text(),'USD')]")
	  List<WebElement> fare;
	
	@FindBy (id="sign-on")
	private WebElement signofflink;
   
	public void pricecheck() {
		wait.until(ExpectedConditions.visibilityOf(FlightItineraryPagetext));
		 System.out.println(this.FlightItineraryPagetext.getText());
		System.out.println(this.fare.get(1).getText());
		signofflink.click();
		
	}

}
