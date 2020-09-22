package openMRSTests;

import org.testng.annotations.Test;

import base.InvokeBrowser;
import pages.LoginPage;

public class LoginPageTest extends InvokeBrowser{

	@Test
	public void LoginTest()
	{
		LoginPage lObj=new LoginPage(driver);
		lObj.doLogin();
	}

	
}
