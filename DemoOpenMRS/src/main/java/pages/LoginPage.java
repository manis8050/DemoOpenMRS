package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.InvokeBrowser;
import locators.LoginLocator;

public class LoginPage extends LoginLocator{
	
	WebDriver driver;
	
	

	public  LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void doLogin()
	{
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).sendKeys("Admin123");
		driver.findElement(wardName).click();
		driver.findElement(loginBtn).click();
	}
	

}
