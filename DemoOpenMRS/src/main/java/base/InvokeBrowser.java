package base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import config.ProjectConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeBrowser {
	
	public WebDriver driver;
	
	@BeforeClass
	public void instantiateDriver()
	{
		
   ProjectConfiguration pConfig=new ProjectConfiguration();
	Properties pro=pConfig.loadProperties();
	String url=pro.getProperty("url");
	String browserType=pro.getProperty("browserType");
	if (browserType.equals("chrome"))
				{
			     WebDriverManager.chromedriver().setup();
			     driver=new ChromeDriver();
			
				}
		else if(browserType.equals("FF"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
	}
	
	

}
