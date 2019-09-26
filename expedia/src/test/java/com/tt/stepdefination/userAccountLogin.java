package com.tt.stepdefination;

import com.tt.pageobjectmodel.Account;

import Common.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class userAccountLogin extends BaseTest {

	@Given("^Put URL and go to home apge$")
	public void put_URL_and_go_to_home_apge() throws Throwable {
		chromebrowser();

	}

	@When("^I click on login$")
	public void i_click_on_login() throws Throwable {
		Account pm = new Account(driver);
		pm.clickAccount().click();
		pm.clicksignin().click();

	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void i_enter_Username_as_and_Password_as(String arg1, String arg2) throws Throwable {
		Account pm = new Account(driver);
		pm.enteremail().sendKeys("ibrahimgaziqa@gmail.com");
		pm.enterpassword().sendKeys("VFyVpz6k-bcVRrR");
		pm.clicksubmit().click();

	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
		closebrowser();

	}

}
