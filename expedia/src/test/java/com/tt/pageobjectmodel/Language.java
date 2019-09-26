package com.tt.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Common.BaseTest;

public class Language {

	public Language(WebDriver driver) {
		BaseTest.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "header-language-2058")
	WebElement spanish;

	public WebElement spanish() {
		return spanish;
	}

	@FindBy(id = "header-language-1033")
	WebElement english;

	public WebElement english() {
		return english;
	}

}
