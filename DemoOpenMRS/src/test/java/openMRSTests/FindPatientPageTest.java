package openMRSTests;

import java.util.Properties;

import org.testng.annotations.Test;

import base.InvokeBrowser;
import config.ProjectConfiguration;
import pages.FindPatientPage;
import pages.LoginPage;

public class FindPatientPageTest extends InvokeBrowser{

	@Test
	public void patientSearchTest()
	{
		LoginPage lObj=new LoginPage(driver);
		lObj.doLogin();
		FindPatientPage pObj=new FindPatientPage(driver);
		ProjectConfiguration pConfig=new ProjectConfiguration();
		Properties pro=pConfig.loadProperties();
		String patientName=pro.getProperty("patientName");
		
		pObj.patientSearch(patientName);
		
	}

	
}
