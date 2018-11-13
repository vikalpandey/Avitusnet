package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_001_logintest {

	ChromeDriver f;
	@BeforeMethod
	public void beforemethod()
	{
		System.setProperty("webdriver.chrome.driver","D:/2 Selenium/SW/chromedriver.exe");
		 f=new ChromeDriver();
	}
	
	@Test
	public void Test1() throws Exception
	{
		f.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		f.navigate().to("http://10.12.0.94:82/");
		f.manage().window().maximize();
		f.findElementByXPath("//input[@id='UserName']").sendKeys("ca1@gmail.com");
		f.findElementByXPath("//input[@id='planPassword']").sendKeys("User@1234"); 
		
		f.findElementByXPath("//input[@value='LOGIN']").click();
		Thread.sleep(5000);
		f.findElementByXPath("//a[contains(@class,'adminWrap active')]").click();
		System.out.println("clicked on admin tab");
		Thread.sleep(4000);
		f.quit();
		
		
}}

