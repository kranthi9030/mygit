package com.test.automation.uiautomation.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiautomation.testBase.TestBase;
import com.test.automation.uiautomation.uiactions.Homepage;

public class TC_001Verfifyloginwithinvalidcredintials extends TestBase
{
	Homepage homepage;
	//WebDriver driver;--no need because testbase class inherited to our main class
	@BeforeTest
	public void setup()
	{ 
		init();
		
		/*System.setProperty("webdriver.gecko.driver", "F:\\selenium\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		 //System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");*/
	}
	@Test
	public void verfifyloginwithinvalidcredintials()
	{
		homepage=new Homepage(driver);
		homepage.loginapp("kranthi.polampally@gmail.com", "123456789");
		
		/*driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kranthi.polampally@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		*/
		
		
	}
	@AfterClass
	public void endTest()
	{
		driver.close();
	}
}
