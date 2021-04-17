package com.newtours.tests;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.newtours.pages.FindFlights;
import com.newtours.pages.FlightConfirmationPage;
import com.newtours.pages.FlightDetailsPage;
import com.newtours.pages.RegistrationConfirmationPage;
import com.newtours.pages.RegistrationPage;
import com.tests.BaseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BookFlightTest extends BaseTest {
	//private WebDriver driver;
	private int noofpasscount;
 @BeforeClass
 @Parameters({"noofpasserger"})
 public void initialize(int noofpasscount) {
	 this.noofpasscount=noofpasscount;
 }
 
  @Test
  public void registrationpage() throws InterruptedException {

	  RegistrationPage registrationpage=new RegistrationPage(driver);
	  registrationpage.goTo();
	  registrationpage.enterNameDetails(driver,"anne", "malakar");
      registrationpage.enterUserDetails(driver,"anne","test");
     Thread.sleep(3000);
	  registrationpage.Submitclick(driver);
  }
  
  @Test(dependsOnMethods="registrationpage")
  public void registrationConfirmationpage() throws InterruptedException {
	  RegistrationConfirmationPage RegConfirmation=new RegistrationConfirmationPage(driver);
	  RegConfirmation.gotoflightdetailsPage(driver);
	  
  }
  @Test(dependsOnMethods="registrationConfirmationpage")
  public void flightDetailsPage() throws InterruptedException {
	  FlightDetailsPage FlightDetails=new FlightDetailsPage(driver);
	  
	  FlightDetails.selectPassengers(noofpasscount);
	  FlightDetails.GoToFindFlightPage();
  }
  @Test(dependsOnMethods="flightDetailsPage")
  public void findFlights() throws InterruptedException {
	  FindFlights FlightDetails=new FindFlights(driver);
	  
	  FlightDetails.submitflightfindingpage();
	  FlightDetails.goflightconfirmationpage();
	 
  }
  @Test(dependsOnMethods="findFlights")
  public void flightConfirmationPage() throws InterruptedException {
	  FlightConfirmationPage FlightConfirmation=new FlightConfirmationPage(driver);
	  
	  FlightConfirmation.pricecheck();

	 
  }


}
