package com.test.automation.uiautomation.testBase;

import java.util.concurrent.TimeUnit;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase 
{
	String URL="https://www.facebook.com/";
	String Browser="firefox";
	public WebDriver driver;
	
	/*public static final Logger log=Logger.getLogger(TestBase.class.getName());*/
	
	public void init()
	{
		selectbrowser(Browser);
		geturl(URL);
		
		/*String log4jconfigpath="log4j.properties";
		PropertyConfigurator.configure(log4jconfigpath);*/
	}
	public void selectbrowser(String Browser) 
	{
		if(Browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			
			driver=new FirefoxDriver();
		}
	}
	public void geturl(String URL)
	{
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
}
