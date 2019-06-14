package testcases;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.DriverInstance;
import pages.LoginPage;

public class TC_003_login_data_excel extends DriverInstance {



	@Test (dataProvider ="Excel")
	public void TC_001_loginfunctionality(String uname, String password) throws Exception
	{
		LoginPage login=new LoginPage(driver);
		login.enterusername(uname);
		login.enterpassword(password);
		login.clickonLoginButton();
		System.out.println("Running class = TC_003_login_data_excel");
				
	}
	// this will login with sa1 > close browser > login with ca1> repeate as per excel data
	
		@DataProvider(name="Excel")
		public Object[][] testdatagenrator() throws Exception
		{
			FileInputStream file = new FileInputStream("./TestData/TestData.xlsx");
			XSSFWorkbook workbook =new XSSFWorkbook(file);
			XSSFSheet loginsheet =workbook.getSheet("Login");
			int numberofdata=loginsheet.getPhysicalNumberOfRows();
			
			Object [][] testdata= new Object[numberofdata][2];
			for (int i =0; i<numberofdata; i++)
			{
				XSSFRow row=loginsheet.getRow(i);
				XSSFCell username=row.getCell(0);
				XSSFCell password=row.getCell(1);
				testdata [i][0]=username.getStringCellValue();
				testdata [i][1]=password.getStringCellValue();
			}
				return testdata;	


					
					
					
		}
		
	
	
	
	
	
	
	
	
}
