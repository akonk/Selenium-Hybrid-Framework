package objectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationSearch {
	
	

	WebDriver ldriver;
	
	 public LocationSearch(WebDriver rdriver){
		 
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	
	//City Search Box 
	
	@FindBy (xpath="//input[@placeholder='Search for your city']")
	 
	 WebElement city;
	
	
	public void citysearchClear() {
	
		city.clear();
		
}
	
	 public void SendCityName(String Pu ) {
		  
		  city.sendKeys(Pu);
	  }
	 

	

	 public void SendEnterKeys(Keys Enterkeys ) {
		  
		  city.sendKeys(Enterkeys);
	  }



}