package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import Utility1.Utility;

public class DriverInstance {

	public WebDriver driver;
	
	@BeforeMethod
	public void initiateDriverInstance() throws Exception
	{
		
		if (Utility.fetchpropertyvalue("browserName").toString().equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if (Utility.fetchpropertyvalue("browserName").toString().equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if (Utility.fetchpropertyvalue("browserName").toString().equalsIgnoreCase("IE")) 
		{
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		} 
		else {
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			driver= new ChromeDriver();
		}
		
		driver.get(Utility.fetchpropertyvalue("applicationURL").toString());   //utility method return the object so we convert it to String
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeDriverInstance()
	{
		driver.quit();
	}
	
	
	@AfterSuite
	public void genratereport()
	{
		
	}
	
	
	
	
}
