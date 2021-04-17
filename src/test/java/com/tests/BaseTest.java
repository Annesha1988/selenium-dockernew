package com.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public WebDriver driver;
	
	  @BeforeTest
		public void beforeClass() throws MalformedURLException {
		// System.setProperty("webdriver.chrome.driver", "C://Java/driver/chromedriver.exe");
		//this.driver=new ChromeDriver();
	   //driver.manage().window().maximize();
		String host="localhost";
		 // DesiredCapabilities ds=DesiredCapabilities.chrome();
		 DesiredCapabilities ds = null;
		 
		  if(System.getProperty("BROWSER")!=null && System.getProperty("BROWSER").equalsIgnoreCase("firefox"))
		  {
			  ds=DesiredCapabilities.firefox();
			  DesiredCapabilities.internetExplorer();
		  }
		  if(System.getProperty("BROWSER")!=null && System.getProperty("BROWSER").equalsIgnoreCase("internetExplorer"))
		  {
			  ds=DesiredCapabilities.firefox();
			  DesiredCapabilities.internetExplorer();
		  }
		  /*else {
			  ds=DesiredCapabilities.chrome();
		  }*/
		  if(System.getProperty("HUB_HOST")!=null) {
			  host=System.getProperty("HUB_HOST");			  
		  }
		  
		  String completeURL="http://" + host + ":4444/wd/hub";
		  this.driver=new RemoteWebDriver(new URL(completeURL),ds);
		
	  }
	  
	  @AfterTest
	  public void afterClass() {
		  this.driver.quit();
	  }

}
