package com.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightDetailsPage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public FlightDetailsPage(WebDriver driver){
		this.driver=driver;
		wait=new WebDriverWait(this.driver,30);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="passCount")
	WebElement passenger;
	
	@FindBy(id="findFlights")
	WebElement continuelink;
	
	
	public void selectPassengers(int noofpasscount) {
		wait.until(ExpectedConditions.visibilityOf(this.passenger));
		Select sel=new Select(passenger);
		sel.selectByIndex(noofpasscount);
	}
	
	public void GoToFindFlightPage() {
		
		this.continuelink.click();
	}

}
