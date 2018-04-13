package com.qa.GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
public void moveToElementnClick(WebDriver driver, WebElement we) {
	Actions a=new Actions(driver);
	a.moveToElement(we).click().build().perform();
}
}
