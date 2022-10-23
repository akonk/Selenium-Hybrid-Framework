package TestCases;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import objectPages.LoginPage;


public class LoginTest__TC002 extends BaseClass {

	//Login By Google Oauth
	//Login By EMail
	//Login By Mobile Number
	
	
	
	@Test
	public void LoginTest() throws InterruptedException {
	LoginPage login = new LoginPage(driver);
	login.citysearchClear();
	login.SendCityName("Pu");
	Thread.sleep(3000);
    login.SendEnterKeys(Keys.ENTER);
    
    System.out.println("city Search Okay.");
    
    Thread.sleep(2000);
    
    login.SignIn();
    System.out.println("SignIn Button Pressed Okay.");
    
    
	login.EmailLogin();
	System.out.println("Email Login Button Pressed Okay.");
	 
	login.EmailIdInput("atulkondhare001@gmail.com");
	System.out.println("Email Id Entered Okay.");
	

	Thread.sleep(10000);
	 
	login.EmailSubmit();
	System.out.println("Email id Submitted.");
	
    Thread.sleep(10000);
    
	login.LoginSuccess();
	System.out.println("LoginSuccess Is OKay.");
	
	String Loginmsg=login.FindProfile();
	
	String Message="Hi";
	
	if(Loginmsg.equals(Message)) {
		
		System.out.println("Yes Profile Logged In.");
	}
	
	else {
		System.out.println("Yes Profile Not Logged In.");
		
		
	}
	 
	}
	
	
	
	
	
	
	
}
