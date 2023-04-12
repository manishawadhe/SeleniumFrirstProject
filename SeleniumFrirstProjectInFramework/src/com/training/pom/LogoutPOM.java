package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOM {
	private WebDriver driver; 
	
	public LogoutPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="oxd-userdropdown-tab")
	private WebElement dropDown; 
	
	@FindBy(xpath="//*[contains(text(),'Logout')]")
	private WebElement logoutBtn;
	
	
	public void clickOnDropdown() {
		dropDown.click();
		logoutBtn.click();
	}

}
