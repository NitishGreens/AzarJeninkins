package com.stepdef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.libglobal.LibGlobal;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends LibGlobal {

	@Before
	public void beforeScenario() {
		launchBrowser();
		loadUrl("https://www.facebook.com/");
	}

	@After
	public void afterScenario(Scenario sc) {

		TakesScreenshot tk = (TakesScreenshot) driver;
		byte[] bs = tk.getScreenshotAs(OutputType.BYTES);
		sc.embed(bs, "image/png");

		quitBrowser();

	}

}
