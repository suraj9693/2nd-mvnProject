package com.qa.objRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.GenericLib.ActionsClass;
import com.qa.GenericLib.BaseClass;
import com.qa.GenericLib.Constants;

public class LoginPage {
	ActionsClass a=new ActionsClass();
@FindBy(name="username")
private WebElement un;
@FindBy(name="password")
private WebElement pwd;
@FindBy(xpath="//form[@id='loginForm']/div/div/input[@type='submit']")
private WebElement loginButt0n;

public void login() {
	un.sendKeys(Constants.un);
	pwd.sendKeys(Constants.pwd);
	a.moveToElementnClick(BaseClass.d, loginButt0n);
}
}
