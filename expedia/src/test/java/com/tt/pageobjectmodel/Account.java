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

	public WebElement flights() {
		return clickAccount;
	}

}
