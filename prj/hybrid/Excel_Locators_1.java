package hybrid_framework;

import org.openqa.selenium.By;

public class Excel_Locators 
{
	public static By E_locators(String proname, String provalue)
	{
		By obj=null;
		switch (proname) 
		{
		case "ID":
			obj=By.id(provalue);
			
			break;
		case "Xpath":
			obj=By.xpath(provalue);
			break;
		default:
			break;
			
		}
		return obj;
	}

}
