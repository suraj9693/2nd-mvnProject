package com.qa.TestScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.GenericLib.BaseClass;

public class Test1 extends BaseClass {
@Test
public void ATest() {
	System.out.println(" Running Test");
	d.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a")).click();
	d.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a/following-sibling::ul/li[5]")).click();
	System.out.println(d.getTitle());
}
}
