package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import locators.FindPatientRecordLocator;

public class FindPatientPage extends FindPatientRecordLocator {
	WebDriver driver;
	
	public FindPatientPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void patientSearch(String patientName)
	{
		driver.findElement(findPntRecordBtn).click();
		String actual=driver.findElement(breadCrumbs).getText();
		String expected="Find Patient Record";
		Assert.assertEquals(actual, expected);
		driver.findElement(searchBox).sendKeys(patientName);
		driver.findElement(searchResult).click();
	}

}
