package com.qa.dataProvider;

import java.util.ArrayList;

import com.qa.GenericLib.ExcelUtility;


public class DataproviderClass {
	ExcelUtility e;
	
public ArrayList<Object[]> getData() throws Exception{
	
	e=new ExcelUtility("./src/main/resources/TestData/TestData.xlsx");
	ArrayList<Object[]> myData=new ArrayList<>();
	
	for(int rowNum=2; rowNum<=e.getLastRowNum("Sheet1"); rowNum++) {
			String firstName=e.getCellData("Sheet1", "FirstName", rowNum);
			String lastName=e.getCellData("Sheet1", "LastName", rowNum);
			String email=e.getCellData("Sheet1", "Email", rowNum);
			
			Object[] ob= {firstName, lastName, email};
			myData.add(ob);
	}
	
	return myData;
}
}
