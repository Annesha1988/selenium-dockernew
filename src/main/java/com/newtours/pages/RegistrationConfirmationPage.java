package com.newtours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationConfirmationPage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(id="flight-link")
	WebElement flightlink;
	
	@FindBy(linkText="sign-in")
	WebElement signinlink;
	
	
	public RegistrationConfirmationPage(WebDriver driver){
		this.driver=driver;
		this.wait=new WebDriverWait(driver,30);
		PageFactory.initElements(driver, this);
	}
	public void checksigninlink() {
		signinlink.isDisplayed();
	}
	
	public void gotoflightdetailsPage(WebDriver driver) {
		WebElement flightlink=driver.findElement(By.id("flight-link"));	
		wait.until(ExpectedConditions.visibilityOf(this.signinlink));
		flightlink.click();
	}
	

}
