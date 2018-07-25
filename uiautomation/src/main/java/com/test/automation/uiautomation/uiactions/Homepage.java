package com.test.automation.uiautomation.uiactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
;

public class Homepage 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement loginEmailaddress;
	
	@FindBy(xpath="//*[@id='pass']")
	WebElement Password;
	 
	@FindBy(xpath="//*[@value='Log In']")
	WebElement loginbtn;
	
	@FindBy(id="u_0_11")
	WebElement signup;
	
	@FindBy(xpath="//input[@id='u_0_j']")
	WebElement fstname;
	
	@FindBy(xpath="//input[@id='u_0_l']")
	WebElement surname;
	
	@FindBy(xpath="//input[@id='u_0_o']")
	WebElement mbnumber;
	
	@FindBy(xpath="//input[@id='u_0_v']")
	WebElement pswd;
	
	@FindBy(xpath="//select[@id='day']")
	WebElement dd;
	
	@FindBy(xpath="//select[@id='month']")
	WebElement mn;
	
	@FindBy(xpath="//Select[@id='year']")
	WebElement yy;
	
	
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//this.driver=driver;
	}
	public void  loginapp(String Emailaddress, String pswd)
	{
		loginEmailaddress.sendKeys(Emailaddress);
		Password.sendKeys(pswd);
		loginbtn.click();
	}
	
	public void reguser(String fstname, String surname, String mbnumber, String pswd)
	{
		//driver.switchTo().frame(homepageiframe)//if in case frame we can use this.driver in page factory
		signup.click();
		this.fstname.sendKeys(fstname);
		this.surname.sendKeys(surname);
		this.mbnumber.sendKeys(mbnumber);
		this.pswd.sendKeys(pswd);
		new Select(dd).selectByIndex(2);
		new Select(mn).selectByIndex(2);
		new Select(yy).selectByIndex(2);
		
	}
	
}
