package objectPages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	
	WebDriver ldriver;
	
	JavascriptExecutor executor;
	WebDriverWait wait40;

 	
	 public LoginPage(WebDriver rdriver){
		 
		 ldriver = rdriver;
		 this.executor = (JavascriptExecutor) this.ldriver;
		 this.wait40 = new WebDriverWait(ldriver, Duration.ofSeconds(30));

		 PageFactory.initElements(rdriver, this);
	 }

	     //City Search
	 
		@FindBy (xpath="//input[@placeholder='Search for your city']")
		 
		 WebElement city;
		
		
	 //Sign-In Button On Home Page.
	 
	 @FindBy (xpath="//*[@id=\"super-container\"]/div[2]/header/div[1]/div/div/div/div[2]/div[2]/div[1]")
	 
	  WebElement SignInButton;
	 
	 
	 // Login By Google Oauth.
	
	//  @FindBy (xpath="//*[@id=\"signinPopup\"]/div/div[2]/div/aside[1]/div[1]/a[2]/div/div")
	 
   //   WebElement SignInByGoogle;
	 

	 //Login By Email-Id.
		 
	  @FindBy (xpath="//div[contains(text(),'Continue with Email')]")
	 
	  WebElement SignInByEmail;
	 
	  
	  //Login using Email-Id Input By User.
		 
	  @FindBy (id="emailId")
	 
	  WebElement EmailidInput;
	  
	  
	  @FindBy (xpath="//button[@class='sc-hORach dSbYDX']")
		 
	  WebElement EmailSubmitBtn;
	  

	  @FindBy (xpath="//*[@id=\"super-container\"]/header/div[1]/div/div/div/div[2]/div[2]/img")
		 
	  WebElement ProfileLogin;
	  

	  @FindBy (xpath="//*[@id=\"super-container\"]/div[2]/div[2]/div[2]/div/div[1]/div/div[1]/div[1]/div")
		  
	  WebElement FindProfileName;
	  
	  
	//Login using Mobile number Input By User.
		
	//  @FindBy (id="iUserName")
		 
	// WebElement MobileInput;
	  
	  
	// @FindBy (xpath="//*[@id=\"login-loading-state\"]/span")
		 
	//  WebElement MobileOtpSubmitBtn;  
	  
	  
	  public void citysearchClear() {
			
			city.clear();
			
	}
		
		 public void SendCityName(String Pu ) {
			  
			  city.sendKeys(Pu);
		  }
		 

		

		 public void SendEnterKeys(Keys Enterkeys ) {
			  
			  city.sendKeys(Enterkeys);
		  }


	 
	 
	 public void SignIn() {
		 
		 SignInButton.click();
	 }
     
	 
		 // public void GoogleLogin() {
		  
		 // SignInByGoogle.click(); }
		 
	 
		
	  public void EmailLogin() {
		  
		  SignInByEmail.click();
	  }
      
	  public void EmailIdInput(String Email ) {
		  
		  EmailidInput.sendKeys(Email);
	  }
	  
	  public void EmailSubmit() {
		  
		  EmailSubmitBtn.click();
		  
		  
	  }
	  

		public void LoginSuccess() {
	
			ProfileLogin.click();
			
			

		}  
		
		public String FindProfile() {
		
			String abc = FindProfileName.getText();
			return abc;
		}
		  


}
