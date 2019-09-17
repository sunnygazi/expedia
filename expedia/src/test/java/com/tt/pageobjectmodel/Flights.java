package com.tt.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.BaseTest;

public class Flights {

	
	
	
	public Flights(WebDriver driver) {
		//why did i write this line?
		BaseTest.driver = driver;
		PageFactory.initElements(driver, this);

	}
	

	
	@FindBy (id="primary-header-flight")
	WebElement flights;
	
	public WebElement flights() {
		return flights;
	}
	
	
	
	
	@FindBy (id="tab-flight-tab-flp'])/span[2]")
	WebElement flightonly;
	
	public WebElement flightonly() {
		return flightonly;
	}
	
	
	
	
	
	
	
	
	
	
	
	


}// end of class.

