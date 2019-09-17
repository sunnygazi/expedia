package com.tt.stepdefination;

import org.openqa.selenium.WebDriver;
import com.tt.pageobjectmodel.Account;
import Common.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class userAccountLogin extends BaseTest {
	WebDriver driver;
	Account acc;

	@Given("^Put URL and go to home apge$")
	public void put_URL_and_go_to_home_apge() throws Throwable {
		chromebrowser();

	}

	@When("^I click on login$")
	public void i_click_on_login() throws Throwable {
		acc = new Account(driver);

	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void i_enter_Username_as_and_Password_as(String arg1, String arg2) throws Throwable {

	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {

	}

}
