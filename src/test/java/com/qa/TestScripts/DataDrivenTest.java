package com.qa.TestScripts;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.GenericLib.BaseClass;
import com.qa.dataProvider.DataproviderClass;
import com.qa.objRepo.HomePage;
import com.qa.objRepo.InputFormWithValidation;
@Listeners(com.qa.GenericLib.SampleListener.class)
public class DataDrivenTest extends BaseClass {
	
@DataProvider
public Iterator<Object[]> getData() throws Exception{
	DataproviderClass d=new DataproviderClass();
	ArrayList<Object[]> testData=d.getData();
	return testData.iterator();
}

@Test(dataProvider="getData")
public void excelTest(String firstName, String lastName, String email) {
	HomePage clickOnInputform=PageFactory.initElements(d, HomePage.class);
	clickOnInputform.clickOnInpitForm();
	InputFormWithValidation formFillUp=PageFactory.initElements(d, InputFormWithValidation.class);
	formFillUp.inputForm(firstName, lastName, email);
}
@Test
public void afterTest() {
	Assert.assertTrue(false, "Test is not Executed");
}
}
