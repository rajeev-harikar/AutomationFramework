package com.upermits.scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.upermits.pom.LoginPage;



public class Loginlogout extends SuperTestNG {
	
	@Test
	public void login() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		

	lp.login("rajeev@cognitiveclouds.com","123456789");

	}
	
	
	}
