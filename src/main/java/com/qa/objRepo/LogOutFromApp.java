package com.qa.objRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutFromApp {
@FindBy(xpath="//a[contains(@href,'https://www.freecrm.com/index.cfm?logout')]/i")
private WebElement logoutButton;

public void logout() {
	logoutButton.click();
}
}
