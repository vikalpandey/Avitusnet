package assertion;

import org.openqa.selenium.WebDriver;

public class Compare {

	public static boolean validatePageURL(WebDriver driver, String expURL)
	{
		boolean flag=false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expURL)) 
		{
			flag=true;
		}
		return flag;
	}
	
	public static boolean validatePageTitle(WebDriver driver, String exptitle)
	{
		boolean flag=false;
		if (driver.getTitle().equalsIgnoreCase(exptitle))
		{
			flag=true;
		}
		return flag;
	}
	
	
	
	
	
	
	
}
