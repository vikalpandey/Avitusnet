package testcases;
//in this class we are login through id & pw which is written in excel & data genrator is in differnent class 
//similor to(TC_003_login_data_excel )but data genratoe class is in different package
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.DriverInstance;
import data_Genrator.DataGenrator_login_excel;
import pages.LoginPage;
public class TC_003_login_data_excel_usingdatagen extends DriverInstance {

		@Test (dataProvider ="Excel", dataProviderClass=DataGenrator_login_excel.class)
		public void TC_001_loginfunctionality(String uname, String password) throws Exception
		{
			LoginPage login=new LoginPage(driver);
			login.enterusername(uname);
			login.enterpassword(password);
			login.clickonLoginButton();
			System.out.println("Running class = TC_003_login_data_excel_usingdatagen");
					
		}
		// this will login with sa1 > close browser > login with ca1> repeate as per excel data
				
	}


