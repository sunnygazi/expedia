package com.tt.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Common.BaseTest;

public class Cars {
	public Cars(WebDriver driver) {
		BaseTest.driver = driver;
		PageFactory.initElements(driver, this);

	}


}
