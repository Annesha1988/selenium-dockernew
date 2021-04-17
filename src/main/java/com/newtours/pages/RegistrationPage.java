package com.newtours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;		
		this.wait=new WebDriverWait(driver,30);
	}
	/*public static WebElement firstNamelink(WebDriver driver) {
		WebElement firstNameTxt=driver.findElement(By.name("firstName"));	
		return firstNameTxt;
	}
	*/
	
	/*@FindBy(name="firstName")
	private WebElement firstNameTxt;
	
	@FindBy(name="lastName")
	private WebElement lastNameTxt;*/
	
	@FindBy(id="email")
	private WebElement usernameTxt;
	
	@FindBy(name="password")
	private WebElement passwordTxt;	
	
	@FindBy(name="confirmPassword")
	private WebElement ConfirmPassword;
	
	@FindBy(id="register-btn")
	private WebElement submit;
	
	public void goTo() {
		this.driver.get("https://vins-udemy.s3.amazonaws.com/docker/docker-book-flight.html");
		//this.wait.until(ExpectedConditions.visibilityOf(this.FirstName));
	}
	
	public void enterNameDetails(WebDriver driver,String firstname1,String lastname1) {
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1000)");
		WebElement firstNameTxt=driver.findElement(By.name("firstName"));		
		WebElement lastNameTxt=driver.findElement(By.name("lastName"));		
		firstNameTxt.sendKeys(firstname1);	
		lastNameTxt.sendKeys(lastname1);
	}
	public void enterUserDetails(WebDriver driver,String username,String password) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement usernameTxt=driver.findElement(By.id("email"));	
		WebElement passwordTxt=driver.findElement(By.name("password"));	
		usernameTxt.sendKeys(username);	
		passwordTxt.sendKeys(password);
	}
	

	
	public void Submitclick(WebDriver drive) {
		WebElement submitlk=driver.findElement(By.id("register-btn"));	
		submitlk.click();
	}
	

}
