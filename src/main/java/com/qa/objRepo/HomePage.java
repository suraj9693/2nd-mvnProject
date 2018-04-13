package com.qa.objRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
@FindBy(xpath="//ul[@class='nav navbar-nav']/li[1]/a")
private WebElement we1;
@FindBy(xpath="//ul[@class='nav navbar-nav']/li[1]/a/following-sibling::ul/li[5]")
private WebElement we2;

public void clickOnInpitForm() {
	we1.click();
	we2.click();
}
}
