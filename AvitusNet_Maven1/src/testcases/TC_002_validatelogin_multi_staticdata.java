package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Base.DriverInstance;
import pages.LoginPage;

public class TC_002_validatelogin_multi_staticdata extends DriverInstance {


	@Test (dataProvider ="static")
	public void TC_001_loginfunctionality(String uname, String password) throws Exception
	{
		LoginPage login=new LoginPage(driver);
		login.enterusername(uname);
		login.enterpassword(password);
		login.clickonLoginButton();
				
	}
	// this will login with sa1 > close browser > login with ca1> repeate 
	
		@DataProvider(name="static")
		public Object[][] testdatagenrator()
		{
			Object[][] data ={{"sa1@gmail.com","User@1234"},{"ca1@gmail.com","User@1234"},{"emp1@gmail.com","User@1234"}};
			return data;
		}
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
}
