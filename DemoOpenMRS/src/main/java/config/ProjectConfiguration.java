package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ProjectConfiguration {

	/**
	 * Method to load properties from config file
	 * @return 
	 * @throws IOException 
	 */
	
	public Properties loadProperties() 
	{
		String filepath=System.getProperty("user.dir")+"\\config\\config.properties";
		System.out.println(filepath);
		File src=new File(filepath);
		
		//Create FileInputStream Object
		
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//create properties class object to read properties file
		Properties pro=new Properties();
		
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pro;
		
		
		
	}
}
