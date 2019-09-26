package com.tt.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.BaseTest;

public class Account {

	public Account(WebDriver driver) {
		BaseTest.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "header-account-menu")
	WebElement clickAccount;

	public WebElement clickAccount() {
		return clickAccount;
	}

	@FindBy(id = "account-signin")
	WebElement clicksignin;

	public WebElement clicksignin() {
		return clicksignin;
	}

	@FindBy(id = "gss-signin-email")
	WebElement enteremail;

	public WebElement enteremail() {
		return enteremail;
	}

	@FindBy(id = "gss-signin-password")
	WebElement enterpassword;

	public WebElement enterpassword() {
		return enterpassword;
	}

	@FindBy(id = "gss-signin-submit")
	WebElement clicksubmit;

	public WebElement clicksubmit() {
		return clicksubmit;
	}

}
