package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utility1.Utility;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)// create a constructor for passing the webdriver object to all methods
	{	                             // jo bhi is class ka object banayega vo driver pass karega
		this.driver=driver;         // passing this driver value to global driver variable 
	}

	public void enterusername(String uname) throws Exception
	{
		driver.findElement(By.xpath(Utility.fetchlocatorvalue("login_username_xpath"))).sendKeys(uname);	
	}
	
	public void enterpassword(String password) throws Exception
	{
		driver.findElement(By.xpath(Utility.fetchlocatorvalue("login_password_xpath"))).sendKeys(password);
	}
	public void clickonLoginButton() throws Exception
	{
		driver.findElement(By.xpath(Utility.fetchlocatorvalue("login_loginbutton_xpath"))).click();
	}
	
	
	
	
	
}
