package com.tt.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Common.BaseTest;

public class Support {
	public Support(WebDriver driver) {
		BaseTest.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
