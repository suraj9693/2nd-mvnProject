package com.qa.objRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputFormWithValidation {
@FindBy(name="first_name")
private WebElement firstName;
@FindBy(name="last_name")
private WebElement lastName;
@FindBy(name="email")
private WebElement email;

public void inputForm(String fn, String ln, String mailid) {
	firstName.clear();
	firstName.sendKeys(fn);
	lastName.clear();
	lastName.sendKeys(ln);
	email.clear();
	email.sendKeys(mailid);
}
}
