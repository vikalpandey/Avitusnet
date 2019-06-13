package testcases;

import org.testng.annotations.Test;

import Base.DriverInstance;
import pages.LoginPage;

public class TC_001_Validateloginfunctionality extends DriverInstance
{

	@Test
	public void TC_001_loginfunctionality() throws Exception
	{
		LoginPage login=new LoginPage(driver);
		login.enterusername("sa1@gmail.com");
		login.enterpassword("User@1234");
		login.clickonLoginButton();
		System.out.println("Running class = TC_001_Validateloginfunctionality");
				
		
	}
	
	
	
	
}
