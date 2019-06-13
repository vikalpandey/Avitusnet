package data_Genrator;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenrator_login_excel {
	
	@DataProvider(name="Excel")
	public static Object[][] testdatagenrator() throws Exception
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
