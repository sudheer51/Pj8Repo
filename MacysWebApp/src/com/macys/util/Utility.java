package com.macys.util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Utility {
	
	static WebDriver driver;
	public static Properties pro;
	public static void loadPropertiesFile() throws IOException
	{
		  //Adding comments for new branch
		 	  File src=new File("Object_Repo.properties");

	 
		  FileInputStream fis=new FileInputStream(src);

		  // Create Properties class object to read properties file
		   pro=new Properties();

		  // Load file so we can use into our script 
		  pro.load(fis);

	}
	public static WebDriver getWebDriverInstance()
	{
		
		if(driver==null)
		{
			System.out.println("in if");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		return driver;
	}

}
