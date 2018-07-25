package com.test.automation.uiautomation.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.test.automation.uiautomation.testBase.TestBase;
import com.test.automation.uiautomation.uiactions.Homepage;

public class Tc_002_Registration extends TestBase
{
	Homepage homepage;
	String fstname="test";
	String surname="testing";
	String mbnumber="1234567890";
	String pswd="9876543210";
	
	@BeforeClass
	public void setup()
	{ 
		init();
	}


	@Test
	public void testlogin()
	{
		homepage=new Homepage(driver);
		homepage.reguser(fstname, surname, mbnumber, pswd);
		
		/*driver.findElement(By.id("")).click();
		driver.findElement(By.xpath("")).sendKeys("deepu");
		driver.findElement(By.xpath("")).sendKeys("shusan");
		driver.findElement(By.xpath("")).sendKeys("9876543210");
		driver.findElement(By.xpath("")).sendKeys("password");
		Select day=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		day.selectByIndex(2);
		new Select(driver.findElement(By.xpath("//select[@id='month']"))).selectByIndex(2);
		new Select(driver.findElement(By.xpath("//Select[@id='year']"))).selectByIndex(2);*/
		
		
		
	}

@AfterClass
public void endtest()
{
driver.quit();
}



}
