package hybrid_framework;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Hybrid_Test 
{
	@Test(priority=0)
	public static void app_launch()
	{
		Excel_help.helper_class("hybrid_excel.xlsx", "URL");
		Reporter.log("application launched", true);
		
	}
	@Test(priority=1)
	public static void login()
	{
		Excel_help.helper_Admin("hybrid_excel.xlsx", "Admin");
		
	}
	@Test(priority=2)
	public static void branch_create()
	{
		Excel_help.helper_Admin("hybrid_excel.xlsx", "Branch");
	}
	@Test(priority=3)
	public static void role_craete()
	{
		Excel_help.helper_Admin("hybrid_excel.xlsx", "Role");
	}
	@Test(priority=4)
	public static void Employ_create()
	{
		Excel_help.helper_Admin("hybrid_excel.xlsx", "Employee");
	}
	/*@AfterMethod
	public static void capt()
	{
		Excel_help.screen_shot("test");
	}*/
	
}
