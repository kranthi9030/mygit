package properties_package;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Properties_class {

	public static void main(String[] args)
	{
		try {
			FileInputStream fi=new FileInputStream("Test-data//Inputdata.properties");
			Properties obj=new Properties();
			obj.load(fi);	
			//Application
			String App_Url=obj.getProperty("app_url");
			WebDriver driver=new FirefoxDriver();
			driver.get(App_Url);
			driver.manage().window().maximize();
			//Admin_locators
			String uid_xpath=obj.getProperty("A_username_xpath");
			String password_xpath=obj.getProperty("A_password_xpath");
			String login=obj.getProperty("A_login_xpath");
			//Admi_Inputdata
			String A_uid_input=obj.getProperty("A_uid");
			String A_pwd_input=obj.getProperty("A_pswd");
			driver.findElement(By.xpath(uid_xpath)).sendKeys(A_uid_input);
			driver.findElement(By.xpath(password_xpath)).sendKeys(A_pwd_input);
			driver.findElement(By.xpath(login)).click();
			
			//Branches
			//Branch locators---getvalues from Input.properties
			String branches_xpath=obj.getProperty("Branch_btn_xpath");
			String new_branch_btn_xpath=obj.getProperty("newbranch_btn_xpath");
			String Branch_name_xpath=obj.getProperty("Branch_name_xpath");
			String Branch_Address1_xpath=obj.getProperty("Branch_Address1_xpath");
			String Branch_Address2_xpath=obj.getProperty("Branch_Address1_xpath");
			String Branch_Address3_xpath=obj.getProperty("Branch_Address3_xpath");
			String Branch_Area_xpath=obj.getProperty("Branch_Area_xpath");
			String Branch_Zipcode_xpath=obj.getProperty("Branch_Zipcode_xpath");
			String Branch_Country_xpath=obj.getProperty("Branch_Country_xpath");
			String Branch_State_xpath=obj.getProperty("Branch_State_xpath");
			String Branch_City_xpath=obj.getProperty("Branch_City_xpath");
			
			String Branch_submit_xpath=obj.getProperty("Branch_submit_xpath");
			String Branch_cancel_xpath=obj.getProperty("Branch_cancel_xpath");
			String Branch_Reset_xpath=obj.getProperty("Branch_Reset_xpath");
			
			//Branch Inputdata---getvalues from Input.properties
			
			String Branch_Name=obj.getProperty("Branch_Name");
			String Address1=obj.getProperty("Address1");
			String Address2=obj.getProperty("Address2");
			String Address3=obj.getProperty("Address3");
			String Area=obj.getProperty("Area");
			String Zipcode=obj.getProperty("Zipcode");
			String Country=obj.getProperty("Country");
			String State=obj.getProperty("State");
			String City=obj.getProperty("City");
			
			//branch_creation---Pass values to Webdriver
			
			driver.findElement(By.xpath(branches_xpath)).click();
			driver.findElement(By.xpath(new_branch_btn_xpath)).click();
			driver.findElement(By.xpath(Branch_name_xpath)).sendKeys(Branch_Name);
			driver.findElement(By.xpath(Branch_Address1_xpath)).sendKeys(Address1);
			driver.findElement(By.xpath(Branch_Address2_xpath)).sendKeys(Address2);
			driver.findElement(By.xpath(Branch_Address3_xpath)).sendKeys(Address3);
			driver.findElement(By.xpath(Branch_Area_xpath)).sendKeys(Area);
			driver.findElement(By.xpath(Branch_Zipcode_xpath)).sendKeys(Zipcode);
			new Select(driver.findElement(By.xpath(Branch_Country_xpath))).selectByValue(Country);
			new Select(driver.findElement(By.xpath(Branch_State_xpath))).selectByVisibleText(State);
			new Select(driver.findElement(By.xpath(Branch_City_xpath))).selectByVisibleText(City);
			driver.findElement(By.xpath(Branch_submit_xpath)).click();
			//driver.findElement(By.xpath(Branch_cancel_xpath)).click();
			//driver.findElement(By.xpath(Branch_Reset_xpath)).click();
			Alert alrt=driver.switchTo().alert();
			String Alert_msg=alrt.getText();
			System.out.println(Alert_msg);
			alrt.accept();
			
			
			//Roles
			
			//Roles Locators--getlocatros from propertyfile
			String Roles_btn_xpath=obj.getProperty("Roles_btn_xpath");
			
			String New_role_btn_xpath=obj.getProperty("New_role_btn_xpath");
			
			
			String Rolename_xpath=obj.getProperty("Rolename_xpath");
			String RoleDec_xpath=obj.getProperty("RoleDec_xpath");
			String RoleType_xpath=obj.getProperty("RoleType_xpath");
			String Role_submit_xpath=obj.getProperty("Role_submit_xpath");
			
			//Roles Inputdata--get data from property file
			String Role_Name=obj.getProperty("Role_Name");
			String Role_Desp=obj.getProperty("Role_Desp");
			String Role_type=obj.getProperty("Role_type");
			
			//Rolecreatin--pass values to webdriver
			
			driver.findElement(By.xpath(Roles_btn_xpath)).click();
			driver.findElement(By.xpath(New_role_btn_xpath)).click();
			driver.findElement(By.xpath(Rolename_xpath)).sendKeys(Role_Name);
			driver.findElement(By.xpath(RoleDec_xpath)).sendKeys(Role_Desp);
			new Select(driver.findElement(By.xpath(RoleType_xpath))).selectByValue(Role_type);
			driver.findElement(By.xpath(Role_submit_xpath)).click();
			
			Alert alrt_role=driver.switchTo().alert();
			String Alert_msg_role=alrt.getText();
			System.out.println(Alert_msg_role);
			alrt_role.accept();
			
			//Screenshot
			
		
			//Employee
			
			//Employee---->>Locators
			String Employee_btn_xpath=obj.getProperty("Employee_btn_xpath");
			String New_Employee_btn_xpath=obj.getProperty("New_Employee_btn_xpath");
			String Employer_Name_xpath=obj.getProperty("Employer_Name_xpath");
			String Employee_Login_Password_xpath=obj.getProperty("Employee_Login_Password_xpath");
			String Employee_Role_xpath=obj.getProperty("Employee_Role_xpath");
			String Employee_Branch_xpath=obj.getProperty("Employee_Branch_xpath");
			String Employee_submit_xpath=obj.getProperty("Employee_submit_xpath");
			//String Employee_cancel_xpath=obj.getProperty("Employee_cancel_xpath");
			//String Employee_Reset_xpath=obj.getProperty("Employee_Reset_xpath");
		
			//Employee------Inputdata
			String Employee_Name=obj.getProperty("Employee_Name");
			String Employee_password=obj.getProperty("Employee_password");
			String Emp_Role=obj.getProperty("Emp_Role");
			String Emp_Branch=obj.getProperty("Emp_Branch");
			
			//Employee Creation --Pass the values to webdriver
			
			driver.findElement(By.xpath(Employee_btn_xpath)).click();
			driver.findElement(By.xpath(New_Employee_btn_xpath)).click();
			driver.findElement(By.xpath(Employer_Name_xpath)).sendKeys(Employee_Name);
			driver.findElement(By.xpath(Employee_Login_Password_xpath)).sendKeys(Employee_password);
			new Select(driver.findElement(By.xpath(Employee_Role_xpath))).selectByValue(Emp_Role);
			new Select(driver.findElement(By.xpath(Employee_Branch_xpath))).selectByValue(Emp_Branch);
			driver.findElement(By.xpath(Employee_submit_xpath)).click();
			//driver.findElement(By.xpath(Employee_cancel_xpath)).click();
			//driver.findElement(By.xpath(Employee_Reset_xpath)).click();
			
			Alert alrt_EMP=driver.switchTo().alert();
			String Alert_msg_EMP=alrt.getText();
			System.out.println(Alert_msg_EMP);
			alrt_EMP.accept();
			
			//Alert validation
			String Actual="Employer Already Existed...Try again";

			if (Actual.equals(Alert_msg_EMP)) 
			{
				System.out.println("testpass");
			}
			
			//Screen Shot
			try {
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("data\\Emp.png"));
						
				
			} catch (Exception e) {
			e.printStackTrace();
			}		
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
