package com.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindFlights {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public FindFlights(WebDriver driver){
		this.driver=driver;
		wait=new WebDriverWait(this.driver,30);
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="reserveFlights")
	 WebElement firstbutton;
	
	@FindBy(id="buyFlights")
	 WebElement secondbutton;
	
	public void submitflightfindingpage() {
		wait.until(ExpectedConditions.visibilityOf(firstbutton));
		this.firstbutton.click();
	}
	
	public void goflightconfirmationpage() {
		wait.until(ExpectedConditions.visibilityOf(secondbutton));
		this.secondbutton.click();
	}

}
