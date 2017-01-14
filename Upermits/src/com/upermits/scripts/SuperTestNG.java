package com.upermits.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SuperTestNG {
	
	public WebDriver driver;
	
	@BeforeClass
	public void preCondition()
	{
	System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://52.32.149.146/users/sign_in");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void postCondition()
	{
		driver.close();
	}	

}
