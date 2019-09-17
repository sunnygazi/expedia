package com.tt.testngrunner;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "Cucumber" }, glue = { "com.tt.stepdefination" }, tags = { "@accountLongin" })

public class TestngRunner extends AbstractTestNGCucumberTests {

}// end class
