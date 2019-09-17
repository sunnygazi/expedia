package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	
	WebDriver driver;
	public PageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	
	@FindBy(id="primary-header-flight")
	private WebElement flights;
	public WebElement getFlights() {
		return flights;
	}
	
	
	
	
	@FindBy(xpath="//a[@id='primary-header-hotel']")
	private WebElement hotels;
	public WebElement getHotels() {
		return hotels;
	}
	
	
	
	@FindBy(xpath="//button[@id='tab-car-tab-hp']")
	private WebElement cars;
	public WebElement getCars() {
		return cars;
	}
	
	
	
	@FindBy(xpath="//a[@id='primary-header-deals']")
	private WebElement deals;
	public WebElement getDeals() {
		return deals;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}// end of class 
