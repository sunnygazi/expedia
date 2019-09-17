//package com.tt.stepdefination;
//
//import com.tt.pageobjectmodel.PageObjectModel;
//
//import Common.BaseTest;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefination  extends BaseTest{
//	
//	@Given("^Put URL and go to home apge$")
//	public void put_URL_and_go_to_home_apge() throws Throwable {
//		getBrowserG(); 
//	    
//	}
//
//	@When("^I click on login$")
//	public void i_click_on_login() throws Throwable {
//		PageObjectModel pm = new PageObjectModel(driver);
//		pm.getLogin().click();
//	    
//	}
//
//	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
//	public void i_enter_Username_as_and_Password_as(String arg1, String arg2) throws Throwable {
//	    
//	    
//	}
//
//	@Then("^login should be successful$")
//	public void login_should_be_successful() throws Throwable {
//	    
//	    
//	}
//
//	@When("^Select Check in and check out date$")
//	public void select_Check_in_and_check_out_date() throws Throwable {
//	    
//	    
//	}
//
//	@When("^verify not possible to select past date$")
//	public void verify_not_possible_to_select_past_date() throws Throwable {
//	    
//	    
//	}
//
//	@When("^Verify highest adult selection number is (\\d+)$")
//	public void verify_highest_adult_selection_number_is(int arg1) throws Throwable {
//	    
//	    
//	}
//
//	@When("^select adult (\\d+)$")
//	public void select_adult(int arg1) throws Throwable {
//	    
//	    
//	}
//
//	@When("^Select total number of hotel$")
//	public void select_total_number_of_hotel() throws Throwable {
//	    
//	    
//	}
//
//	@When("^Select parkhoper from add options$")
//	public void select_parkhoper_from_add_options() throws Throwable {
//	    
//	    
//	}
//
//	@When("^Click continue$")
//	public void click_continue() throws Throwable {
//	    
//	    
//	}
//
//	@Then("^Validate Disney Homepage$")
//	public void validate_Disney_Homepage() throws Throwable {
//	   }
//
//
//}