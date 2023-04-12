package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.LogoutPOM;
import com.training.pom.MxPlayerLoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MxPayerLoginTests {

	private WebDriver driver;
	private String baseUrl;
	private MxPlayerLoginPOM mxLoginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	

	

	@BeforeTest
	public void setUp() throws Exception {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		mxLoginPOM = new MxPlayerLoginPOM(driver);
		
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		
	}
	@Test(priority = 0)
	public void loginTest() {
		mxLoginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
	}
	
	@Test(priority = 1)
	public void sendMobNumber() {
		mxLoginPOM.sendMobNumber("8975688865");
		screenShot.captureScreenShot("First");
	}
	
	@Test(priority = 2)
	public void nextBtnTest() {
		mxLoginPOM.clickNextBtn(); 
		screenShot.captureScreenShot("First");
	}
	
	@Test(priority = 3)
	public void sendInputOne() {
		mxLoginPOM.sendInputOne("");
		screenShot.captureScreenShot("First");
	}
	
	@Test(priority = 4)
	public void sendInputTwo() {
		mxLoginPOM.sendInputTwo("");
		screenShot.captureScreenShot("First");
	}
	
	@Test(priority = 5)
	public void sendInputThree() {
		mxLoginPOM.sendInputThree("");
		screenShot.captureScreenShot("First");
	}
	
	@Test(priority = 6)
	public void sendInputFour() {
		mxLoginPOM.sendInputFour("");
		screenShot.captureScreenShot("First");
	}
	
	@Test(priority = 7)
	public void finalLoginBtn() {
		mxLoginPOM.clickFinalLoginBtn();
		screenShot.captureScreenShot("First");
	}
	
	@Test(priority = 8, enabled = false)
	public void googleBtn() {
		mxLoginPOM.clickGoogleBtn();
		screenShot.captureScreenShot("First");
	}
	
	@Test(priority = 9, enabled = true)
	public void facebookBtn() {
		mxLoginPOM.clickFacebookBtn(); 
		screenShot.captureScreenShot("First");
	}
	


	
	

}
