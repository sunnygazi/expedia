package com.tt.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.BaseTest;

public class Flights {

	public Flights(WebDriver driver) {
		BaseTest.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "primary-header-flight")
	WebElement flights;

	public WebElement flights() {
		return flights;
	}

	@FindBy(id = "tab-flight-tab-flp'])/span[2]")
	WebElement flightonly;

	public WebElement flightonly() {
		return flightonly;
	}

	@FindBy()
	WebElement FlightHotel;

	public WebElement FlightHotel() {
		return FlightHotel;
	}

	@FindBy()
	WebElement FlightHotelCar;

	public WebElement FlightHotelCar() {
		return FlightHotelCar;
	}

	@FindBy()
	WebElement FlightCar;

	public WebElement FlightCar() {
		return FlightCar;
	}

	@FindBy()
	WebElement RoundTrip;

	public WebElement RoundTrip() {
		return RoundTrip;
	}

	@FindBy()
	WebElement OneWay;

	public WebElement OneWay() {
		return OneWay;
	}

	@FindBy()
	WebElement MultiCity;

	public WebElement MultiCity() {
		return MultiCity;
	}

	@FindBy()
	WebElement FlyingFrom;

	public WebElement FlyingFrom() {
		return FlyingFrom;
	}

	@FindBy()
	WebElement FlyingTo;

	public WebElement FlyingTo() {
		return FlyingTo;
	}

	@FindBy()
	WebElement Departing;

	public WebElement Departing() {
		return Departing;
	}

	@FindBy()
	WebElement Returning;

	public WebElement Returning() {
		return Returning;
	}

	@FindBy()
	WebElement Travelers;

	public WebElement Travelers() {
		return Travelers;
	}

	@FindBy()
	WebElement AdvancedOptions;

	public WebElement AdvancedOptions() {
		return AdvancedOptions;
	}

	@FindBy()
	WebElement NonStop;

	public WebElement NonStop() {
		return NonStop;
	}

	@FindBy()
	WebElement RefundableFlingt;

	public WebElement RefundableFlingt() {
		return RefundableFlingt;
	}

	@FindBy()
	WebElement PreferredAirline;

	public WebElement PreferredAirline() {
		return PreferredAirline;
	}

	@FindBy()
	WebElement PreferredClass;

	public WebElement PreferredClass() {
		return PreferredAirline;
	}

	@FindBy()
	WebElement AddAhotel;

	public WebElement AddAhotel() {
		return AddAhotel;
	}

	@FindBy()
	WebElement AddAcar;

	public WebElement AddAcar() {
		return AddAcar;
	}

	@FindBy()
	WebElement Search;

	public WebElement Search() {
		return Search;
	}

}// end of class.
