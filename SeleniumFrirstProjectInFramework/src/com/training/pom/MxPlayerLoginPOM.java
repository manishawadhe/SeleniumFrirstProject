package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MxPlayerLoginPOM {
	private WebDriver driver; 
	
	public MxPlayerLoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="login-button")
	private WebElement loginBtn; 
	
	@FindBy(className="phone-input")
	private WebElement mobInput; 
	
	@FindBy(xpath ="//button[@class='submit']")
	private WebElement nextBtn; 
	
	@FindBy(xpath ="//input[@type='text'][1]")
	private WebElement inputOne; 
	
	@FindBy(xpath ="//input[@type='text'][2]")
	private WebElement inputTwo; 
	
	@FindBy(xpath ="//input[@type='text'][3]")
	private WebElement inputThree; 
	
	@FindBy(xpath ="//input[@type='text'][4]")
	private WebElement inputFour;
	
	@FindBy(xpath ="//button[@class='submit disabled']")
	private WebElement finalLoginBtn;
	
	@FindBy(xpath ="//div[@class='google']")
	private WebElement googleBtn;
	
	@FindBy(xpath ="//div[@class='facebook']")
	private WebElement facebookBtn;
	

	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void sendMobNumber(String num) {
		this.mobInput.clear();
		this.mobInput.sendKeys(num);
	}
	
	public void clickNextBtn() {
		this.nextBtn.click(); 
	}
	
	public void sendInputOne(String num) {
		this.inputOne.clear();
		this.inputOne.sendKeys(num);
	}
	
	public void sendInputTwo(String num) {
		this.inputTwo.clear();
		this.inputTwo.sendKeys(num);
	}
	
	public void sendInputThree(String num) {
		this.inputThree.clear();
		this.inputThree.sendKeys(num);
	}
	
	public void sendInputFour(String num) {
		this.inputFour.clear();
		this.inputFour.sendKeys(num);
	}
	
	public void clickFinalLoginBtn() {
		this.finalLoginBtn.click(); 
	}
	
	public void clickGoogleBtn() {
		this.googleBtn.click(); 
	}
	
	public void clickFacebookBtn() {
		this.facebookBtn.click(); 
	}
}
