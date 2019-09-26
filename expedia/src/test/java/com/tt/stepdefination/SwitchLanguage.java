package com.tt.stepdefination;

import com.tt.pageobjectmodel.Language;
import Common.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SwitchLanguage extends BaseTest {

	@Given("^I am at expedia home page$")
	public void i_am_at_expedia_home_page() throws Throwable {
		chromebrowser();

	}

	@When("^I click on lenguage Spanish laguage will change to spanish$")
	public void i_click_on_lenguage_Spanish_laguage_will_change_to_spanish() throws Throwable {
		Language pm = new Language(driver);
		pm.spanish().click();

	}

	@When("^I click on lenguage English again$")
	public void i_click_on_lenguage_English_again() throws Throwable {
		Language pm = new Language(driver);
		pm.english().click();

	}

	@Then("^I will be able to see the change of language on the home page english again\\.$")
	public void i_will_be_able_to_see_the_change_of_language_on_the_home_page_english_again() throws Throwable {
		closebrowser();

	}

}
