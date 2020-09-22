package locators;

import java.util.Properties;

import org.openqa.selenium.By;

import config.ProjectConfiguration;

public class FindPatientRecordLocator {
	public static By findPntRecordBtn=By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension");
	public static By breadCrumbs=By.xpath("//ul[@id='breadcrumbs']/li[2]");
	public static By searchBox=By.id("patient-search");
	static ProjectConfiguration pObj=new ProjectConfiguration();
	static Properties pro=pObj.loadProperties();
	static String patientName=pro.getProperty("patientName");
	
	
	public static By searchResult=By.xpath("//td[contains(text(),'"+patientName+"')]");
	public static By patientID=By.xpath("//td[contains(text(),'"+patientName+"')]");
	
	
}
