package com.libglobal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;

	public void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public void setText(WebElement e, String data) {
		e.sendKeys(data);
	}

	public void btnClick(WebElement e) {
		e.click();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public String getAttributeByValue(WebElement e) {

		String attribute = e.getAttribute("value");
		return attribute;

	}
}
