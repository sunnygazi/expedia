package com.tt.stepdefination;

//import com.tt.pageobjectmodel.PageObjectModel;

import Common.BaseTest;
import UtilPackage.takeascreenshot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountLogin extends BaseTest {
	
	
	
	@Given("^Put URL and go to home apge$")
	public void put_URL_and_go_to_home_apge() throws Throwable {
		getBrowserG(); 
	  
	}

	@When("^I click on login$")
	public void i_click_on_login() throws Throwable {
//		PageObjectModel po = new PageObjectModel(driver);
//		po.getLogin().click();
		
		//screen shot test 
		takeascreenshot sc = new takeascreenshot();
		takeascreenshot.captureScreenShot(driver, "first screen shots ");
		
	    
	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void i_enter_Username_as_and_Password_as(String arg1, String arg2) throws Throwable {
		
	  
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
	    
	}
	
	

}	
