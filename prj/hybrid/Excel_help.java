package hybrid_framework;


import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Excel_help 
{
	public static WebDriver driver;
	
	public static void helper_class(String filename, String sheetname)
	{
		Excel_connection.E_connection(filename, sheetname);
		
		String app_url=Excel_connection.get_celldata(1, 0);
		
		driver=new FirefoxDriver();
		driver.get(app_url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	public static void helper_Admin(String filename, String sheetname)
	{
		Excel_connection.E_connection(filename, sheetname);
		
		/*	
		  Row rc=Excel_connection.sht.getRow(0);
	  int cc=rc.getLastCellNum();
	  System.out.println(cc)
		int rc=Excel_connection.sht.getLastRowNum();
		System.out.println(rc);
		 */		
		
		for (int i =1; i <=Excel_connection.sht.getLastRowNum(); i++) 
		{
			String proname=Excel_connection.get_celldata(i, 1);
			String provalue=Excel_connection.get_celldata(i, 2);
			String action=Excel_connection.get_celldata(i, 3);
			String inputdata=Excel_connection.get_celldata(i, 4);
			switch (action) {
			case "Textbox":
			WebElement ele1=driver.findElement(Excel_Locators.E_locators(proname, provalue));
			ele1.clear();
			ele1.sendKeys(inputdata);
			break;
			case "click":
				driver.findElement(Excel_Locators.E_locators(proname, provalue)).click();
				
				break;
			case "DropDown":
			Select ele3=new Select(driver.findElement(Excel_Locators.E_locators(proname, provalue)));
			ele3.selectByValue(inputdata);
			break;
			
			case "Alert":
				Alert alrt=driver.switchTo().alert();
				System.out.println(alrt.getText());
				alrt.accept();
				
				break;
				
			case "screenshot":
			DateFormat df=new SimpleDateFormat("yyyy/MM/dd/ hh-mm-ss");
			Date d=new Date();
			String time=df.format(d);
			try {
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("frame//"+time+" branch.png"));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
			
				
			default:
				break;
			}//switch close
		}//for-close
	}//helper-admin-close
	
	/*public static void screen_shot(String image)
	{
		DateFormat df=new SimpleDateFormat("yyyy/MM/dd/ hh-mm-ss");
		Date d=new Date();
		String time=df.format(d);
		try {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("frame//"+time+" "+image+".png"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

}
