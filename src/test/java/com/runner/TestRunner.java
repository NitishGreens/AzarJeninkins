package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.libglobal.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = "com.stepdef", dryRun = false, monochrome = true, plugin = {
		"pretty", "junit:src\\test\\resources\\Reports\\sample.xml", "html:src\\test\\resources\\Reports",
		"json:src\\test\\resources\\Reports\\facebook.json",
		"rerun:src\\test\\resources\\failed.txt" }, tags = { "@E2E" })
public class TestRunner {

	@AfterClass
	public static void afterClass() {
		JVMReport.generateJvmReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\facebook.json");
	}

}
