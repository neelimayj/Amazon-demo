package com.amazon.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils  {

	private WebDriver driver;

	public Utils(WebDriver driver) {
		this.driver = driver;
	}


	public void enterText(WebElement ele, String value) {
		waitForElement(ele);
		ele.sendKeys(value);
	}

	public void click (WebElement ele) {
		waitForElement(ele);
		ele.click();
	}

	public void waitForElement(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public void scrollDown(int value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+value+")");
	}
}
