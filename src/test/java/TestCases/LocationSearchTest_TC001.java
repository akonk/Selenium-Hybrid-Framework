package TestCases;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import BaseTest.BaseClass;
import objectPages.LocationSearch;

public class LocationSearchTest_TC001 extends BaseClass {

	
	@BeforeTest
	public void StartTest() {
		
		initializeReport();
	}
	
	
	@Test
	public void LocationSearch() throws InterruptedException {
		

		String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName,"LocationSearch");
        test.log(Status.INFO,"Location Test Starting");
        test.log(Status.INFO,"We Are Searching Pune City Location.");
        test.assignCategory("P0");
		
		LocationSearch City = new LocationSearch(driver);
		City.citysearchClear();
		City.SendCityName("Pu");
		Thread.sleep(3000);
	    City.SendEnterKeys(Keys.ENTER);
	    
	    String UrlTest="https://in.bookmyshow.com/explore/home/pune";
	    
	    String GetUrl=driver.getCurrentUrl();
	    
	    
	    if(UrlTest.equals(GetUrl)) {
		

		test.log(Status.PASS,"We Got Pune City Location Successfully.");
		
	}else {
		
		test.log(Status.FAIL,"We not getting Pune City Location.");
		
	}
	    
}
}